package com.company.designpatterns.factory;

public class ReaderFactory {

    public static Reader getReader(String readerName){
        Reader reader = null;
        if(readerName.equalsIgnoreCase("XML")){
            reader = new XmlReader();
        }else if (readerName.equalsIgnoreCase("JSON")){
            reader = new JsonReader();
        }else if (readerName.equalsIgnoreCase("DB")){
            reader = new DbReader();
        }

        return reader;
    }
}
