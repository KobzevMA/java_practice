package com.epam.mikhail_kobzev.java.lesson1.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Mike on 12.02.2018.
 */
public class StringHandling4 {
    public static void main(String[] args) {
        StringHandling4 app = new StringHandling4();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<String> words = readWords();
        Integer min = Integer.MAX_VALUE, minPos = -1;
        for (int i = 0; i < words.size(); i++){
            Set<Character> differentSymbols = new HashSet<>();
            for (int j = 0; j < words.get(i).length(); j++)
                differentSymbols.add(words.get(i).charAt(j));
            if (differentSymbols.size() < min) {
                min = differentSymbols.size();
                minPos = i;
            }
        }
        System.out.println("word with minimal different character: "+ words.get(minPos));

    }

    private ArrayList<String> readWords(){
        Scanner in = new Scanner(System.in);
        System.out.println("number of words: ");
        int n = in.nextInt();
        in.nextLine();
        System.out.println("enter the words one per line: ");
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(in.nextLine());

        return result;
    }
}
