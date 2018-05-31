package com.epam.mikhail_kobzev.java.lesson2.exception;

/**
 * Created by Mike on 26.05.2018.
 */
public class WrongWeightException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Invalid weight. Check it again.";
    }
}