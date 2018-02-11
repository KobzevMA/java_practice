package com.epam.mikhail_kobzev.java.lesson1.task1;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.random;

/**
 * Created by Mike on 10.02.2018.
 */
public class ArrayHandling1 {
    public static void main(String[] args) {
        ArrayHandling1 app = new ArrayHandling1();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<Integer> array = generateArray();
        Integer min = 11, max = -11, minPos = -1, maxPos = -1;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).compareTo(0) == 1) {
                if (array.get(i).compareTo(min) == -1){
                    min = array.get(i);
                    minPos = i;
                }
            }
            else if (array.get(i).compareTo(0) == -1){
                if (array.get(i).compareTo(max) == 1){
                    max = array.get(i);
                    maxPos = i;
                }
            }
        }
        Collections.swap(array, minPos, maxPos);
        System.out.println(array);
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
