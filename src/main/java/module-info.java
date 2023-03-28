module com.example.throwdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.throwdemo to javafx.fxml;
    exports com.example.throwdemo;
}