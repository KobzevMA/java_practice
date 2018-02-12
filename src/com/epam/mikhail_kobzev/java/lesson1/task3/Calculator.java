package com.epam.mikhail_kobzev.java.lesson1.task3;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Mike on 12.02.2018.
 */
public class Calculator {
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startApplication();
    }

    public void startApplication(){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Choose: \n1 - do some arithmetic\n2 - exit");
            String choose = in.nextLine();
            switch (choose){
                case "1":
                    System.out.print("Enter a first number: ");
                    String tmp = in.nextLine();
                    Integer first;
                    try {
                        first = Integer.parseInt(tmp);
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input. Try again");
                        break;
                    }

                    System.out.println("Choose an operation: \n1 - add\n2 - substruct\n3 - multiply\n4 - divide");
                    String operation = in.nextLine();
                    if (operation.compareTo("1") != 0 &&
                            operation.compareTo("2") != 0 &&
                            operation.compareTo("3") != 0 &&
                            operation.compareTo("4") != 0) {
                        System.out.println("Invalid operation. Try again");
                        break;
                    }

                    System.out.print("Enter a second number: ");
                    tmp = in.nextLine();
                    Integer second;
                    try {
                        second = Integer.parseInt(tmp);
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input. Try again");
                        break;
                    }

                    System.out.print("result: ");
                    switch (operation){
                        case "1":
                            System.out.println(add(first,second));
                            break;
                        case "2":
                            System.out.println(sub(first,second));
                            break;
                        case "3":
                            System.out.println(mul(first,second));
                            break;
                        case "4":
                            System.out.println(div(first,second));
                            break;
                    }

                    break;

                case "2":
                    System.exit(0);

                default:
                    System.out.println("Invalid command. Please, try again");
            }
        }
    }

    Integer add(Integer first, Integer second){
        return first + second;
    }

    Integer sub(Integer first, Integer second){
        return first - second;
    }

    Integer mul(Integer first, Integer second){
        return first * second;
    }

    Double div(Integer first, Integer second){
        return Double.valueOf(first / second);
    }

}
