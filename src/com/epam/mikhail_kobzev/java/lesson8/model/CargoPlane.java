package com.epam.mikhail_kobzev.java.lesson8.model;

/**
 * Created by Mike on 25.05.2018.
 */

public class CargoPlane extends Plane {

    public CargoPlane(int id, String name, int capacity, int flightLength) {
        super(id, name, capacity, 0, flightLength);
    }

}