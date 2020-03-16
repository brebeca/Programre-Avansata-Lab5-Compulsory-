package com.company;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Document extends JFrame implements ActionListener  {
    String name =new String() ;
    String location =new String();
    int id;
    Map<String,String> tags= new HashMap<>();
    static JFrame f;

    /* Constructori */
    public Document(){}
    public Document(String text, String location, int id, Map<String,String> tags) {
        this.name = text;
        this.location=location;
        this.id=id;
        this.tags=tags;
    }


    /**Functia view*/
    public  void  view(int inaltime, int latime)
    {
        Document document = new Document();
        f = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        button.addActionListener(document);
        panel.add(button);
        f.add(panel);
        f.show();
        f.setSize(inaltime, latime);
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        try {
            File file = new File("C:\\Users\\iRebeca\\Desktop\\logo");

            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        }
        catch (Exception evt) {
            JOptionPane.showMessageDialog(this, evt.getMessage());
        }
    }
}
