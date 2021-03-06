package com.epam.mikhail_kobzev.java.lesson6.model;

import java.io.*;

/**
 * Created by Mike on 01.06.2018.
 */

public class Connector implements Runnable{

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
        try (ObjectInputStream in =  new ObjectInputStream (new FileInputStream("serialize_object.txt"))) {
            return in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
