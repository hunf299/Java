package javalasttermproject.javalasttermproject.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class Login implements Initializable {

    public static Stage stage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label hotline;

    @FXML
    private Label hotline_label;

    @FXML
    private AnchorPane hotline_panel;

    @FXML
    private ImageView imageview;

    @FXML
    private Label introduction_label;

    @FXML
    private TextArea introduction_textarea;

    @FXML
    private Line line;

    @FXML
    private BorderPane login_borderpane;

    @FXML
    private Button login_button;

    @FXML
    private Label login_label;

    @FXML
    private AnchorPane login_mainpanel;

    @FXML
    private AnchorPane login_subpanel;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private ImageView phone_imageview;

    @FXML
    private TextField username_textfield;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        login_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginUtils.logInUser(event, username_textfield.getText(), passwordfield.getText());
            }
        });
    }
}
