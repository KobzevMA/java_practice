package com.epam.mikhail_kobzev.java.lesson2.model;

import java.io.Serializable;

/**
 * Created by Mike on 25.05.2018.
 */

public abstract class Aircraft implements Serializable {
    private int id;
    private String name;
    private int capacity;
    private int numberOfPassenger;
    private int flightLength;
    public enum Mark{CargoMark1, CargoMark2, PassMark1, PassMark2};
    private Mark markOfAircraft;

    public Aircraft(int id, String name, int capacity, int numberOfPassenger, int flightLength, String markOfAircraft) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.numberOfPassenger = numberOfPassenger;
        this.flightLength = flightLength;
        this.markOfAircraft = Mark.valueOf(markOfAircraft);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfPassenger() { return numberOfPassenger; }

    public int getFlightLength() {
        return flightLength;
    }

    public Mark getMarkOfAircraft() {return markOfAircraft; }


    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", flight length='" + flightLength + '\'' +
                ", mark='" + markOfAircraft + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aircraft aircraft = (Aircraft) o;

        if (id != aircraft.id) return false;
        if (capacity != aircraft.capacity) return false;
        if (name != null ? !name.equals(aircraft.name) : aircraft.name != null) return false;
        return flightLength == aircraft.flightLength;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + capacity;
        result = 31 * result + flightLength;
        return result;
    }
}
