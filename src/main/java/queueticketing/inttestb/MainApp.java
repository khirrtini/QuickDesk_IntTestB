package queueticketing.inttestb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(MainApp.class.getResource("TicketingAppView.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 600, 606);
        stage.setTitle("Ticketing Application");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}