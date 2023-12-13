module com.example.testtableview {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.postgresql.jdbc;
    requires java.sql;


    opens com.example.testtableview to javafx.fxml;
    exports com.example.testtableview;
}