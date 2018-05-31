package com.epam.mikhail_kobzev.java.lesson2.interfaces;


import com.epam.mikhail_kobzev.java.lesson2.model.Candy;

/**
 * Created by Mike on 25.05.2018.
 */

public interface CandyPack {
    void addCandy(Candy candy);
    void removeCandy(Candy candy);
    int getWeight();
    Candy[] getCandiesByName(String name);
    Candy[] getCandiesByType(String type);
}

