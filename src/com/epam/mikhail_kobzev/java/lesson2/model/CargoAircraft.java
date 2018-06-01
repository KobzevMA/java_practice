package com.epam.mikhail_kobzev.java.lesson2.model;

/**
 * Created by Mike on 25.05.2018.
 */

public class CargoAircraft extends Aircraft {

    public CargoAircraft(int id, String name, int capacity, int flightLength) {
        super(id, name, capacity, 0, flightLength);
    }

}