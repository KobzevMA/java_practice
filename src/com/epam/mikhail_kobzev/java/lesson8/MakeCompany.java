package com.epam.mikhail_kobzev.java.lesson8;

import com.epam.mikhail_kobzev.java.lesson8.exception.WrongCapacityException;
import com.epam.mikhail_kobzev.java.lesson8.exception.WrongNameException;
import com.epam.mikhail_kobzev.java.lesson8.interfaces.AirCompany;
import com.epam.mikhail_kobzev.java.lesson8.model.AirCompanyImplemented;
import com.epam.mikhail_kobzev.java.lesson8.model.Plane;
import com.epam.mikhail_kobzev.java.lesson8.model.CargoPlane;
import com.epam.mikhail_kobzev.java.lesson8.model.PassengerPlane;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mike on 25.05.2018.
 */

public class MakeCompany {
    public static void main(String[] args) throws IOException, ParserConfigurationException, InvocationTargetException {
        new MakeCompany().run();
    }

    void run() throws IOException, ParserConfigurationException, InvocationTargetException {
        Plane plane1 = XMLParser.getPlane("CrimsonKing");
        Plane plane2 = XMLParser.getPlane("DarkTower");
        System.out.println(plane1);
        System.out.println(plane2);
    }

}
