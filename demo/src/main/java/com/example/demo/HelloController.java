package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class HelloController  {
    @FXML
    private Label login_label;
    @FXML
    private TextField email_text_field;
    @FXML
    private PasswordField password_text_field;
    @FXML
    private CheckBox remember_me_check_box;
    @FXML
    private Label forgot_password_label;
    @FXML
    private Button login_button;
    @FXML
    private Label do_not_have_an_account_label;
    @FXML
    private Label register_label;


    @FXML
    protected void OnLoginButtonClick() {
        login_label.setText("Loh");
    }
}