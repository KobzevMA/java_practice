package com.epam.mikhail_kobzev.java.lesson4.exception;

/**
 * Created by Mike on 26.05.2018.
 */
public class WrongNameException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "A name with error. Check it again.";
    }
}