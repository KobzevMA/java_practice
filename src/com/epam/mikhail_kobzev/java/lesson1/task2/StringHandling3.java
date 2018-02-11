package com.epam.mikhail_kobzev.java.lesson1.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mike on 12.02.2018.
 */
public class StringHandling3 {
    public static void main(String[] args) {
        StringHandling3 app = new StringHandling3();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<String> strings = readStrings();
        Integer averageLength = 0;
        for (int i = 0; i < strings.size(); i++)
            averageLength += strings.get(i).length();
        averageLength = averageLength/strings.size();

        System.out.println("Strings with length less than average:");
        for (int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() < averageLength)
                System.out.printf("string \"%s\"; \tlength: %d\n",strings.get(i),strings.get(i).length());
    }

    private ArrayList<String> readStrings(){
        Scanner in = new Scanner(System.in);
        System.out.println("number of strings: ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(in.nextLine());

        return result;
    }
}
