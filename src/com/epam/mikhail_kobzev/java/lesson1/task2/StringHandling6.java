package com.epam.mikhail_kobzev.java.lesson1.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mike on 12.02.2018.
 */
public class StringHandling6 {
    public static void main(String[] args) {
        StringHandling6 app = new StringHandling6();
        app.startApplication();
    }

    public void startApplication(){
        ArrayList<String> words = readWords();
        Boolean first = false;
        String result = "";
        for (int i = 0; i < words.size(); i++){
            if (!first && isNumber(words.get(i))){
                first = true;
                result = words.get(i);
            }
            else if (isNumber(words.get(i))){
                result = words.get(i);
                break;
            }
        }
        if (!first)
            System.out.println("numeric-word: " + result);
        else
            System.out.println("second numeric-word: " + result);
    }

    private Boolean isNumber(String checkingString){
        try{
            int n = Integer.parseInt(checkingString);
        }
        catch (NumberFormatException nfe){
            return false;
        }
        return true;
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
