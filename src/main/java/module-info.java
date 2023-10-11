module com.example.assigment5_java_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assigment5_java_oop to javafx.fxml;
    exports com.example.assigment5_java_oop;
}