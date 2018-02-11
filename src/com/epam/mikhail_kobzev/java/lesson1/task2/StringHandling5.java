package com.epam.mikhail_kobzev.java.lesson1.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Mike on 12.02.2018.
 */
public class StringHandling5 {
    public static void main(String[] args) {
        StringHandling5 app = new StringHandling5();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<String> words = readWords();
        Integer pos = -1;
        for (int i = 0; i < words.size(); i++){
            Set<Character> differentSymbols = new HashSet<>();
            for (int j = 0; j < words.get(i).length(); j++)
                differentSymbols.add(words.get(i).charAt(j));
            if (differentSymbols.size() == words.get(i).length()) {
                pos = i;
                break;
            }
        }
        System.out.println("word with only different character: "+ words.get(pos));
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
