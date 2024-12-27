package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ExampleFormController {
    public Label lblUntitle;

    public void btnClickOnAction(ActionEvent actionEvent) {
//        System.out.println("correct");
        lblUntitle.setText("Hello JavaFX :)");
    }
}
