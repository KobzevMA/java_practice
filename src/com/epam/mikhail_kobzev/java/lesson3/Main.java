package com.epam.mikhail_kobzev.java.lesson3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mike on 31.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java Servlets", 16);
        Course course2 = new Course("Struts Frameworks", 24);
        Course course3 = new Course("Java Technologies Overview", 24);
        Course course4 = new Course("JFS/Swing", 24);
        Course course5 = new Course("JDBC", 24);
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        Program program1 = new Program(LocalDateTime.of(2018, 3, 25, 15, 0), courses);
        courses.clear();
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        Program program2 = new Program(LocalDateTime.of(2018, 1, 13, 8, 0), courses);

        Student student1 = new Student("Ivanov", "Ivan", program1);
        Student student2 = new Student("Petrov", "Petr", program2);


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(student1.getProgramTimeLeft());
            System.out.println(student2.getProgramTimeLeft());
        }else{
            System.out.println(student1.getFirstName() + " " + student1.getLastName());
            Program program = student1.getProgram();
            System.out.println(program.getStartDate());
            List<Course> courses1 = program.getCourses();
            for (Course course : courses1){
                System.out.println(course.getName() + " Duration: " + course.getDuration());
            }
        }
    }
}
