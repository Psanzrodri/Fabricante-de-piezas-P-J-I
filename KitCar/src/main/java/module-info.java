module org.example.kitcar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.kitcar to javafx.fxml;
    exports org.example.kitcar;
}