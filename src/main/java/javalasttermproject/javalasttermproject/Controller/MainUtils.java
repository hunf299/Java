package javalasttermproject.javalasttermproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javalasttermproject.javalasttermproject.Controller.ChangePassword;
import javalasttermproject.javalasttermproject.Controller.LoginUtils;
import javalasttermproject.javalasttermproject.Model.Database;

import java.io.IOException;
import java.sql.*;

public class MainUtils {
    public static String setLabel(String sqlQuery, String columnLabel, String columnObject) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String receivedResult = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, columnObject);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                receivedResult = resultSet.getString(columnLabel);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return receivedResult;
    }
    public static String countSubject(String sqlQuery, String columnLabel) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String receivedResult = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                receivedResult = resultSet.getString(columnLabel);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return receivedResult;
    }

    public static void changeStage(ActionEvent event, String title, String url, int width, int height) {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(ChangePassword.class.getResource(url));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(),width,height);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setResizable(false);
        stage.show();
    }
    public static String selectedOption(RadioButton radioButton, String option1, String option2) {
        if(radioButton.isSelected()) {
            return option1;
        }
        else {
            return option2;
        }
    }
    public static void transferInt(RadioButton radioButton, String receivedResult) {
        if (receivedResult.equals("1")) {
            radioButton.setSelected(true);
        }
        else {
            radioButton.setSelected(false);
        }
    }
    public static void transferString(RadioButton radioButton, RadioButton radioButton1, String receivedResult, String check) {
        if (receivedResult.equals(check)) {
            radioButton.setSelected(true);
        }
        else {
            radioButton1.setSelected(true);
        }
    }
    public static void checkRadioButton(RadioButton radioButton, RadioButton radioButton1, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5) {
        if (radioButton.isSelected() || radioButton1.isSelected() || radioButton2.isSelected()) {
            radioButton.setSelected(false);
            radioButton1.setSelected(false);
            radioButton2.setSelected(false);
        }
        if (radioButton3.isDisable() || radioButton4.isDisable() || radioButton5.isDisable()) {
            radioButton3.setDisable(false);
            radioButton4.setDisable(false);
            radioButton5.setDisable(false);
        }
    }
    public static void getScore(String subject, Label data)  {
        Connection connection = null;
        String sqlQuery = "SELECT " + subject + " FROM score WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int receivedResult = 0;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                receivedResult = resultSet.getInt(subject);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        data.setText(String.valueOf(receivedResult));
        if (receivedResult > 0 && receivedResult <= 1) {
            data.setTextFill(Color.RED);
        }
        else if (receivedResult <= 5) {
            data.setTextFill(Color.ORANGE);
        }
        else if (receivedResult < 9) {
            data.setTextFill(Color.YELLOW);
        }
        else {
            data.setTextFill(Color.GREEN);
        }
    }
    public static void getScienceScore(String subject, Label data) {
        Connection connection = null;
        String sqlQuery = "SELECT " + subject + " FROM score WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String receivedResult = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                receivedResult = resultSet.getString(subject);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        data.setText(receivedResult);
        if (receivedResult.equals("X")) {
            data.setTextFill(Color.BLACK);
        }
        else {
            Double transfer = Double.valueOf(receivedResult);
            if (transfer > 0 && transfer <= 1) {
                data.setTextFill(Color.RED);
            }
            else if (transfer <= 5) {
                data.setTextFill(Color.ORANGE);
            }
            else if (transfer < 9) {
                data.setTextFill(Color.YELLOW);
            }
            else {
                data.setTextFill(Color.GREEN);
            }
        }
    }
    public static void setVisibleScoreLabel(Label label, Label label1, AnchorPane pane, AnchorPane pane1) {
        if (label.getText().equals("X")) {
            pane.setVisible(false);
            pane1.setVisible(true);
        }
        else {
            pane.setVisible(true);
            pane1.setVisible(false);
        }
    }
    public static void calculateScore(Label sub1, Label sub2, Label sub3, Label combi) {
        if (!sub1.getText().equals("X") && !sub2.getText().equals("X") && !sub3.getText().equals("X")) {
            double subject1 = Double.valueOf(sub1.getText());
            double subject2 = Double.valueOf(sub2.getText());
            double subject3 = Double.valueOf(sub3.getText());
            double result = subject1 + subject2 + subject3;
            combi.setText(String.valueOf(result));
        }
    }
}