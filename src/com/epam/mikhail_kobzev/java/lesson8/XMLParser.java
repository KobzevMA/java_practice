package com.epam.mikhail_kobzev.java.lesson8;

import com.epam.mikhail_kobzev.java.lesson8.model.Plane;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Mike on 01.06.2018.
 */

public class XMLParser {
    private static final String prefixOfClasses = "com.epam.mikhail_kobzev.java.lesson8.model.";
    private static final String prefixOfPath = "src/com/epam/mikhail_kobzev/java/lesson8/";

    public static Plane getPlane(String company) throws ParserConfigurationException, IOException, InvocationTargetException {
        Plane plane = null;
        try{
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document document = dBuilder.parse("planes.xml");
            document.getDocumentElement().normalize();

            NodeList nList = document.getElementsByTagName("plane");
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;

                    if (getTextElement(element, "company").equals(company)) {
                        int id = XMLParser.parseElement(element, "id");
                        String name = XMLParser.getTextElement(element, "name");
                        int capacity = XMLParser.parseElement(element, "capacity");
                        int numberOfPassenger = XMLParser.parseElement(element, "numberOfPassenger");
                        int flightLength = parseElement(element, "flightLength");

                        String airCompany = getPathToClass(company);


                        Class planeClass = Class.forName(airCompany);
                        Constructor[] a = planeClass.getConstructors();

                        plane = (Plane) a[0].newInstance(id, name, capacity, numberOfPassenger, flightLength);
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | InvocationTargetException |
                SecurityException | InstantiationException | IllegalAccessException |
                IllegalArgumentException | ClassNotFoundException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        return plane;

    }

    private static int parseElement(Element element, String tagName) {
        return Integer.parseInt(XMLParser.getTextElement(element, tagName));
    }

    private static String getTextElement(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }

    public static String getPathToFile(String fileName) {
        return prefixOfPath + fileName;
    }

    public static String getPathToClass(String className) {
        return prefixOfClasses + className;
    }
}