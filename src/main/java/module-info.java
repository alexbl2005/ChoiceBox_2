module com.example.choicebox_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.choicebox_2 to javafx.fxml;
    exports com.example.choicebox_2;
}