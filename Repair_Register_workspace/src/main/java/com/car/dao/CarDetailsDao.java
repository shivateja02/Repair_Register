package com.car.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.car.model1.customer;

public class CarDetailsDao {

    private String jdbcURL = "jdbc:mysql://localhost:3306/vehicle?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "ksteja"; 

    private static final String INSERT_CAR_SQL =
        "INSERT INTO car_details (customer_id, name, car_no, car_brand, car_issue, address, contact) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?)";

    public int registerCarDetails(customer car) throws ClassNotFoundException {
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement ps = connection.prepareStatement(INSERT_CAR_SQL)) {

            ps.setInt(1, car.getCustomerId());
            ps.setString(2, car.getName());
            ps.setString(3, car.getCarNo());
            ps.setString(4, car.getCarBrand());
            ps.setString(5, car.getCarIssue());
            ps.setString(6, car.getAddress());
            ps.setString(7, car.getContact());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
