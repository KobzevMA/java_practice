package com.epam.mikhail_kobzev.java.lesson7.dao.interfaces;

import com.epam.mikhail_kobzev.java.lesson7.entities.Employee;

import java.util.List;

/**
 * Created by Mike on 01.06.2018.
 */

public interface EmployeeDao {
    void insert(Employee person);
    Employee selectById(int id);
    List<Employee> selectAll();
    void delete(int id);
    void update(Employee person, int id);
}
