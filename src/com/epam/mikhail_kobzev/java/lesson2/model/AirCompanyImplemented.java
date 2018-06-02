package com.epam.mikhail_kobzev.java.lesson2.model;

import com.epam.mikhail_kobzev.java.lesson2.interfaces.AirCompany;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Mike on 25.05.2018.
 */

public class AirCompanyImplemented implements AirCompany, Serializable {
    private Aircraft[] aircrafts = new Aircraft[100];
    @Override
    public void addAircraft(Aircraft aircraft) {
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                aircrafts[i] = aircraft;
                break;
            }
        }
    }

    @Override
    public void removeAircraft(Aircraft aircrfat) {
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                break;
            }
            if (aircrafts[i].equals(aircrafts)){
                for (int j = i; j < aircrafts.length; j++){
                    if (aircrafts[j + 1] == null){
                        break;
                    }
                    aircrafts[j] = aircrafts[j + 1];
                }
            }
        }
    }

    @Override
    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                break;
            }
            totalCapacity += aircrafts[i].getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int getTotalNumberOfPassengers() {
        int totalNumberOfPassengers = 0;
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                break;
            }
            totalNumberOfPassengers += aircrafts[i].getNumberOfPassenger();
        }
        return totalNumberOfPassengers;
    }

    enum Mark{MARK1, MARK2;}

    @Override
    public Aircraft[] sortAircraftByFlightLength() {
        Aircraft[] tempArray = new Aircraft[100];
        int countAircraft = 0;
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                break;
            }
            tempArray[countAircraft++] = aircrafts[i];
        }
        for (int i = 0; i + 1 < aircrafts.length; i++) {
            for (int j = 0; j + i + 1 < aircrafts.length; j++){
                if ((aircrafts[j + 1] != null && aircrafts[j] != null) &&
                        (aircrafts[j + 1].getFlightLength() < aircrafts[j].getFlightLength())){
                    Aircraft[] tmpAircrat = new Aircraft[1];
                    tmpAircrat[0] = aircrafts[j + 1];
                    aircrafts[j + 1] = aircrafts[j];
                    aircrafts[j] = tmpAircrat[0];
                }
            }
        }
        return aircrafts;
    }

    @Override
    public Aircraft[] getAircraftByFlightLength(int flightLength) {
        Aircraft[] tempArray = new Aircraft[100];
        int countAircraft = 0;
        for (int i = 0; i < aircrafts.length; i++){
            if (aircrafts[i] == null){
                break;
            }
            if (aircrafts[i].getFlightLength() == flightLength){
                tempArray[countAircraft++] = aircrafts[i];
            }
        }
        Aircraft[] result = new Aircraft[countAircraft];
        for (int i = 0; i < countAircraft; i++)
            result[i] = tempArray[i];
        return result;
    }
}
