module com.example.numberdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numberdemo to javafx.fxml;
    exports com.example.numberdemo;
}