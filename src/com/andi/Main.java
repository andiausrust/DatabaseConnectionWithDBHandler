package com.andi;

import com.andi.helper.DBHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    static private DBHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        dbHandler = new DBHandler();
        connection = dbHandler.getDbConnection();

        String insert = "INSERT INTO user(firstname, lastname, username, address, age) " +
                "VALUES(?,?,?,?,?)";

        preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, "Paulo");
        preparedStatement.setString(2, "Mayer");
        preparedStatement.setString(3, "andi");
        preparedStatement.setString(4, "Rust 82");
        preparedStatement.setInt(5, 52);
        preparedStatement.executeUpdate();

    }
}
