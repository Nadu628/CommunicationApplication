package edu.farmingdale.comunication.capstone.project.viewModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogInController {
    //------------Login Screen--------------------------------------
    @FXML
    TextField usernameTextField, passwordTextField;
    @FXML
    Button logInButton, forgotPasswordButton;
    @FXML
    Hyperlink createAccountLink;

    private final String CORRECT_USERNAME;
    private final String CORRECT_PASSWORD;

    private void initialize() {

    }

    private void handleLogin(){
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        logInButton.setOnAction(event -> {
            String enteredUsername = username;
            String enteredPassword = password;

            if(enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)){

            }else{
                Label resultLabel = new Label("Invalid Username or Password");
            }
        });

    }
}
