package com.epam.mikhail_kobzev.java.lesson3;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Mike on 31.05.2018.
 */
public class Program {
    private LocalDateTime startDate;
    private List<Course> courses;

    public Program(LocalDateTime startDate, List<Course> courses) {
        this.startDate = startDate;
        this.courses = courses;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int getProgramDuration() {
        int sum = 0;
        for (Course course : courses) {
            sum += course.getDuration().intValue();
        }

        return sum;
    }

}
