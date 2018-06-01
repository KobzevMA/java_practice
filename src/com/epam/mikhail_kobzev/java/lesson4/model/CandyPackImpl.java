package com.epam.mikhail_kobzev.java.lesson4.model;

import com.epam.mikhail_kobzev.java.lesson4.interfaces.CandyPack;

import java.io.Serializable;

/**
 * Created by Mike on 25.05.2018.
 */

public class CandyPackImpl implements CandyPack, Serializable {
    private Candy[] candies = new Candy[1000];
    @Override
    public void addCandy(Candy candy) {
        for (int i = 0; i < candies.length; i++){
            if (candies[i] == null){
                candies[i] = candy;
                break;
            }
        }
    }

    @Override
    public void removeCandy(Candy candy) {
        for (int i = 0; i < candies.length; i++){
            if (candies[i] == null){
                break;
            }
            if (candies[i].equals(candy)){
                for (int j = i; j < candies.length; j++){
                    if (candies[j + 1] == null){
                        break;
                    }
                    candies[j] = candies[j + 1];
                }
            }
        }
    }

    @Override
    public int getWeight() {
        int sumWeight = 0;
        for (int i = 0; i < candies.length; i++){
            if (candies[i] == null){
                break;
            }
            sumWeight += candies[i].getSumWeight();
        }
        return sumWeight;
    }

    @Override
    public Candy[] getCandiesByName(String name) {
        Candy[] tempArray = new Candy[1000];
        int countCandy = 0;
        for (int i = 0; i < candies.length; i++){
            if (candies[i] == null){
                break;
            }
            if (candies[i].getName().equals(name)){
                tempArray[countCandy++] = candies[i];
            }
        }
        Candy[] result = new Candy[countCandy];
        for (int i = 0; i < countCandy; i++)
            result[i] = tempArray[i];
        return result;
    }

    @Override
    public Candy[] getCandiesByType(String type) {
        Candy[] tempArray = new Candy[1000];
        int countCandy = 0;
        for (int i = 0; i < candies.length; i++){
            if (candies[i] == null){
                break;
            }
            if (candies[i].getType().equals(type)){
                tempArray[countCandy++] = candies[i];
            }
        }
        Candy[] result = new Candy[countCandy];
        for (int i = 0; i < countCandy; i++)
            result[i] = tempArray[i];
        return result;
    }
}
