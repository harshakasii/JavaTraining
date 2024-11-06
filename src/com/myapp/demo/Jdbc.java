package com.myapp.demo;

import java.sql.*;

public class Jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Employee", "postgres", "Sharmista@2003");

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate("insert into students values(1001, 'Harsha')");

        //int j = statement.executeUpdate("truncate table students");

        //int k = statement.executeUpdate("delete from students where id = 1001");



        if (i> 0) {
            System.out.println("Student data inserted in DB");
        }
        else {
            System.out.println("Student data not inserted");
        }

        ResultSet rs = statement.executeQuery("select * from students");
        while(rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            System.out.println("id is: " + id + " name is: " + name);
        }

        statement.close();
        connection.close();

    }
}
