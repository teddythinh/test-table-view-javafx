package com.example.testtableview;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgresConnection {
    public static Connection create() {
        try {
            String url = "jdbc:postgresql://localhost/test";
            Properties props = new Properties();
            props.setProperty("user", "khoildm");
            props.setProperty("password", "123");
            Connection conn = DriverManager.getConnection(url, props);

            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(PostgresConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
