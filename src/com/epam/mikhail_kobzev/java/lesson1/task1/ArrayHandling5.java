package com.epam.mikhail_kobzev.java.lesson1.task1;

import java.util.ArrayList;

import static java.lang.Math.random;

/**
 * Created by Mike on 10.02.2018.
 */
public class ArrayHandling5 {
    public static void main(String[] args) {
        ArrayHandling5 app = new ArrayHandling5();
        app.startApplication();
    }

    public void startApplication() {
        ArrayList<Integer> array = generateArray();
        Integer min = 11, mid = 0;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).compareTo(min) == -1){
                min = array.get(i);
            }
            mid += array.get(i);
        }
        mid = mid / 20;
        System.out.print(mid-min);
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
