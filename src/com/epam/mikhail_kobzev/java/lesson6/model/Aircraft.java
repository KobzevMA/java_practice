package com.epam.mikhail_kobzev.java.lesson6.model;

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

    public Aircraft(int id, String name, int capacity, int numberOfPassenger, int flightLength) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.numberOfPassenger = numberOfPassenger;
        this.flightLength = flightLength;
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


    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", flight length='" + flightLength + '\'' +
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
