package com.epam.mikhail_kobzev.java.lesson1.task1;

import java.util.ArrayList;

import static java.lang.Math.random;

/**
 * Created by Mike on 10.02.2018.
 */
public class ArrayHandling4 {
    public static void main(String[] args) {
        ArrayHandling4 app = new ArrayHandling4();
        app.startApplication();
    }

    public void startApplication() {
        ArrayList<Integer> array = generateArray();
        for (int i = 0; i < array.size()-1; i++){
            if (array.get(i).compareTo(0) == 1 && array.get(i+1).compareTo(0) == -1){
                array.set(i,array.get(i)*3);
            }
        }
        System.out.print(array);
    }

    private ArrayList<Integer> generateArray(){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add((int)(random() * 20 - 10));
        }
        System.out.println(arr);
        return arr;
    }
}
