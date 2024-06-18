package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionString = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = "YUm15510n";

        Connection connection = DriverManager.getConnection(connectionString,
                    username,
                    password

        );
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT FirstName, LastName FROM Employees " + "WHERE LastName LIKE ? ORDER BY FirstName");

        preparedStatement.setString(1,"J%");
        ResultSet row = preparedStatement.executeQuery();

        while(row.next()){
            System.out.printf("First name: %s, Last name: %s\n", row.getString(1), row.getString(2));
        }
        row.close();
        preparedStatement.close();
        connection.close();

    }
}