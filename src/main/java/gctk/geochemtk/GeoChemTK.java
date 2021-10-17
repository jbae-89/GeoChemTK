package gctk.geochemtk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;



public class GeoChemTK extends Application {

    public static final String VERSION = "0.0.1";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GeoChemTK.class.getResource("geochem-view.fxml"));

        // This is not production code.
        // Initial window size X and Y
        double maxX = Screen.getPrimary().getBounds().getMaxX() / 1.5;
        double maxY = Screen.getPrimary().getBounds().getMaxY() / 1.5;


        Scene scene = new Scene(fxmlLoader.load(), maxX, maxY);
        stage.setTitle("GeoChemTK v" + VERSION);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}