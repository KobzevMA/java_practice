package com.epam.mikhail_kobzev.java.lesson6.services;

import com.epam.mikhail_kobzev.java.lesson6.model.Aircraft;

import java.util.Comparator;

/**
 * Created by Mike on 01.06.2018.
 */
public class SortByFlightLength implements Comparator<Aircraft>{
    @Override
    public int compare(Aircraft a, Aircraft b){
        if (a.getFlightLength() > b.getFlightLength()) { return 1; }
        if (a.getFlightLength() < b.getFlightLength()) { return -1; }
        return 0;
    }

}
