package com.myapp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    private static final String INSERT_QUERY = "insert into students values(1001, 'arun', 'CSE')";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:1521/capg_db", "root", "root");

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate(INSERT_QUERY);

        if (i> 0) {
            System.out.println("Student data inserted in DB");
        }
        else {
            System.out.println("Student data not inserted");
        }

    }
}
