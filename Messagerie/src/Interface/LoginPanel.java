/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author artde
 */
public class LoginPanel  extends Parent{
    TextField loginInput;
    PasswordField passwordInput;
    Text loginText;
    Text passwordText;
    Button loginBtn;
    Button cancelBtn;
    
    LoginPanel(){
        Group root = new Group();
        loginInput = new TextField();
        loginInput.setLayoutX(50);
        loginInput.setLayoutY(70);
        loginInput.setMaxHeight(5);
        loginInput.setMaxWidth(200);
        passwordInput = new PasswordField();
        passwordInput.setLayoutX(50);
        passwordInput.setLayoutY(150);
        passwordInput.setMaxHeight(5);
        passwordInput.setMaxWidth(200);
        loginText = new Text();
        loginText.setLayoutX(50);
        loginText.setLayoutY(50);
        loginText.setText("Identifiant :");
        passwordText = new Text();
        passwordText.setLayoutX(50);
        passwordText.setLayoutY(130);
        passwordText.setText("Mots de passe :");
        loginBtn = new Button();
        loginBtn.setLayoutX(130);
        loginBtn.setLayoutY(210);
        loginBtn.setText("Connexion");
        cancelBtn = new Button();
        cancelBtn.setLayoutX(50);
        cancelBtn.setLayoutY(210);
        cancelBtn.setText("Annuler");
        
        this.getChildren().add(loginText);
        this.getChildren().add(loginInput);
        this.getChildren().add(passwordText);
        this.getChildren().add(passwordInput);
        this.getChildren().add(loginBtn);
        this.getChildren().add(cancelBtn);
        
    }
    
}
