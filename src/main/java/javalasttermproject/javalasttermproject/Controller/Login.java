package javalasttermproject.javalasttermproject.Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javalasttermproject.javalasttermproject.Model.Database;

public class Login implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField againpass_field;

    @FXML
    private AnchorPane authentication_panel;

    @FXML
    private AnchorPane changepass_panel;

    @FXML
    private StackPane forgetpass_stackpanel;

    @FXML
    private Button login_button;

    @FXML
    private PasswordField newpass_field;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button save_button;

    @FXML
    private TextField securitycode_textfield;

    @FXML
    private Button submit_button;

    @FXML
    private AnchorPane form_panel;

    @FXML
    private Button transition_alreadyacc_button;

    @FXML
    private Label transition_alreadyacc_label;

    @FXML
    private Button transition_forgetpass_button;

    @FXML
    private Label transition_forgetpass_label;

    @FXML
    private AnchorPane transition_panel;

    @FXML
    private AnchorPane login_panel;

    @FXML
    private TextField username_textfield;

    @FXML
    private AnchorPane fillingid_panel;

    @FXML
    private Button id_submit_button;

    @FXML
    private TextField idcheck_textfield;

    static String tempID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginUtils.logInUser(event, username_textfield.getText(), passwordfield.getText());
            }
        });
        transition_alreadyacc_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LoginUtils.switchForm(actionEvent, transition_forgetpass_button, transition_alreadyacc_button, transition_panel, login_panel, forgetpass_stackpanel, transition_alreadyacc_label, transition_forgetpass_label);
            }
        });
        transition_forgetpass_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LoginUtils.switchForm(actionEvent, transition_forgetpass_button, transition_alreadyacc_button, transition_panel, login_panel, forgetpass_stackpanel, transition_alreadyacc_label, transition_forgetpass_label);
            }
        });
        save_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginUtils.changePass_Login(event,idcheck_textfield.getText(),newpass_field.getText(),againpass_field.getText(),transition_forgetpass_button, transition_alreadyacc_button, transition_panel, login_panel, forgetpass_stackpanel, transition_alreadyacc_label, transition_forgetpass_label);
            }
        });
        id_submit_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = Database.connectDB();
                    preparedStatement = connection.prepareStatement("SELECT * from users WHERE username = ?");
                    preparedStatement.setString(1, idcheck_textfield.getText());
                    resultSet = preparedStatement.executeQuery();
                    if (!resultSet.isBeforeFirst()) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hộp thoại báo lỗi");
                        alert.setHeaderText("Lỗi");
                        alert.setContentText("Người dùng không có trong cơ sở dữ liệu của hệ thống!");
                        alert.show();
                    }
                    else {
                        fillingid_panel.setVisible(false);
                        authentication_panel.setVisible(false);
                        changepass_panel.setVisible(true);
                    }
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
