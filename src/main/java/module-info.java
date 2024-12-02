module com.example.esercitazioneviaggi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esercitazioneviaggi to javafx.fxml;
    exports com.example.esercitazioneviaggi;
}