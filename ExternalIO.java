package com.company;
import java.io.*;
public class ExternalIO {

    public  String load(String filename){
        Catalog catalog = null;
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            catalog = (Catalog) in.readObject();

            in.close();
            file.close();
            return ("Catalogul a fost deserializat : "+  catalog.getText());
        }

        catch(IOException ex)
        {
            return "IOException caught";
        }

        catch(ClassNotFoundException ex)
        {
            return "ClassNotFoundException caught";
        }

    }





    public String save( String filename, Catalog document)
    {

        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(document);

            out.close();
            file.close();

            return "Catalogul a fost salvat cu succes";

        }

        catch(IOException ex)
        {
            return "IOException caught";
        }

    }
}
