package com.example.demo4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/clinic";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "sapassword";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
