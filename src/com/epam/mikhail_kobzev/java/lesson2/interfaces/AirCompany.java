package com.epam.mikhail_kobzev.java.lesson2.interfaces;


import com.epam.mikhail_kobzev.java.lesson2.model.Aircraft;

/**
 * Created by Mike on 25.05.2018.
 */

public interface AirCompany {
    void addAircraft(Aircraft aircraft);
    void removeAircraft(Aircraft aircraft);
    int getTotalCapacity();
    int getTotalNumberOfPassengers();
    Aircraft[] getAircraftByFlightLength(int flightLength);
    Aircraft[] sortAircraftByFlightLength();
}

