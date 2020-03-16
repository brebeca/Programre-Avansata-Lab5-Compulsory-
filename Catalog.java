package com.company;

public class Catalog implements java.io.Serializable  {
    String entery = new String();

    public Catalog(String text) {
        this.entery = text;
    }

    public String getText() {
        return entery;
    }
}
