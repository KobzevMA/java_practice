package com.epam.mikhail_kobzev.java.lesson7;

import com.epam.mikhail_kobzev.java.lesson7.dao.EmployeeDaoImplemented;
import com.epam.mikhail_kobzev.java.lesson7.dao.interfaces.EmployeeDao;
import com.epam.mikhail_kobzev.java.lesson7.entities.Employee;

import java.util.List;

/**
 * Created by Mike on 01.06.2018.
 */
public class Runner {
    public static void main(String[] args) {
        ConnectionConfig connectionConfig = new ConnectionConfig();
        connectionConfig.process("jdbc:postgresql://localhost:5432/Employees", "sys", "123");

        EmployeeDao employeeDao = new EmployeeDaoImplemented(connectionConfig);
        employeeDao.insert(new Employee("Ivan", "Ivanov"));
        employeeDao.insert(new Employee("Petr", "Petrov"));


        List<Employee> employees = employeeDao.selectAll();
        for (int i = 0; i < employees.size(); i++){
            for (int j = 0; j < 10; j++){
                employeeDao.insert(employees.get(i));
            }
        }
        connectionConfig.close();
    }
}
