package com.epam.mikhail_kobzev.java.lesson2;

import com.epam.mikhail_kobzev.java.lesson2.exception.WrongNameException;
import com.epam.mikhail_kobzev.java.lesson2.exception.WrongWeightException;
import com.epam.mikhail_kobzev.java.lesson2.interfaces.CandyPack;
import com.epam.mikhail_kobzev.java.lesson2.model.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mike on 25.05.2018.
 */
public class CandyPackCollector {
    public static void main(String[] args) throws IOException {
        new CandyPackCollector().run();
    }

    void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Connector connector = new Connector();
        CandyPack christmasGift = new CandyPackImpl();
        CandyPack christmasGift2 = new CandyPackImpl();
        try {
            String name = parseName(scanner.nextLine());
            int weight1 = parseWeight(scanner.nextInt());
            christmasGift.addCandy(new CandyWithBox(1, name, weight1, "Type", 10));
        }catch (WrongNameException | WrongWeightException e){
            System.err.println(e.getMessage());
        }
        christmasGift.addCandy(new CandyWithWrapper(2, "Wrapper", 4, "Type", 1));
        connector.writeSerializeObject(christmasGift);
        connector.run();
        christmasGift2 = (CandyPack) connector.getObject();
        Candy[] candies = christmasGift2.getCandiesByType("Type");
        System.out.println(candies.length);
        System.out.println("Weight is " + christmasGift.getWeight());
    }

    private int parseWeight(int weight) throws WrongWeightException {
        if (weight <= 0) {
            throw new WrongWeightException();
        }
        return weight;
    }

    private String parseName(String name) throws WrongNameException {
        if (name.contains("@")) {
            throw new WrongNameException();
        }
        return name;
    }
}
