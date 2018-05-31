package com.epam.mikhail_kobzev.java.lesson2.model;

/**
 * Created by Mike on 25.05.2018.
 */

public class CandyWithWrapper extends Candy {
    int weightOfWrapper;

    public CandyWithWrapper(int id, String name, int weight, String type, int weightOfWrapper) {
        super(id, name, weight, type);
        this.weightOfWrapper = weightOfWrapper;
    }

    @Override
    public int getSumWeight() {
        return super.getWeight() + weightOfWrapper;
    }
}
