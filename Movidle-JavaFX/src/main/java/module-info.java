module com.example.proje_movidle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens com.example.proje_movidle to javafx.fxml;
    exports com.example.proje_movidle;
}