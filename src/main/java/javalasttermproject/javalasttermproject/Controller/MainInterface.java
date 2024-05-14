package javalasttermproject.javalasttermproject.Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javalasttermproject.javalasttermproject.Model.*;

public class MainInterface implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label a00;

    @FXML
    private Label a01;

    @FXML
    private Button addrequest_button;

    @FXML
    private Label address_label;

    @FXML
    private Label address_label_form;

    @FXML
    private TextField address_textfield;

    @FXML
    private TextField address_textfield_form;

    @FXML
    private Label appliedsubject_label;

    @FXML
    private Label appliedsubject_label_form;

    @FXML
    private Label appliedsubject_label_form1;

    @FXML
    private Label b00;

    @FXML
    private Label b08;

    @FXML
    private RadioButton bio;

    @FXML
    private TableColumn<SubjectInfo, String> bio_column;

    @FXML
    private RadioButton bio_form;

    @FXML
    private Label bio_score;

    @FXML
    private AnchorPane bio_scorepane;

    @FXML
    private Label birthdate_label;

    @FXML
    private Label birthdate_label_form;

    @FXML
    private DatePicker birthdate_textfield;

    @FXML
    private TextField birthdate_textfield_form;

    @FXML
    private Label birthplace_label;

    @FXML
    private Label birthplace_label_form;

    @FXML
    private TextField birthplace_textfield;

    @FXML
    private TextField birthplace_textfield1;

    @FXML
    private Label c00;

    @FXML
    private Label c19;

    @FXML
    private Button change_button;

    @FXML
    private Button changeorder_button;

    @FXML
    private MenuItem changepass_item;

    @FXML
    private Label checkindateandtime_label;

    @FXML
    private Label checkindateandtime_label1;

    @FXML
    private Label checkintime;

    @FXML
    private Label checkintime_dashboard;

    @FXML
    private RadioButton chemistry;

    @FXML
    private TableColumn<SubjectInfo, String> chemistry_column;

    @FXML
    private RadioButton chemistry_form;

    @FXML
    private Label chemistry_score;

    @FXML
    private AnchorPane chemistry_scorepane;

    @FXML
    private Label countdown_label;

    @FXML
    private Label countdown_timer;

    @FXML
    private Label d00;

    @FXML
    private Label d07;

    @FXML
    private AnchorPane dashboard_panel;

    @FXML
    private Label datetime_panel;

    @FXML
    private Button delete_button;

    @FXML
    private Button deleterequest_button;

    @FXML
    private AnchorPane detailedtime_label;

    @FXML
    private ToggleGroup edumethod;

    @FXML
    private ImageView eduministry_logo;

    @FXML
    private Label email_label;

    @FXML
    private Label email_label_form;

    @FXML
    private TextField email_textfield;

    @FXML
    private TextField email_textfield_form;

    @FXML
    private RadioButton female_radiobutton;

    @FXML
    private AnchorPane fillform_panel;

    @FXML
    private AnchorPane firstrequest_panel1;

    @FXML
    private ImageView folder_icon;

    @FXML
    private RadioButton foreignlanguage;

    @FXML
    private TableColumn<SubjectInfo, String> foreignlanguage_column;

    @FXML
    private RadioButton foreignlanguage_form;

    @FXML
    private Label foreignlanguage_score;

    @FXML
    private Button form_button;

    @FXML
    private ButtonBar form_buttonbar;

    @FXML
    private AnchorPane form_dashboard;

    @FXML
    private Button form_dashboard_editbutton;

    @FXML
    private Label form_dashboard_label;

    @FXML
    private Label form_label;

    @FXML
    private Line form_line;

    @FXML
    private StackPane form_stackpanel;

    @FXML
    private TextField free_textfield_dashboard;

    @FXML
    private TextField free_textfield_form;

    @FXML
    private RadioButton gdcd;

    @FXML
    private TableColumn<SubjectInfo, String> gdcd_column;

    @FXML
    private RadioButton gdcd_form;

    @FXML
    private Label gdcd_score;

    @FXML
    private AnchorPane gdcd_scorepane;

    @FXML
    private RadioButton gdtx_radiobutton;

    @FXML
    private Label gender_label;

    @FXML
    private Label gender_label_form;

    @FXML
    private TextField gender_textfield_form;

    @FXML
    private TableColumn<SubjectInfo, String> geo_column;

    @FXML
    private RadioButton geography;

    @FXML
    private RadioButton geography_form;

    @FXML
    private Label geography_score;

    @FXML
    private AnchorPane geography_scorepane;

    @FXML
    private RadioButton graduated_radiobutton;

    @FXML
    private AnchorPane grey_panel;

    @FXML
    private Label hello_label;

    @FXML
    private Label highschool_label;

    @FXML
    private Label highschool_label_form;

    @FXML
    private TextField highschool_textfield;

    @FXML
    private TextField highschool_textfield_form;

    @FXML
    private RadioButton history;

    @FXML
    private TableColumn<SubjectInfo, String> history_column;

    @FXML
    private RadioButton history_form;

    @FXML
    private Label history_score;

    @FXML
    private AnchorPane history_scorepane;

    @FXML
    private Button home_button;

    @FXML
    private Line home_line;

    @FXML
    private ImageView home_logo;

    @FXML
    private Label id_label;

    @FXML
    private Label id_testinfo_label;

    @FXML
    private Label id_testinfo_label1;

    @FXML
    private Label id_testinfo_label11;

    @FXML
    private Label id_testinfo_label111;

    @FXML
    private Label id_testinfo_label112;

    @FXML
    private Label idnum_dashboard_textfield;

    @FXML
    private Label idnum_label;

    @FXML
    private Label idnum_label1;

    @FXML
    private Label idnum_label_form;

    @FXML
    private Label idnum_testinfo_textfield;

    @FXML
    private TextField idnum_textfield;

    @FXML
    private TextField idnum_textfield_form;

    @FXML
    private AnchorPane infoform_pane;

    @FXML
    private Line line;

    @FXML
    private Line line1;

    @FXML
    private Line line11;

    @FXML
    private Line line111;

    @FXML
    private Line line12;

    @FXML
    private Line line121;

    @FXML
    private Line line1211;

    @FXML
    private Line line122;

    @FXML
    private Line line1221;

    @FXML
    private Line line123;

    @FXML
    private Line line13;

    @FXML
    private ImageView list_icon1;

    @FXML
    private ImageView list_icon2;

    @FXML
    private RadioButton literature;

    @FXML
    private TableColumn<SubjectInfo, String> literature_column;

    @FXML
    private RadioButton literature_form;

    @FXML
    private Label literature_score;

    @FXML
    private Label living_label;

    @FXML
    private Label living_label1;

    @FXML
    private TextField living_textfield;

    @FXML
    private TextField living_textfield_form;

    @FXML
    private Button logout_item;

    @FXML
    private Label major1_dashboard_field;

    @FXML
    private Label major2_dashboard_field;

    @FXML
    private Label major3_dashboard_field;

    @FXML
    private TableColumn<Request, String> major_column;

    @FXML
    private Label major_label1;

    @FXML
    private TextField majorname_textfield;

    @FXML
    private RadioButton male_radiobutton;

    @FXML
    private RadioButton math;

    @FXML
    private TableColumn<SubjectInfo, String> math_column;

    @FXML
    private RadioButton math_form;

    @FXML
    private Label math_score;

    @FXML
    private Label method_label;

    @FXML
    private Label method_label_form;

    @FXML
    private Label method_label_form1;

    @FXML
    private TextField method_textfield_dashboard;

    @FXML
    private TextField method_textfield_form;

    @FXML
    private TextField mobile_textfield;

    @FXML
    private TextField mobile_textfield_form;

    @FXML
    private Label name_label;

    @FXML
    private Label name_label1;

    @FXML
    private Label name_label_form;

    @FXML
    private TextField name_textfield;

    @FXML
    private TextField name_textfield_form;

    @FXML
    private Label nation_label;

    @FXML
    private Label nation_label1;

    @FXML
    private TextField nation_textfield;

    @FXML
    private TextField nation_textfield_form;

    @FXML
    private RadioButton naturalscience;

    @FXML
    private RadioButton naturalscience_form;

    @FXML
    private RadioButton notgraduated_radiobutton;

    @FXML
    private MenuButton option_button;

    @FXML
    private Line option_line;

    @FXML
    private TableColumn<Request, Integer> order_column;

    @FXML
    private Label order_label_fill;

    @FXML
    private Label outsidecandidate_label;

    @FXML
    private Label outsidecandidate_label_form;

    @FXML
    private Label outsidecandidate_label_form1;

    @FXML
    private Label partA_label;

    @FXML
    private Label partA_label_form;

    @FXML
    private Label partB_label;

    @FXML
    private Label partB_label_form;

    @FXML
    private Label phone_label;

    @FXML
    private Label phone_label_form;

    @FXML
    private RadioButton physic;

    @FXML
    private TableColumn<SubjectInfo, String> physic_column;

    @FXML
    private RadioButton physic_form;

    @FXML
    private Label physic_score;

    @FXML
    private AnchorPane physic_scorepane;

    @FXML
    private MenuButton profile_button;

    @FXML
    private TableColumn<Request, String> program_column;

    @FXML
    private Button request_button;

    @FXML
    private ButtonBar request_buttonbar;

    @FXML
    private AnchorPane request_dashboard;

    @FXML
    private Label request_dashboard_label;

    @FXML
    private Button request_dashboard_viewbutton;

    @FXML
    private Label request_label;

    @FXML
    private Line request_line;

    @FXML
    private AnchorPane request_panel;

    @FXML
    private TableView<Request> request_tableview;

    @FXML
    private TextField requestorder_textfield;

    @FXML
    private Label room;

    @FXML
    private Label room_dashboard;

    @FXML
    private Label room_label;

    @FXML
    private Label room_label1;

    @FXML
    private Button save_button;

    @FXML
    private TableColumn<?, ?> science_column;

    @FXML
    private ToggleGroup science_subjects;

    @FXML
    private ToggleGroup science_subjects1;

    @FXML
    private BarChart<String, Double> score_barchart;

    @FXML
    private AnchorPane score_dashboard;

    @FXML
    private Label score_dashboard_label;

    @FXML
    private Button score_dashboard_viewbutton;

    @FXML
    private MenuItem score_item;

    @FXML
    private AnchorPane score_panel;

    @FXML
    private ToggleGroup sex;

    @FXML
    private AnchorPane showform_panel;

    @FXML
    private RadioButton socialscience;

    @FXML
    private TableColumn<?, ?> socialscience_column;

    @FXML
    private RadioButton socialscience_form;

    @FXML
    private TableColumn<SubjectInfo, String> subject_column;

    @FXML
    private TextField subject_field_dashboard;

    @FXML
    private Label subject_label;

    @FXML
    private TableView<SubjectInfo> subjectandtime_table;

    @FXML
    private Label testcheckin_label;

    @FXML
    private Label testcheckin_label1;

    @FXML
    private Label testcheckin_label11;

    @FXML
    private Label testcheckin_label111;

    @FXML
    private Label testcheckin_label12;

    @FXML
    private Label testcheckin_label121;

    @FXML
    private Label testcheckin_label1211;

    @FXML
    private Label testcheckin_label122;

    @FXML
    private Label testcheckin_label1221;

    @FXML
    private Label testcheckin_label123;

    @FXML
    private AnchorPane testinfo_dashboard;

    @FXML
    private Button testinfo_dashboard_viewbutton;

    @FXML
    private MenuItem testinfo_item;

    @FXML
    private Label testinfo_label;

    @FXML
    private Label testinfo_label1;

    @FXML
    private AnchorPane testinfo_panel;

    @FXML
    private AnchorPane testplace_panel;

    @FXML
    private AnchorPane testplace_panel1;

    @FXML
    private AnchorPane testplace_panel11;

    @FXML
    private AnchorPane testplace_panel111;

    @FXML
    private Label testvenue;

    @FXML
    private Label testvenue_dashboard;

    @FXML
    private Label testvenue_label;

    @FXML
    private Label testvenue_label1;

    @FXML
    private RadioButton thpt_radiobutton;

    @FXML
    private Label thptqg_label;

    @FXML
    private Label thptqg_label_form;

    @FXML
    private Label thptqg_label_form1;

    @FXML
    private RadioButton thptqg_radiobutton;

    @FXML
    private RadioButton thptqg_radiobutton_dashboard;

    @FXML
    private RadioButton thptqg_radiobutton_form;

    @FXML
    private ComboBox<String> trainingprogram_combobox_fill;

    @FXML
    private Label trainingprogram_label1;

    @FXML
    private ComboBox<String> trainingunit_combobox_fill;

    @FXML
    private Label trainingunit_label1;

    @FXML
    private Label uni1_dashboard_field;

    @FXML
    private Label uni2_dashboard_field;

    @FXML
    private Label uni3_dashboard_field;

    @FXML
    private TableColumn<Request, String> uni_column;

    @FXML
    private Label uni_label1;

    @FXML
    private TextField uni_textfield;

    @FXML
    private TableColumn<Request, String> unit_column;

    @FXML
    private AnchorPane verticalmenu;

    @FXML
    private Button viewform_button;

    @FXML
    private Label warning_label;

    @FXML
    private Label warning_label1;

    @FXML
    private AnchorPane warning_panel;

    @FXML
    private AnchorPane warning_panel1;

    @FXML
    private TextArea warning_textarea;

    @FXML
    private NumberAxis y_axis;

    @FXML
    private CategoryAxis x_axis;

    private Alert alert;

    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    private String tempName;
    private String tempDate;
    private String tempOrder;
    ObservableList<String> traningunit_list = FXCollections.observableArrayList("Đại học", "Cao đẳng");
    ObservableList<String> trainingprogram_list = FXCollections.observableArrayList("Đại trà", "Chất lượng cao", "Tiên tiến");
    public String selectedFreeCandidate() {
        if (graduated_radiobutton.isSelected()) {
            return graduated_radiobutton.getText();
        }
        else if (notgraduated_radiobutton.isSelected()) {
            return notgraduated_radiobutton.getText();
        }
        else {
            return "NULL";
        }
    }
    public boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    public ObservableList<SubjectInfo> addSubjectsListInfo() {
        ObservableList<SubjectInfo> listSubjectsInfo = FXCollections.observableArrayList();
        String subjectsInfo = "SELECT subject_column, literature_column, math_column, physic_column, chemistry_column, bio_column, foreignlanguage_column, history_column, geo_column, gdcd_column FROM OOP_schema.subjectinfo WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        Connection connection = Database.connectDB();
        try {
            SubjectInfo subjectInfo;
            prepare = connection.prepareStatement(subjectsInfo);
            result = prepare.executeQuery();
            while (result.next()) {
                subjectInfo = new SubjectInfo(result.getNString("subject_column"), result.getString("literature_column"), result.getString("math_column"), result.getString("physic_column"), result.getString("chemistry_column"), result.getString("bio_column"), result.getString("foreignlanguage_column"), result.getString("history_column"), result.getString("geo_column"), result.getString("gdcd_column"));
                listSubjectsInfo.add(subjectInfo);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listSubjectsInfo;
    }

    public ObservableList<Request> addRequestsList() {
        ObservableList<Request> listRequests = FXCollections.observableArrayList();
        String receiver = "SELECT * FROM request WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        Connection connection = Database.connectDB();
        try {
            Request request;
            prepare = connection.prepareStatement(receiver);
            result = prepare.executeQuery();
            while (result.next()) {
                request = new Request(result.getString("personal_id"),result.getInt("request_order"), result.getNString("uni_name"), result.getNString("major"), result.getNString("training_unit"), result.getNString("training_program"));
                listRequests.add(request);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listRequests;
    }
    public void candidateAdd() {
        String insertData = "INSERT INTO candidate (name, gender, birthdate, birthplace, nation, personal_id, livingaddress, highschool, mobilephone, email, contactaddress, thptqg, edumethod, freecandidate, math, literature, science, social, foreign_language, physic, chemistry, bio, history, geography, gdcd) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        connect = Database.connectDB();
        try {
            Alert alert;
            if (name_textfield.getText().isEmpty() || sex.getSelectedToggle() == null || birthdate_textfield.getValue() == null || birthplace_textfield.getText().isEmpty() || nation_textfield.getText().isEmpty() || idnum_textfield.getText().isEmpty() || living_textfield.getText().isEmpty() || highschool_textfield.getText().isEmpty() || mobile_textfield.getText().isEmpty() || !isNumeric(mobile_textfield.getText()) || email_textfield.getText().isEmpty() || address_textfield.getText().isEmpty() ||  edumethod.getSelectedToggle() == null) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hộp thoại báo lỗi");
                alert.setHeaderText("Lỗi");
                alert.setContentText("Vui lòng điền tất cả các thông tin bắt buộc!");
                alert.showAndWait();
            }
            else {
                LocalDate birthdate = birthdate_textfield.getValue();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String birthdateString = birthdate.format(dateTimeFormatter);
                prepare = connect.prepareStatement(insertData);
                prepare.setString(1, tempName);
                prepare.setString(2, MainUtils.selectedOption(male_radiobutton, male_radiobutton.getText(),female_radiobutton.getText()));
                prepare.setString(3, birthdateString);
                prepare.setString(4, birthplace_textfield.getText());
                prepare.setString(5, nation_textfield.getText());
                prepare.setString(6, LoginUtils.tempUserName);
                prepare.setString(7, living_textfield.getText());
                prepare.setString(8, highschool_textfield.getText());
                prepare.setString(9, mobile_textfield.getText());
                prepare.setString(10, email_textfield.getText());
                prepare.setString(11, address_textfield.getText());
                prepare.setString(12, MainUtils.selectedOption(thptqg_radiobutton, "1","0"));
                prepare.setString(13, MainUtils.selectedOption(thpt_radiobutton,thpt_radiobutton.getText(),gdtx_radiobutton.getText()));
                prepare.setString(14, selectedFreeCandidate());
                prepare.setString(15, MainUtils.selectedOption(math, "1", "0"));
                prepare.setString(16, MainUtils.selectedOption(literature, "1", "0"));
                prepare.setString(17, MainUtils.selectedOption(naturalscience, "1","0"));
                prepare.setString(18, MainUtils.selectedOption(socialscience, "1","0"));
                prepare.setString(19, MainUtils.selectedOption(foreignlanguage, "1","0"));
                prepare.setString(20, MainUtils.selectedOption(physic, "1", "0"));
                prepare.setString(21, MainUtils.selectedOption(chemistry, "1","0"));
                prepare.setString(22, MainUtils.selectedOption(bio,"1","0"));
                prepare.setString(23, MainUtils.selectedOption(history, "1","0"));
                prepare.setString(24, MainUtils.selectedOption(geography, "1","0"));
                prepare.setString(25, MainUtils.selectedOption(gdcd, "1","0"));
                prepare.executeUpdate();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hộp thoại thông báo");
                alert.setHeaderText("Thông báo");
                alert.setContentText("Lưu thành công!");
                alert.showAndWait();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showCandidateForm() {
        name_textfield_form.setText(tempName);
        gender_textfield_form.setText(MainUtils.setLabel("SELECT gender FROM OOP_schema.candidate where personal_id = ?", "gender", LoginUtils.tempUserName));
        LocalDateTime birthdate = LocalDateTime.parse(MainUtils.setLabel("SELECT birthdate FROM OOP_schema.candidate where personal_id = ?", "birthdate", LoginUtils.tempUserName), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String birthdateString = birthdate.format(dateTimeFormatter);
        birthdate_textfield_form.setText(birthdateString);
        birthplace_textfield1.setText(MainUtils.setLabel("SELECT birthplace FROM OOP_schema.candidate where personal_id = ?", "birthplace", LoginUtils.tempUserName));
        nation_textfield_form.setText(MainUtils.setLabel("SELECT nation FROM OOP_schema.candidate where personal_id = ?", "nation", LoginUtils.tempUserName));
        idnum_textfield_form.setText(LoginUtils.tempUserName);
        living_textfield_form.setText(MainUtils.setLabel("SELECT livingaddress FROM OOP_schema.candidate where personal_id = ?", "livingaddress", LoginUtils.tempUserName));
        highschool_textfield_form.setText(MainUtils.setLabel("SELECT highschool FROM OOP_schema.candidate where personal_id = ?", "highschool", LoginUtils.tempUserName));
        email_textfield_form.setText(MainUtils.setLabel("SELECT email FROM OOP_schema.candidate where personal_id = ?", "email", LoginUtils.tempUserName));
        mobile_textfield_form.setText(MainUtils.setLabel("SELECT mobilephone FROM OOP_schema.candidate where personal_id = ?", "mobilephone", LoginUtils.tempUserName));
        address_textfield_form.setText(MainUtils.setLabel("SELECT contactaddress FROM OOP_schema.candidate where personal_id = ?", "contactaddress", LoginUtils.tempUserName));
        String thptqgValue = MainUtils.setLabel("SELECT thptqg FROM OOP_schema.candidate where personal_id = ?", "thptqg", LoginUtils.tempUserName);
        MainUtils.transferInt(thptqg_radiobutton_form, thptqgValue);
        method_textfield_form.setText(MainUtils.setLabel("SELECT edumethod FROM OOP_schema.candidate where personal_id = ?", "edumethod", LoginUtils.tempUserName));
        String receivedFreeCandidate = MainUtils.setLabel("SELECT freecandidate FROM OOP_schema.candidate where personal_id = ?", "freecandidate", LoginUtils.tempUserName);
        if (!receivedFreeCandidate.equals("NULL")) {
            free_textfield_form.setText(receivedFreeCandidate);
        }
        String mathValue = MainUtils.setLabel("SELECT math FROM OOP_schema.candidate where personal_id = ?", "math", LoginUtils.tempUserName);
        MainUtils.transferInt(math_form, mathValue);
        String literatureValue = MainUtils.setLabel("SELECT literature FROM OOP_schema.candidate where personal_id = ?", "literature", LoginUtils.tempUserName);
        MainUtils.transferInt(literature_form, literatureValue);
        String naturalscienceValue = MainUtils.setLabel("SELECT science FROM OOP_schema.candidate where personal_id = ?", "science", LoginUtils.tempUserName);
        MainUtils.transferInt(naturalscience_form, naturalscienceValue);
        String socialscienceValue = MainUtils.setLabel("SELECT social FROM OOP_schema.candidate where personal_id = ?", "social", LoginUtils.tempUserName);
        MainUtils.transferInt(socialscience_form, socialscienceValue);
        String languageValue = MainUtils.setLabel("SELECT foreign_language FROM OOP_schema.candidate where personal_id = ?", "foreign_language", LoginUtils.tempUserName);
        MainUtils.transferInt(foreignlanguage_form, languageValue);
        if (naturalscience_form.isSelected()) {
            physic_form.setSelected(true);
            chemistry_form.setSelected(true);
            bio_form.setSelected(true);
            history_form.setSelected(false);
            geography_form.setSelected(false);
            gdcd_form.setSelected(false);
        }
        if (socialscience_form.isSelected()) {
            history_form.setSelected(true);
            geography_form.setSelected(true);
            gdcd_form.setSelected(true);
            physic_form.setSelected(false);
            chemistry_form.setSelected(false);
            bio_form.setSelected(false);
        }
    }
    public void showCandidateFields() {
        String gender = MainUtils.setLabel("SELECT gender FROM OOP_schema.candidate where personal_id = ?", "gender", LoginUtils.tempUserName);
        MainUtils.transferString(male_radiobutton, female_radiobutton, gender, "Nam");
        String edumethod = MainUtils.setLabel("SELECT edumethod FROM OOP_schema.candidate where personal_id = ?", "edumethod", LoginUtils.tempUserName);
        MainUtils.transferString(thpt_radiobutton, gdtx_radiobutton, edumethod, "THPT");
        String freeCandidate = MainUtils.setLabel("SELECT freecandidate FROM OOP_schema.candidate where personal_id = ?", "freecandidate", LoginUtils.tempUserName);
        if (!freeCandidate.equals("NULL")) {
            MainUtils.transferString(graduated_radiobutton, notgraduated_radiobutton, freeCandidate, "Đã tốt nghiệp THPT");
        }
        String dateString = birthdate_textfield_form.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        birthdate_textfield.setValue(localDate);
        birthplace_textfield.setText(birthplace_textfield1.getText());
        nation_textfield.setText(nation_textfield_form.getText());
        living_textfield.setText(living_textfield_form.getText());
        highschool_textfield.setText(highschool_textfield_form.getText());
        mobile_textfield.setText(mobile_textfield_form.getText());
        email_textfield.setText(email_textfield_form.getText());
        address_textfield.setText(address_textfield_form.getText());
        thptqg_radiobutton.setSelected(thptqg_radiobutton_form.isSelected());
        math.setSelected(math_form.isSelected());
        literature.setSelected(literature_form.isSelected());
        socialscience.setSelected(socialscience_form.isSelected());
        naturalscience.setSelected(naturalscience_form.isSelected());
        foreignlanguage.setSelected(foreignlanguage_form.isSelected());
        physic.setSelected(physic_form.isSelected());
        chemistry.setSelected(chemistry_form.isSelected());
        bio.setSelected(bio_form.isSelected());
        history.setSelected(history_form.isSelected());
        geography.setSelected(geography_form.isSelected());
        gdcd.setSelected(gdcd_form.isSelected());
    }

    public void changeCandidate() {
        String changeData = "UPDATE candidate SET gender = ?, birthdate = ?, birthplace = ?, nation = ?, livingaddress = ?, highschool = ?, mobilephone = ?, email = ?, contactaddress = ?, thptqg = ?, edumethod = ?, freecandidate = ?, math = ?, literature = ?, science = ?, social = ?, foreign_language = ?, physic = ?, chemistry = ?, bio = ?, history = ?, geography = ?, gdcd = ? WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        Connection Connect = Database.connectDB();
        try {
            Alert alert;
            if (name_textfield.getText().isEmpty() || sex.getSelectedToggle() == null || birthdate_textfield.getValue() == null || birthplace_textfield.getText().isEmpty() || nation_textfield.getText().isEmpty() || idnum_textfield.getText().isEmpty() || living_textfield.getText().isEmpty() || highschool_textfield.getText().isEmpty() || mobile_textfield.getText().isEmpty() || !isNumeric(mobile_textfield.getText()) || email_textfield.getText().isEmpty() || address_textfield.getText().isEmpty() ||  edumethod.getSelectedToggle() == null || thptqg_radiobutton.isSelected() == false) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hộp thoại báo lỗi");
                alert.setHeaderText("Lỗi");
                alert.setContentText("Vui lòng điền tất cả các thông tin bắt buộc!");
                alert.showAndWait();
            }
            else {
                LocalDate birthdate = birthdate_textfield.getValue();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String birthdateString = birthdate.format(dateTimeFormatter);
                prepare = Connect.prepareStatement(changeData);
                prepare.setString(1, MainUtils.selectedOption(male_radiobutton, male_radiobutton.getText(),female_radiobutton.getText()));
                prepare.setString(2, birthdateString);
                prepare.setString(3, birthplace_textfield.getText());
                prepare.setString(4, nation_textfield.getText());
                prepare.setString(5, living_textfield.getText());
                prepare.setString(6, highschool_textfield.getText());
                prepare.setString(7, mobile_textfield.getText());
                prepare.setString(8, email_textfield.getText());
                prepare.setString(9, address_textfield.getText());
                prepare.setString(10, MainUtils.selectedOption(thptqg_radiobutton, "1","0"));
                prepare.setString(11, MainUtils.selectedOption(thpt_radiobutton,thpt_radiobutton.getText(),gdtx_radiobutton.getText()));
                prepare.setString(12, selectedFreeCandidate());
                prepare.setString(13, MainUtils.selectedOption(math, "1", "0"));
                prepare.setString(14, MainUtils.selectedOption(literature, "1", "0"));
                prepare.setString(15, MainUtils.selectedOption(naturalscience, "1","0"));
                prepare.setString(16, MainUtils.selectedOption(socialscience, "1","0"));
                prepare.setString(17, MainUtils.selectedOption(foreignlanguage, "1","0"));
                prepare.setString(18, MainUtils.selectedOption(physic, "1", "0"));
                prepare.setString(19, MainUtils.selectedOption(chemistry, "1","0"));
                prepare.setString(20, MainUtils.selectedOption(bio,"1","0"));
                prepare.setString(21, MainUtils.selectedOption(history, "1","0"));
                prepare.setString(22, MainUtils.selectedOption(geography, "1","0"));
                prepare.setString(23, MainUtils.selectedOption(gdcd, "1","0"));
                prepare.executeUpdate();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hộp thoại thông báo");
                alert.setHeaderText("Thông báo");
                alert.setContentText("Lưu thành công!");
                alert.showAndWait();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteCandidate() {
        String deleteSQL = "DELETE FROM candidate WHERE personal_id = '" + LoginUtils.tempUserName + "'";
        Connection connectDB = Database.connectDB();
        try {
            prepare = connectDB.prepareStatement(deleteSQL);
            prepare.executeUpdate();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hộp thoại thông báo");
            alert.setHeaderText("Thông báo");
            alert.setContentText("Xoá thành công!");
            alert.showAndWait();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showSubjectsInfo() {
        subject_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("subject_column"));
        literature_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("literature_column"));
        math_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("math_column"));
        physic_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("physic_column"));
        chemistry_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("chemistry_column"));
        bio_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("bio_column"));
        foreignlanguage_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("foreignlanguage_column"));
        history_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("history_column"));
        geo_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("geo_column"));
        gdcd_column.setCellValueFactory(new PropertyValueFactory<SubjectInfo, String>("gdcd_column"));
        subjectandtime_table.setItems(addSubjectsListInfo());
    }
    public void showRequestInfo() {
        order_column.setCellValueFactory(new PropertyValueFactory<Request, Integer>("request_order"));
        uni_column.setCellValueFactory(new PropertyValueFactory<Request, String>("uni_name"));
        major_column.setCellValueFactory(new PropertyValueFactory<Request, String>("major"));
        unit_column.setCellValueFactory(new PropertyValueFactory<Request, String>("training_unit"));
        program_column.setCellValueFactory(new PropertyValueFactory<Request, String>("training_program"));
        request_tableview.setItems(addRequestsList());
    }
    public void requestAdd() {
        String insertData = "INSERT INTO request (personal_id, request_order, uni_name, major, training_unit, training_program) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = Database.connectDB();
        try {
            prepare = connection.prepareStatement(insertData);
            prepare.setString(1, LoginUtils.tempUserName);
            prepare.setString(2, requestorder_textfield.getText());
            prepare.setString(3, uni_textfield.getText());
            prepare.setString(4, majorname_textfield.getText());
            prepare.setString(5, trainingunit_combobox_fill.getValue());
            prepare.setString(6, trainingprogram_combobox_fill.getValue());
            prepare.executeUpdate();
            Alert alert;
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hộp thoại thông báo");
            alert.setHeaderText("Thông báo");
            alert.setContentText("Lưu thành công!");
            alert.showAndWait();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void changeRequest() {
        Connection connectDB = Database.connectDB();
        if (tempOrder.equals(requestorder_textfield.getText())) {
            String changeData = "UPDATE request SET uni_name = ?, major = ?, training_unit = ?, training_program = ? WHERE personal_id = '" + LoginUtils.tempUserName + "' AND request_order = " + requestorder_textfield.getText();
            try {
                Alert alert;
                prepare = connectDB.prepareStatement(changeData);
                prepare.setString(1, uni_textfield.getText());
                prepare.setString(2, majorname_textfield.getText());
                prepare.setString(3, trainingunit_combobox_fill.getValue());
                prepare.setString(4, trainingprogram_combobox_fill.getValue());
                prepare.executeUpdate();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hộp thoại thông báo");
                alert.setHeaderText("Thông báo");
                alert.setContentText("Sửa thành công!");
                alert.showAndWait();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            String tempUni = null;
            String tempMajor = null;
            String tempUnit = null;
            String tempProgram = null;
            String uni_name = "SELECT uni_name FROM request WHERE personal_id = ? AND request_order = ?";
            connectDB = Database.connectDB();
            try (PreparedStatement statement2 = connectDB.prepareStatement(uni_name)) {
                statement2.setString(1, LoginUtils.tempUserName);
                statement2.setString(2, requestorder_textfield.getText());
                ResultSet resultSet1 = statement2.executeQuery();
                if (resultSet1.next()) {
                    tempUni = resultSet1.getString("uni_name");
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            String major = "SELECT major FROM request WHERE personal_id = ? AND request_order = ?";
            connectDB = Database.connectDB();
            try (PreparedStatement statement2 = connectDB.prepareStatement(major)) {
                statement2.setString(1, LoginUtils.tempUserName);
                statement2.setString(2, requestorder_textfield.getText());
                ResultSet resultSet1 = statement2.executeQuery();
                if (resultSet1.next()) {
                    tempMajor = resultSet1.getString("major");
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            String unit = "SELECT training_unit FROM request WHERE personal_id = ? AND request_order = ?";
            connectDB = Database.connectDB();
            try (PreparedStatement statement2 = connectDB.prepareStatement(unit)) {
                statement2.setString(1, LoginUtils.tempUserName);
                statement2.setString(2, requestorder_textfield.getText());
                ResultSet resultSet1 = statement2.executeQuery();
                if (resultSet1.next()) {
                    tempUnit = resultSet1.getString("training_unit");
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            String program = "SELECT training_program FROM request WHERE personal_id = ? AND request_order = ?";
            connectDB = Database.connectDB();
            try (PreparedStatement statement2 = connectDB.prepareStatement(program)) {
                statement2.setString(1, LoginUtils.tempUserName);
                statement2.setString(2, requestorder_textfield.getText());
                ResultSet resultSet1 = statement2.executeQuery();
                if (resultSet1.next()) {
                    tempProgram = resultSet1.getString("training_program");
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            String changeData = "UPDATE request SET uni_name = ?, major = ?, training_unit = ?, training_program = ? WHERE personal_id = '" + LoginUtils.tempUserName + "' AND request_order = " + requestorder_textfield.getText();
            try {
                prepare = connectDB.prepareStatement(changeData);
                prepare.setString(1, uni_textfield.getText());
                prepare.setString(2, majorname_textfield.getText());
                prepare.setString(3, trainingunit_combobox_fill.getValue());
                prepare.setString(4, trainingprogram_combobox_fill.getValue());
                prepare.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String changeData1 = "UPDATE request SET uni_name = ?, major = ?, training_unit = ?, training_program = ? WHERE personal_id = '" + LoginUtils.tempUserName + "' AND request_order = " + tempOrder;
            Connection connection = Database.connectDB();
            try {
                Alert alert;
                prepare = connection.prepareStatement(changeData1);
                prepare.setString(1, tempUni);
                prepare.setString(2, tempMajor);
                prepare.setString(3, tempUnit);
                prepare.setString(4, tempProgram);
                prepare.executeUpdate();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hộp thoại thông báo");
                alert.setHeaderText("Thông báo");
                alert.setContentText("Sửa thành công!");
                alert.showAndWait();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void deleteRequest() {
        TextInputDialog requestOrder =  new TextInputDialog();
        requestOrder.setTitle("Nhập thông tin");
        requestOrder.getDialogPane().setContentText("Nhập thứ tự nguyện vọng cần xoá:");
        Optional<String> order = requestOrder.showAndWait();
        TextField num = requestOrder.getEditor();
        if (order.isPresent()) {
            if (num.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hộp thoại báo lỗi");
                alert.setHeaderText("Lỗi");
                alert.setContentText("Chưa nhập dữ liệu!");
                alert.showAndWait();
            }
            else {
                String checkOrder = "SELECT * FROM request WHERE personal_id = ? AND request_order = ?";
                Connection connectDB = Database.connectDB();
                try (PreparedStatement statement1 = connectDB.prepareStatement(checkOrder)) {
                    statement1.setString(1, LoginUtils.tempUserName);
                    statement1.setString(2, num.getText());
                    ResultSet resultSet = statement1.executeQuery();
                    if (!resultSet.next()) {
                        Alert alert2 = new Alert(Alert.AlertType.ERROR);
                        alert2.setTitle("Hộp thoại báo lỗi");
                        alert2.setHeaderText("Lỗi");
                        alert2.setContentText("Chưa có dữ liệu nguyện vọng vừa nhập trong hệ thống!");
                        alert2.showAndWait();
                    }
                    else {
                        String deleteRequest = "DELETE FROM request WHERE personal_id = ? AND request_order = ?";
                        try (PreparedStatement statement2 = connectDB.prepareStatement(deleteRequest)){
                            statement2.setString(1, LoginUtils.tempUserName);
                            statement2.setString(2, num.getText());
                            statement2.executeUpdate();
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Hộp thoại thông báo");
                            alert.setHeaderText("Thông báo");
                            alert.setContentText("Xoá thành công!");
                            alert.showAndWait();
                            switch (num.getText()) {
                                case "1": {
                                    uni1_dashboard_field.setText("");
                                    major1_dashboard_field.setText("");
                                    break;
                                }
                                case "2": {
                                    uni2_dashboard_field.setText("");
                                    major2_dashboard_field.setText("");
                                    break;
                                }
                                case "3": {
                                    uni3_dashboard_field.setText("");
                                    major3_dashboard_field.setText("");
                                    break;
                                }
                                default: {
                                    break;
                                }
                            }
                        }
                        catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            showRequestInfo();
        }
    }
    public void fillFormDashboard() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from candidate WHERE personal_id = ?");
            preparedStatement.setString(1, LoginUtils.tempUserName);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                MainUtils.transferInt(thptqg_radiobutton_dashboard, MainUtils.setLabel("SELECT thptqg FROM candidate WHERE personal_id = ?", "thptqg", LoginUtils.tempUserName));
                method_textfield_dashboard.setText(MainUtils.setLabel("SELECT edumethod FROM candidate WHERE personal_id = ?", "edumethod", LoginUtils.tempUserName));
                String free = MainUtils.setLabel("SELECT freecandidate FROM candidate WHERE personal_id = ?", "freecandidate", LoginUtils.tempUserName);
                if (free.equals("NULL")) {
                    free_textfield_dashboard.setText("Không có");
                }
                else {
                    free_textfield_dashboard.setText(free);
                }
                subject_field_dashboard.setText(MainUtils.countSubject("SELECT SUM(CASE WHEN math=1 THEN 1 ELSE 0 END +\n" + "CASE WHEN literature=1 THEN 1 ELSE 0 END +\n" + "CASE WHEN science=1 THEN 3 ELSE 0 END +\n" + "CASE WHEN social=1 THEN 3 ELSE 0 END +\n" + "CASE WHEN foreign_language=1 THEN 1 ELSE 0 END\n" + ") AS total FROM candidate WHERE personal_id ='" + LoginUtils.tempUserName + "'", "total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fillTestDashboard() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from testinfo WHERE personal_id = ?");
            preparedStatement.setString(1, LoginUtils.tempUserName);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                idnum_dashboard_textfield.setText(MainUtils.setLabel("SELECT candidateid FROM testinfo WHERE personal_id = ?", "candidateid", LoginUtils.tempUserName));
                testvenue_dashboard.setText(MainUtils.setLabel("SELECT testvenue FROM testinfo WHERE personal_id = ?", "testvenue", LoginUtils.tempUserName));
                tempDate = MainUtils.setLabel("SELECT checkintime FROM testinfo WHERE personal_id = ?", "checkintime", LoginUtils.tempUserName);
                checkintime_dashboard.setText(tempDate);
                room_dashboard.setText(MainUtils.setLabel("SELECT testroom FROM testinfo WHERE personal_id = ?", "testroom", LoginUtils.tempUserName));
                LocalDateTime currentDate = LocalDateTime.now();
                DateTimeFormatter tempFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime tempDateTime = LocalDateTime.parse(tempDate, tempFormatter);
                Duration duration = Duration.between(currentDate, tempDateTime);
                long daysBetween = duration.toDays();
                countdown_timer.setText(String.valueOf(daysBetween));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fillRequestDashboard() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from request WHERE personal_id = ?");
            preparedStatement.setString(1, LoginUtils.tempUserName);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                uni1_dashboard_field.setText(MainUtils.setLabel("SELECT uni_name FROM OOP_schema.request WHERE request_order = 1 AND personal_id = ?", "uni_name", LoginUtils.tempUserName));
                uni2_dashboard_field.setText(MainUtils.setLabel("SELECT uni_name FROM OOP_schema.request WHERE request_order = 2 AND personal_id = ?", "uni_name", LoginUtils.tempUserName));
                uni3_dashboard_field.setText(MainUtils.setLabel("SELECT uni_name FROM OOP_schema.request WHERE request_order = 3 AND personal_id = ?", "uni_name", LoginUtils.tempUserName));
                major1_dashboard_field.setText(MainUtils.setLabel("SELECT major FROM OOP_schema.request WHERE request_order = 1 AND personal_id = ?", "major", LoginUtils.tempUserName));
                major2_dashboard_field.setText(MainUtils.setLabel("SELECT major FROM OOP_schema.request WHERE request_order = 2 AND personal_id = ?", "major", LoginUtils.tempUserName));
                major3_dashboard_field.setText(MainUtils.setLabel("SELECT major FROM OOP_schema.request WHERE request_order = 3 AND personal_id = ?", "major", LoginUtils.tempUserName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fillScoreDashboard() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Database.connectDB();
            preparedStatement = connection.prepareStatement("SELECT * from score WHERE personal_id = ?");
            preparedStatement.setString(1, LoginUtils.tempUserName);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                XYChart.Series dataseries = new XYChart.Series();
                Double mathScore = Double.parseDouble(MainUtils.setLabel("SELECT math FROM OOP_schema.score WHERE personal_id = ?", "math", LoginUtils.tempUserName));
                Double literatureScore = Double.parseDouble(MainUtils.setLabel("SELECT literature FROM OOP_schema.score WHERE personal_id = ?", "literature", LoginUtils.tempUserName));
                Double foreignlanguage = Double.parseDouble(MainUtils.setLabel("SELECT foreignlanguage FROM OOP_schema.score WHERE personal_id = ?", "foreignlanguage", LoginUtils.tempUserName));
                String physicScore = MainUtils.setLabel("SELECT physic FROM OOP_schema.score WHERE personal_id = ?", "physic", LoginUtils.tempUserName);
                String chemistryScore = MainUtils.setLabel("SELECT chemistry FROM OOP_schema.score WHERE personal_id = ?", "chemistry", LoginUtils.tempUserName);
                String bioScore = MainUtils.setLabel("SELECT bio FROM OOP_schema.score WHERE personal_id = ?", "bio", LoginUtils.tempUserName);
                String historyScore = MainUtils.setLabel("SELECT history FROM OOP_schema.score WHERE personal_id = ?", "history", LoginUtils.tempUserName);
                String geoScore = MainUtils.setLabel("SELECT geography FROM OOP_schema.score WHERE personal_id = ?", "geography", LoginUtils.tempUserName);
                String gdcdScore = MainUtils.setLabel("SELECT gdcd FROM OOP_schema.score WHERE personal_id = ?", "gdcd", LoginUtils.tempUserName);
                if (!physicScore.equals("X")) {
                    Double transferPhysic = Double.parseDouble(physicScore);
                    dataseries.getData().add(new XYChart.Data("Vật lí", transferPhysic));
                }
                if (!chemistryScore.equals("X")) {
                    Double transferChemistry = Double.parseDouble(chemistryScore);
                    dataseries.getData().add(new XYChart.Data("Hoá học", transferChemistry));
                }
                if (!bioScore.equals("X")) {
                    Double transferBio = Double.parseDouble(bioScore);
                    dataseries.getData().add(new XYChart.Data("Sinh học", transferBio));
                }
                if (!historyScore.equals("X")) {
                    Double transferHis = Double.parseDouble(historyScore);
                    dataseries.getData().add(new XYChart.Data("Lịch sử", transferHis));
                }
                if (!geoScore.equals("X")) {
                    Double transferGeo = Double.parseDouble(geoScore);
                    dataseries.getData().add(new XYChart.Data("Địa lý", transferGeo));
                }
                if (!gdcdScore.equals("X")) {
                    Double transferGDCD = Double.parseDouble(gdcdScore);
                    dataseries.getData().add(new XYChart.Data("GDCD", transferGDCD));
                }
                dataseries.getData().add(new XYChart.Data("Toán", mathScore));
                dataseries.getData().add(new XYChart.Data("Ngữ Văn", literatureScore));
                dataseries.getData().add(new XYChart.Data("Ngoại ngữ", foreignlanguage));
                dataseries.setName("Điểm thi THPTQG");
                score_barchart.getData().add(dataseries);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String nameLabel = MainUtils.setLabel("SELECT user_name FROM OOP_schema.users where username = ?", "user_name", LoginUtils.tempUserName);
        name_label.setText(nameLabel);
        tempName = nameLabel;
        idnum_label.setText(LoginUtils.tempUserName);
//        profile_button.setText(nameLabel);
        name_textfield.setText(nameLabel);
        name_textfield.setEditable(false);
        idnum_textfield.setEditable(false);
        idnum_textfield.setText(LoginUtils.tempUserName);
        trainingunit_combobox_fill.setItems(traningunit_list);
        trainingprogram_combobox_fill.setItems(trainingprogram_list);
        fillFormDashboard();
        fillTestDashboard();
        fillRequestDashboard();
        fillScoreDashboard();
        home_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dashboard_panel.setVisible(true);
                form_stackpanel.setVisible(false);
                testinfo_panel.setVisible(false);
                score_panel.setVisible(false);
                request_panel.setVisible(false);
                fillFormDashboard();
                fillRequestDashboard();
            }
        });
        home_button.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(true);
            form_line.setVisible(false);
            option_line.setVisible(false);
            request_line.setVisible(false);
        });
        form_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String checkForm = "SELECT * FROM candidate WHERE personal_id = '" + LoginUtils.tempUserName + "'";
                Connection connection = Database.connectDB();
                try {
                    Statement preparedStatement = connection.createStatement();
                    ResultSet receivedResult = preparedStatement.executeQuery(checkForm);
                    if (receivedResult.next()) {
                        dashboard_panel.setVisible(false);
                        form_stackpanel.setVisible(true);
                        showform_panel.setVisible(true);
                        showCandidateForm();
                        delete_button.setVisible(true);
                        change_button.setVisible(true);
                        fillform_panel.setVisible(false);
                        testinfo_panel.setVisible(false);
                        score_panel.setVisible(false);
                        request_panel.setVisible(false);
                    }
                    else {
                        dashboard_panel.setVisible(false);
                        form_stackpanel.setVisible(true);
                        fillform_panel.setVisible(true);
                        delete_button.setVisible(false);
                        change_button.setVisible(false);
                        showform_panel.setVisible(false);
                        testinfo_panel.setVisible(false);
                        score_panel.setVisible(false);
                        request_panel.setVisible(false);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        form_button.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(true);
            option_line.setVisible(false);
            request_line.setVisible(false);
        });
        request_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dashboard_panel.setVisible(false);
                form_stackpanel.setVisible(false);
                testinfo_panel.setVisible(false);
                score_panel.setVisible(false);
                request_panel.setVisible(true);
                showRequestInfo();
            }
        });
        request_button.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(false);
            option_line.setVisible(false);
            request_line.setVisible(true);
        });
        option_button.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(false);
            option_line.setVisible(true);
            request_line.setVisible(false);
        });
        form_dashboard_editbutton.setOnAction(form_button.getOnAction());
        form_dashboard_editbutton.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(true);
            option_line.setVisible(false);
            request_line.setVisible(false);
        });
        request_dashboard_viewbutton.setOnAction(request_button.getOnAction());
        request_dashboard_viewbutton.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(false);
            option_line.setVisible(false);
            request_line.setVisible(true);
        });

        logout_item.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Xác nhận thoát");
                    alert.setHeaderText(null);
                    alert.setContentText("Bạn có chắc chắn muốn thoát không?");
                    Optional<ButtonType> option = alert.showAndWait();

                    if (option.isPresent() && option.get() == ButtonType.OK) {

                        logout_item.getScene().getWindow().hide();
                        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
                        Stage stage = new Stage();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        EventHandler<ActionEvent> action1 = event -> {
            dashboard_panel.setVisible(false);
            form_stackpanel.setVisible(false);
            testinfo_panel.setVisible(true);
            score_panel.setVisible(false);
            request_panel.setVisible(false);
            idnum_testinfo_textfield.setText(MainUtils.setLabel("SELECT candidateid FROM OOP_schema.testinfo WHERE personal_id = ?","candidateid",LoginUtils.tempUserName));
            testvenue.setText(MainUtils.setLabel("SELECT testvenue FROM OOP_schema.testinfo WHERE personal_id = ?","testvenue",LoginUtils.tempUserName));
            room.setText(MainUtils.setLabel("SELECT testroom FROM OOP_schema.testinfo WHERE personal_id = ?","testroom",LoginUtils.tempUserName));
            String datetimeString = MainUtils.setLabel("SELECT checkintime FROM OOP_schema.testinfo WHERE personal_id = ?","checkintime",LoginUtils.tempUserName);
            if (datetimeString != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dateTime = LocalDateTime.parse(datetimeString, formatter);
                DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedString = dateTime.format(newFormatter);
                checkintime.setText(formattedString);
            }
            showSubjectsInfo();
        };
        testinfo_item.setOnAction(action1);
        testinfo_dashboard_viewbutton.setOnAction(action1);
        testinfo_dashboard_viewbutton.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(false);
            option_line.setVisible(true);
            request_line.setVisible(false);
        });
        EventHandler<ActionEvent> action2 = event -> {
            dashboard_panel.setVisible(false);
            form_stackpanel.setVisible(false);
            testinfo_panel.setVisible(false);
            score_panel.setVisible(true);
            request_panel.setVisible(false);
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            try {
                connection = Database.connectDB();
                preparedStatement = connection.prepareStatement("SELECT * from score WHERE personal_id = ?");
                preparedStatement.setString(1, LoginUtils.tempUserName);
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    MainUtils.getScore("math", math_score);
                    MainUtils.getScore("literature", literature_score);
                    MainUtils.getScore("foreignlanguage", foreignlanguage_score);
                    MainUtils.getScienceScore("physic", physic_score);
                    MainUtils.getScienceScore("history", history_score);
                    MainUtils.setVisibleScoreLabel(physic_score, history_score, physic_scorepane, history_scorepane);
                    MainUtils.getScienceScore("chemistry", chemistry_score);
                    MainUtils.getScienceScore("geography", geography_score);
                    MainUtils.setVisibleScoreLabel(chemistry_score, geography_score, chemistry_scorepane, geography_scorepane);
                    MainUtils.getScienceScore("bio", bio_score);
                    MainUtils.getScienceScore("gdcd", gdcd_score);
                    MainUtils.setVisibleScoreLabel(bio_score, gdcd_score, bio_scorepane, gdcd_scorepane);
                    MainUtils.calculateScore(math_score, physic_score, chemistry_score, a00);
                    MainUtils.calculateScore(math_score, physic_score, foreignlanguage_score, a01);
                    MainUtils.calculateScore(math_score, chemistry_score, bio_score, b00);
                    MainUtils.calculateScore(math_score, bio_score, foreignlanguage_score, b08);
                    MainUtils.calculateScore(literature_score, history_score, geography_score, c00);
                    MainUtils.calculateScore(literature_score, history_score, gdcd_score, c19);
                    MainUtils.calculateScore(math_score, literature_score, foreignlanguage_score, d00);
                    MainUtils.calculateScore(math_score, chemistry_score, foreignlanguage_score, d07);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        };
        score_item.setOnAction(action2);
        score_dashboard_viewbutton.setOnAction(action2);
        score_dashboard_viewbutton.setOnMouseClicked(mouseEvent -> {
            home_line.setVisible(false);
            form_line.setVisible(false);
            option_line.setVisible(true);
            request_line.setVisible(false);
        });
        save_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Connection connection = Database.connectDB();
                String checkAvailable = "SELECT * FROM candidate WHERE personal_id = '" + LoginUtils.tempUserName + "'";
                try {
                    statement = connection.createStatement();
                    result = statement.executeQuery(checkAvailable);
                    if (result.next()) {
                        changeCandidate();
                    }
                    else {
                        candidateAdd();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        naturalscience.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainUtils.checkRadioButton(history, geography, gdcd, physic, chemistry, bio);
                history.setDisable(true);
                geography.setDisable(true);
                gdcd.setDisable(true);
                physic.setSelected(true);
                chemistry.setSelected(true);
                bio.setSelected(true);
            }
        });
        socialscience.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainUtils.checkRadioButton(physic, chemistry, bio, history, geography, gdcd);
                physic.setDisable(true);
                chemistry.setDisable(true);
                bio.setDisable(true);
                history.setSelected(true);
                geography.setSelected(true);
                gdcd.setSelected(true);
            }
        });
        change_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showform_panel.setVisible(false);
                fillform_panel.setVisible(true);
                showCandidateFields();
            }
        });
        delete_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deleteCandidate();
                thptqg_radiobutton_dashboard.setSelected(false);
                method_textfield_dashboard.setText("");
                free_textfield_dashboard.setText("");
                subject_field_dashboard.setText("");
            }
        });
        viewform_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Connection connectedDB = Database.connectDB();
                String checkAvailable = "SELECT * FROM candidate WHERE personal_id = '" + LoginUtils.tempUserName + "'";
                try {
                    statement = connectedDB.createStatement();
                    result = statement.executeQuery(checkAvailable);
                    if (result.next()) {
                        fillform_panel.setVisible(false);
                        showform_panel.setVisible(true);
                        showCandidateForm();
                        delete_button.setVisible(true);
                        change_button.setVisible(true);
                    }
                    else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hộp thoại báo lỗi");
                        alert.setHeaderText("Lỗi");
                        alert.setContentText("Chưa có dữ liệu để xem!");
                        alert.showAndWait();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        addrequest_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert;
                if (requestorder_textfield.getText().isEmpty() || uni_textfield.getText().isEmpty() || majorname_textfield.getText().isEmpty() || trainingunit_combobox_fill.getValue() == null || trainingprogram_combobox_fill.getValue() == null) {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hộp thoại báo lỗi");
                    alert.setHeaderText("Lỗi");
                    alert.setContentText("Vui lòng điền tất cả các thông tin bắt buộc!");
                    alert.showAndWait();
                }
                else {
                    if (isNumeric(requestorder_textfield.getText())) {
                        Connection connection = Database.connectDB();
                        String checkRequest = "SELECT * FROM request WHERE request_order >= " + requestorder_textfield.getText() + " AND personal_id = '" + LoginUtils.tempUserName + "'";
                        Alert alert1 = null;
                        try {
                            statement = connection.createStatement();
                            result = statement.executeQuery(checkRequest);
                            if (result.next()) {
                                String checkOrder = "SELECT * FROM request WHERE request_order = " + requestorder_textfield.getText() + " AND personal_id = '" + LoginUtils.tempUserName + "'";
                                statement = connection.createStatement();
                                result = statement.executeQuery(checkOrder);
                                if (result.next()) {
                                    Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
                                    alert2.setTitle("Hộp thoại xác nhận");
                                    alert2.setHeaderText("Xác nhận");
                                    alert2.setContentText("Có muốn chỉnh sửa nguyện vọng không?");
                                    Optional<ButtonType> option = alert2.showAndWait();
                                    if (option.get() == null) {
                                        alert1 = new Alert(Alert.AlertType.ERROR);
                                        alert1.setTitle("Hộp thoại báo lỗi");
                                        alert1.setHeaderText("Lỗi");
                                        alert1.setContentText("Đã có nguyện vọng tương tự được thêm vào!");
                                        alert1.showAndWait();
                                    } else if (option.get() == ButtonType.OK) {
                                        changeRequest();
                                    } else if (option.get() == ButtonType.CANCEL) {
                                        alert1 = new Alert(Alert.AlertType.ERROR);
                                        alert1.setTitle("Hộp thoại báo lỗi");
                                        alert1.setHeaderText("Lỗi");
                                        alert1.setContentText("Đã có nguyện vọng tương tự được thêm vào!");
                                        alert1.showAndWait();
                                    }
                                } else {
                                    requestAdd();
                                }
                            } else {
                                String checkAvailable = "SELECT * FROM OOP_schema.request WHERE uni_name = ? AND major = ? AND training_unit = ? AND training_program = ?";
                                try (PreparedStatement statement1 = connection.prepareStatement(checkAvailable)) {
                                    statement1.setString(1, uni_textfield.getText());
                                    statement1.setString(2, majorname_textfield.getText());
                                    statement1.setString(3, trainingunit_combobox_fill.getValue());
                                    statement1.setString(4, trainingprogram_combobox_fill.getValue());
                                    ResultSet resultSet = statement1.executeQuery();
                                    if (resultSet.next()) {
                                        alert1 = new Alert(Alert.AlertType.ERROR);
                                        alert1.setTitle("Hộp thoại báo lỗi");
                                        alert1.setHeaderText("Lỗi");
                                        alert1.setContentText("Đã có nguyện vọng tương tự được thêm vào!");
                                        alert1.showAndWait();
                                    } else {
                                        requestAdd();
                                    }
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        showRequestInfo();
                    } else {
                        Alert alert1 = new Alert(Alert.AlertType.ERROR);
                        alert1.setTitle("Hộp thoại báo lỗi");
                        alert1.setHeaderText("Lỗi");
                        alert1.setContentText("Vui lòng điền đúng kiểu dữ liệu!");
                        alert1.showAndWait();
                    }
                }
            }
        });
        deleterequest_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deleteRequest();
            }
        });
        changeorder_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TextInputDialog requestOrder =  new TextInputDialog();
                requestOrder.setTitle("Nhập thông tin");
                requestOrder.getDialogPane().setContentText("Nhập thứ tự nguyện vọng cần thay đổi:");
                Optional<String> order = requestOrder.showAndWait();
                TextField num = requestOrder.getEditor();
                tempOrder = num.getText();
                if (order.isPresent()) {
                    if (num.getText().isEmpty()) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hộp thoại báo lỗi");
                        alert.setHeaderText("Lỗi");
                        alert.setContentText("Chưa nhập dữ liệu!");
                        alert.showAndWait();
                    }
                    else {
                        String checkOrder = "SELECT * FROM request WHERE personal_id = ? AND request_order = ?";
                        Connection Connect = Database.connectDB();
                        try (PreparedStatement prepare = Connect.prepareStatement(checkOrder)) {
                            prepare.setString(1, LoginUtils.tempUserName);
                            prepare.setString(2, num.getText());
                            try (ResultSet result = prepare.executeQuery()) {
                                if (result.next()) {
                                    String getUniField = "SELECT uni_name FROM request WHERE personal_id = ? AND request_order = ?";
                                    try (PreparedStatement prepare1 = Connect.prepareStatement(getUniField)) {
                                        prepare1.setString(1, LoginUtils.tempUserName);
                                        prepare1.setString(2, num.getText());
                                        try (ResultSet result1 = prepare1.executeQuery()) {
                                            if (result1.next()) {
                                                uni_textfield.setText(result1.getNString("uni_name"));
                                            }
                                        }
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }
                                    String getMajorField = "SELECT major FROM request WHERE personal_id = ? AND request_order = ?";
                                    try (PreparedStatement prepare2 = Connect.prepareStatement(getMajorField)) {
                                        prepare2.setString(1, LoginUtils.tempUserName);
                                        prepare2.setString(2, num.getText());
                                        try (ResultSet result2 = prepare2.executeQuery()) {
                                            if (result2.next()) {
                                                majorname_textfield.setText(result2.getNString("major"));
                                            }
                                        }
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }
                                    String getTUField = "SELECT training_unit FROM request WHERE personal_id = ? AND request_order = ?";
                                    try (PreparedStatement prepare3 = Connect.prepareStatement(getTUField)) {
                                        prepare3.setString(1, LoginUtils.tempUserName);
                                        prepare3.setString(2, num.getText());
                                        try (ResultSet result3 = prepare3.executeQuery()) {
                                            if (result3.next()) {
                                                trainingunit_combobox_fill.setValue(result3.getNString("training_unit"));
                                            }
                                        }
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }
                                    String getTPField = "SELECT training_program FROM request WHERE personal_id = ? AND request_order = ?";
                                    try (PreparedStatement prepare4 = Connect.prepareStatement(getTPField)) {
                                        prepare4.setString(1, LoginUtils.tempUserName);
                                        prepare4.setString(2, num.getText());
                                        try (ResultSet result4 = prepare4.executeQuery()) {
                                            if (result4.next()) {
                                                trainingprogram_combobox_fill.setValue(result4.getNString("training_program"));
                                            }
                                        }
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }
                                    requestorder_textfield.setText(num.getText());
                                }
                                else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("Hộp thoại báo lỗi");
                                    alert.setHeaderText("Lỗi");
                                    alert.setContentText("Chưa có dữ liệu trong hệ thống!");
                                    alert.showAndWait();
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
