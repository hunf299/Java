package javalasttermproject.javalasttermproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javalasttermproject.javalasttermproject.Controller.ChangePassword;
import javalasttermproject.javalasttermproject.Controller.Login;
import javalasttermproject.javalasttermproject.Model.Database;

import java.io.IOException;
import java.sql.*;


public class LoginUtils {
    public static String tempUserName;
    public static void changeScene(ActionEvent event, String title, String url, int width, int height) {
        FXMLLoader fxmlLoader = new FXMLLoader(ChangePassword.class.getResource(url));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(),width,height);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setResizable(false);
        stage.show();
    }
    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from users WHERE username = ?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.isBeforeFirst()) {
                System.out.println("Người dùng không có trong cơ sở dữ liệu của hệ thống");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hộp thoại báo lỗi");
                alert.setHeaderText("Lỗi");
                alert.setContentText("Thông tin xác thực được cung cấp không chính xác!");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String receivedPassword = resultSet.getString("password");
                    String receivedUsername = resultSet.getString("username");
                    tempUserName = receivedUsername;
                    if (receivedPassword.equals(password) && receivedUsername.equals(username)) {
                        changeScene(event, "Giao diện chính - Hệ thống quản lí thi tốt nghiệp THPTQG","maininterface-view.fxml",900,700);
                    } else {
                        System.out.println("Sai CCCD/CMND hoặc mã đăng nhập!");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hộp thoại báo lỗi");
                        alert.setHeaderText("Lỗi");
                        alert.setContentText("Thông tin xác thực không đúng!");
                        alert.show();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void changePass(ActionEvent event, String oldPass, String newPass, String newPass2) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from users WHERE username = ?");
            preparedStatement.setString(1, tempUserName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String receivedPass = resultSet.getString("password");
                if (receivedPass.equals(oldPass)) {
                    if (!newPass.isBlank()) {
                        if (newPass.equals(newPass2)) {
                            String sql = "UPDATE users SET password = ? WHERE username = ?";
                            PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
                            preparedStatement1.setString(1,newPass);
                            preparedStatement1.setString(2,tempUserName);
                            preparedStatement1.executeUpdate();
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Đổi mã đăng nhập thành công!\n"+"Bạn có muốn tắt hộp thoại?", ButtonType.YES, ButtonType.NO);
                            alert.setTitle("Hộp thoại thông báo");
                            alert.setHeaderText("Xác nhận");
                            alert.showAndWait();
                            if (alert.getResult() == ButtonType.YES) {
                                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                                stage.close();
                            }
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Hộp thoại báo lỗi");
                            alert.setHeaderText("Lỗi");
                            alert.setContentText("Nhập sai mật khẩu mới!");
                            alert.show();
                        }
                    }
                    else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hộp thoại báo lỗi");
                        alert.setHeaderText("Lỗi");
                        alert.setContentText("Nhập sai mật khẩu mới!");
                        alert.show();
                    }
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hộp thoại báo lỗi");
                    alert.setHeaderText("Lỗi");
                    alert.setContentText("Nhập sai mật khẩu cũ!");
                    alert.show();
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
