package com.epam.mikhail_kobzev.java.lesson8.exception;

/**
 * Created by Mike on 26.05.2018.
 */
public class WrongCapacityException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Invalid capacity. Check it again.";
    }
}