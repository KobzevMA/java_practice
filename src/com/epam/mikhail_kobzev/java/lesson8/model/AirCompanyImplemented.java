package com.epam.mikhail_kobzev.java.lesson8.model;

import com.epam.mikhail_kobzev.java.lesson8.interfaces.AirCompany;
import com.epam.mikhail_kobzev.java.lesson8.model.Plane;
import com.epam.mikhail_kobzev.java.lesson8.services.SortByFlightLength;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 25.05.2018.
 */

public class AirCompanyImplemented implements AirCompany, Serializable {
    private List<Plane> aircrafts = new ArrayList<>();

    @Override
    public void addAircraft(Plane aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void removeAircraft(Plane aircraft) {
        aircrafts.remove(aircraft);
    }

    @Override
    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Plane aircraft : aircrafts){
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int getTotalNumberOfPassengers() {
        int totalNumberOfPassengers = 0;
        for (Plane aircraft : aircrafts){
            totalNumberOfPassengers += aircraft.getNumberOfPassenger();
        }
        return totalNumberOfPassengers;
    }

    @Override
    public List<Plane> sortAircraftByFlightLength() {
        this.aircrafts.sort(new SortByFlightLength());
        return aircrafts;
    }

    @Override
    public List<Plane> getAircraftByFlightLength(int flightLength) {
        List<Plane> result = new ArrayList<>();
        for (Plane aircraft : aircrafts){
            if (aircraft.getFlightLength() == flightLength){
                result.add(aircraft);
            }
        }
        return result;
    }
}
