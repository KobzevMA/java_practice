package com.epam.mikhail_kobzev.java.lesson1.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.random;

/**
 * Created by Mike on 10.02.2018.
 */
public class ArrayHandling6 {
    public static void main(String[] args) {
        ArrayHandling6 app = new ArrayHandling6();
        app.startApplication();
    }

    public void startApplication() {
        ArrayList<Integer> array = generateArray();
        Set<Integer> doubledElement = new HashSet<>();

        for (int i = 0; i < array.size()-1; i++){
            for (int j = i+1; j < array.size(); j++)
                if (array.get(i).compareTo(array.get(j)) == 0 && j % 2 == 0){
                    System.out.printf("%d ",array.get(i));
                }
        }
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
