package com.epam.mikhail_kobzev.java.lesson5;

import com.epam.mikhail_kobzev.java.lesson5.interfaces.AirCompany;
import com.epam.mikhail_kobzev.java.lesson5.model.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mike on 25.05.2018.
 */
public class MakeCompany {
    public static void main(String[] args) throws IOException {
        new MakeCompany().run();
    }

    void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        AirCompany doganAirlines = new AirCompanyImplemented();
        AirCompany feddikAirlines = new AirCompanyImplemented();
        String name = scanner.nextLine();
        int capacity1 = scanner.nextInt();

        doganAirlines.addAircraft(new CargoAircraft(1, name, capacity1,2000));
        doganAirlines.addAircraft(new PassengerAircraft(2, "DarkTower", 20, 300, 1300));
        doganAirlines.addAircraft(new PassengerAircraft(3, "CrimsonKing", 10, 200, 1200));

        System.out.println("Total capacity is " + doganAirlines.getTotalCapacity());
        System.out.println("Total number of passenger is " + doganAirlines.getTotalNumberOfPassengers());
        System.out.println("List of aircrafts, sorted by flight length:");
        List<Aircraft> tempArray = doganAirlines.sortAircraftByFlightLength();
        for (Aircraft aircraft : tempArray){
            System.out.println(aircraft.toString());
        }
        System.out.println();

        System.out.println("Plane with flight length 2000:");
        List<Aircraft> aircrafts = feddikAirlines.getAircraftByFlightLength(2000);
        for (Aircraft aircraft : aircrafts)
            System.out.println(aircraft.toString());
    }

}
