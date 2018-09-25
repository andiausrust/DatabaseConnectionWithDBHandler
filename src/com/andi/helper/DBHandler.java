package com.andi.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends Config {

    Connection dbConnection;

    public Connection getDbConnection(){
        String connectionString =
                "jdbc:mysql://"
                + dbHost + ":"
                + dbPort + "/"
                + dbName;
        try {
            dbConnection = DriverManager.getConnection(
                    connectionString, dbUser, dbPw);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return dbConnection;
    }
}
