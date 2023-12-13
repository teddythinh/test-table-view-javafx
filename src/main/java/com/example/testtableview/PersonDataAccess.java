package com.example.testtableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.security.DrbgParameters;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDataAccess {
    public ObservableList<Person> getAll() {
        ObservableList<Person> result;
        try {
            result = FXCollections.observableArrayList();
            Connection connection = PostgresConnection.create();
            Statement statement;
            assert connection != null;
            statement = connection.createStatement();
            String query = "SELECT * from test";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Person person = new Person(id, name);
                result.add(person);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDataAccess.class.getName()).log(Level.SEVERE, null, ex);
            result = null;
        }
        return result;
    }
}
