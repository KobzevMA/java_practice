package com.epam.mikhail_kobzev.java.lesson6.interfaces;


import com.epam.mikhail_kobzev.java.lesson6.model.Aircraft;

import java.util.List;

/**
 * Created by Mike on 25.05.2018.
 */

public interface AirCompany {
    void addAircraft(Aircraft aircraft);
    void removeAircraft(Aircraft aircraft);
    int getTotalCapacity();
    int getTotalNumberOfPassengers();
    List<Aircraft> getAircraftByFlightLength(int flightLength);
    List<Aircraft> sortAircraftByFlightLength();
}

