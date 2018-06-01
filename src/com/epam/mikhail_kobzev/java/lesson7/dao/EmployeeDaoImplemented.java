package com.epam.mikhail_kobzev.java.lesson7.dao;

import com.epam.mikhail_kobzev.java.lesson7.ConnectionConfig;
import com.epam.mikhail_kobzev.java.lesson7.dao.interfaces.EmployeeDao;
import com.epam.mikhail_kobzev.java.lesson7.entities.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 01.06.2018.
 */
public class EmployeeDaoImplemented implements EmployeeDao {
    private ConnectionConfig connectionConfig;

    public EmployeeDaoImplemented(ConnectionConfig connectionConfig) {
        this.connectionConfig = connectionConfig;
    }

    @Override
    public void insert(Employee employee) {
        try {
            Connection connection = connectionConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO employees (firstname, lastname) " +
                    "VALUES(?, ?)");
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee selectById(int id) {
        Employee employee = new Employee();
        try {
            Connection connection = connectionConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employees WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = this.connectionConfig.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("firstname"));
                employee.setLastName(resultSet.getString("lastname"));
                employees.add(employee);
            }
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = connectionConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM employees where id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Employee person, int id) {
        try {
            Connection connection = connectionConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE employees SET first_name = ?, last_name = ? WHERE id = ?");
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getLastName());
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}