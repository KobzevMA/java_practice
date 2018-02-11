package com.epam.mikhail_kobzev.java.lesson1.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mike on 11.02.2018.
 */
public class StringHandling1 {
    public static void main(String[] args) {
        StringHandling1 app = new StringHandling1();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<String> strings = readStrings();
        Integer max = -1, min = Integer.MAX_VALUE, minPos = -1, maxPos = -1;
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() < min){
                min = strings.get(i).length();
                minPos = i;
            }
            if (strings.get(i).length() > max){
                max = strings.get(i).length();
                maxPos = i;
            }
        }
        System.out.println("minimal string: " + strings.get(minPos));
        System.out.println("its length: " + min);
        System.out.println("maximal string: " + strings.get(maxPos));
        System.out.println("its length: " + max);
    }

    private ArrayList<String> readStrings(){
        Scanner in = new Scanner(System.in);
        System.out.print("number of strings: ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            result.add(str);
        }
        return result;
    }
}
