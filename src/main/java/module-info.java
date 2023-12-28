module armour.project.interface_sign {
    requires javafx.controls;
    requires javafx.fxml;


    opens armour.project.interface_sign to javafx.fxml;
    exports armour.project.interface_sign;
}