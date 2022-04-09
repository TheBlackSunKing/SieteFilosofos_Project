package uneg_team_so.sietefilosofos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void enClickDeBoton() {
        welcomeText.setText("Comenzando simulacion");
    }
}