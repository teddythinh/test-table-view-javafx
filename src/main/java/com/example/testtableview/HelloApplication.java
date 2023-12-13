package com.example.testtableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 590, 450);
        stage.setTitle("TEST DAM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

//        PersonBusiness person = new PersonBusiness();
//        List<Person> people = person.getAll();
//        for (Person person1: people) {
//            System.out.println(person1.toString());
//        }
    }
}