module ies.losmontecillos.tableview {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ies.losmontecillos.tableview to javafx.fxml;
    exports ies.losmontecillos.tableview;
}