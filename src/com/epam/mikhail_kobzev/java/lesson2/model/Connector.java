package com.epam.mikhail_kobzev.java.lesson2.model;

import java.io.*;

/**
 * Created by Mike on 25.05.2018.
 */

public class Connector extends Thread{

    private Object object;

    public Connector() throws IOException {
    }

    public Object getObject() {
        return object;
    }


    @Override
    public void run() {
        object =  readSerializeObject();
    }

    public void writeSerializeObject(Object o){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialize_object.txt"))) {
            out.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object readSerializeObject(){
        try (ObjectInputStream in =  new ObjectInputStream(new FileInputStream("serialize_object.txt"))) {
            return in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}