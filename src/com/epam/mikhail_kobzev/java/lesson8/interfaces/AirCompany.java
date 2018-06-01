package com.epam.mikhail_kobzev.java.lesson8.interfaces;

import com.epam.mikhail_kobzev.java.lesson8.model.Plane;

import java.util.List;

/**
 * Created by Mike on 25.05.2018.
 */

public interface AirCompany {
    void addAircraft(Plane aircraft);
    void removeAircraft(Plane aircraft);
    int getTotalCapacity();
    int getTotalNumberOfPassengers();
    List<Plane> getAircraftByFlightLength(int flightLength);
    List<Plane> sortAircraftByFlightLength();
}

