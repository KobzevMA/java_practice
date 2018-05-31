package com.epam.mikhail_kobzev.java.lesson2.model;

/**
 * Created by Mike on 25.05.2018.
 */

public class CandyWithBox extends Candy {
    private int weightOfBox;

    public CandyWithBox(int id, String name, int weight, String type, int weightOfBox) {
        super(id, name, weight, type);
        this.weightOfBox = weightOfBox;
    }

    @Override
    public int getSumWeight() {
        return super.getWeight() + weightOfBox;
    }
}