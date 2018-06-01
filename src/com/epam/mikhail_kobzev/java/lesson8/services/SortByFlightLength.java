package com.epam.mikhail_kobzev.java.lesson8.services;

import com.epam.mikhail_kobzev.java.lesson8.model.Plane;

import java.util.Comparator;

/**
 * Created by Mike on 01.06.2018.
 */
public class SortByFlightLength implements Comparator<Plane>{
    @Override
    public int compare(Plane a, Plane b){
        if (a.getFlightLength() > b.getFlightLength()) { return 1; }
        if (a.getFlightLength() < b.getFlightLength()) { return -1; }
        return 0;
    }

}
