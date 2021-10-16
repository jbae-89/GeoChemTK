package gctk.geochemtk;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GeoChemController {
    @FXML
    private Label testText;

    @FXML
    protected void testButtonClick() {
        testText.setText("JavaFX / Gradle test, not production code");
    }
}