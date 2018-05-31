package com.epam.mikhail_kobzev.java.lesson3;

/**
 * Created by Mike on 31.05.2018.
 */
public class Course {
    private String name;
    private Number duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Number getDuration() {
        return duration;
    }
}
