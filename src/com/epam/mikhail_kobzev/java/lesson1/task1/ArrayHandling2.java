package com.epam.mikhail_kobzev.java.lesson1.task1;

import java.util.ArrayList;

import static java.lang.Math.random;

/**
 * Created by Mike on 10.02.2018.
 */
public class ArrayHandling2 {
    public static void main(String[] args) {
        ArrayHandling2 app = new ArrayHandling2();
        app.startApplication2();
    }

    public void startApplication2() {
        ArrayList<Integer> array = generateArray();
        Integer sum = 0;
        for (int i = 1; i < array.size(); i+=2){
            sum += array.get(i);
        }
        System.out.print(sum);
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
