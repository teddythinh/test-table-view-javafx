package com.example.testtableview;

import javafx.collections.ObservableList;

public class PersonBusiness {
    public ObservableList<Person> getAll() {
        PersonDataAccess pda = new PersonDataAccess();
        return pda.getAll();
    }
}
