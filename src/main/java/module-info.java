module com.example.ecse437project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ecse437project to javafx.fxml;
    exports com.ecse437project;
}