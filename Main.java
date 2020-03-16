package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class Main {

    public static void main(String[] args) {

        Catalog catalog =new Catalog("Acesta este un catalog.");
        ExternalIO externalIO= new ExternalIO();
        //System.out.println(externalIO.save("C:\\Users\\iRebeca\\IdeaProjects\\catalog.txt",catalog));
        //System.out.println(externalIO.load("C:\\Users\\iRebeca\\IdeaProjects\\catalog.txt"));
        Document d=new Document();
        d.view(400,400);
    }


}
