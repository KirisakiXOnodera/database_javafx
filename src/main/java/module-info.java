module com.example.database_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.database_javafx to javafx.fxml;
    exports com.example.database_javafx;
}