/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;



import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class LoginPanel  extends Application{
    TextField loginInput;
    PasswordField passwordInput;
    Text loginText;
    Text passwordText;
    Button loginBtn;
    Button cancelBtn;
    Text error;
    
    public static void main(String[] args) {
         Application.launch(LoginPanel.class, args);
    }
    
    public void start(Stage stage) throws Exception {
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
        loginBtn.setOnAction((javafx.event.ActionEvent event) -> {
            ConnectAPI api = new ConnectAPI(loginInput.getText(), passwordInput.getText());
            Stage serveur = new Stage();
            List<Serveur> list = api.getConnextion();
            ServeurPanel client = new ServeurPanel(list,api);
            if(list != null){
                try {
                    client.start(serveur);
                    stage.close();
                } catch (Exception ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                error.setText("Mots de passe ou identifiant incorect");
            }
        });
        cancelBtn = new Button();
        cancelBtn.setLayoutX(50);
        cancelBtn.setLayoutY(210);
        cancelBtn.setText("Annuler");
        cancelBtn.setOnAction((event) ->{
            stage.close();
        });
        error = new Text();
        error.setLayoutX(50);
        error.setLayoutY(270);
        error.setFill(Color.RED);
        
        root.getChildren().add(loginText);
        root.getChildren().add(loginInput);
        root.getChildren().add(passwordText);
        root.getChildren().add(passwordInput);
        root.getChildren().add(loginBtn);
        root.getChildren().add(cancelBtn);
        root.getChildren().add(error);
        Scene scene = new Scene(root, 250, 300);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        
    }
}
