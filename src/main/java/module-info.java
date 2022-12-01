module com.example.ecse437project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ecse437project to javafx.fxml;
    exports com.example.ecse437project;
}