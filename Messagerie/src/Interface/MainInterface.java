/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class MainInterface extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void start(Stage stage) throws Exception {
        ClientPanel clientPanel = new ClientPanel();
        Group root = new Group();
        root.getChildren().add(clientPanel);
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Mon chat");
        stage.setScene(scene);
        stage.show();
    }
    
}
