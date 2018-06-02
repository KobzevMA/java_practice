package com.epam.mikhail_kobzev.java.lesson5.model;

import com.epam.mikhail_kobzev.java.lesson5.interfaces.AirCompany;
import com.epam.mikhail_kobzev.java.lesson5.services.SortByFlightLength;
import com.epam.mikhail_kobzev.java.lesson5.model.Aircraft;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 25.05.2018.
 */

public class AirCompanyImplemented implements AirCompany, Serializable {
    private List<Aircraft> aircrafts = new ArrayList<>();
    @Override
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void removeAircraft(Aircraft aircraft) {
        aircrafts.remove(aircraft);
    }

    @Override
    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircrafts){
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int getTotalNumberOfPassengers() {
        int totalNumberOfPassengers = 0;
        for (Aircraft aircraft : aircrafts){
            totalNumberOfPassengers += aircraft.getNumberOfPassenger();
        }
        return totalNumberOfPassengers;
    }

    @Override
    public List<Aircraft> sortAircraftByFlightLength() {
        this.aircrafts.sort(new SortByFlightLength());
        return aircrafts;
    }

    @Override
    public List<Aircraft> getAircraftByFlightLength(int flightLength) {
        List<Aircraft> result = new ArrayList<>();
        for (Aircraft aircraft : aircrafts){
            if (aircraft.getFlightLength() == flightLength){
                result.add(aircraft);
            }
        }
        return result;
    }
}
