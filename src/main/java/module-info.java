module gctk.geochemtk {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens gctk.geochemtk to javafx.fxml;
    exports gctk.geochemtk;
}