package com.example.testtableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    PersonBusiness person = new PersonBusiness();
    ObservableList<Person> people = person.getAll();

    @FXML
    private TableView<Person> table;

    @FXML
    private TableColumn<Person, Integer> idColumn;

    @FXML
    private TableColumn<Person, String> nameColumn;

    // Danh sách lưu trong TableView
    // Dùng ObservableList để dữ liệu thay đổi thì list thay đổi theo
    private ObservableList<Person> personList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Static data
        personList = FXCollections.observableArrayList(
                new Person(1, "Thinh"),
                new Person(2, "Gau")
        );
        // Add data from database
        personList.addAll(people);

        idColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));

        table.setItems(personList);
    }
}
