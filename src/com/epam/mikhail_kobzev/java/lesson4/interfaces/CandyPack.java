package com.epam.mikhail_kobzev.java.lesson4.interfaces;


import com.epam.mikhail_kobzev.java.lesson4.model.Candy;

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

