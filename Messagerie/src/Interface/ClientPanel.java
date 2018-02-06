/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class ClientPanel extends Parent{
    TextArea textToSend;
    ScrollPane scrollReceivedText;
    TextFlow receivedText;
    Button sendBtn;
    Button clearBtn;
    TextArea connected;
    Text textMembers;
    
    ClientPanel(){
        Group root = new Group();
        textToSend = new TextArea();
        scrollReceivedText = new ScrollPane();
        receivedText = new TextFlow();
        sendBtn = new Button();
        clearBtn = new Button();
        connected = new TextArea();
        textMembers = new Text();
        
        this.getChildren().add(connected);
        this.getChildren().add(textMembers);
        this.getChildren().add(scrollReceivedText);
        this.getChildren().add(receivedText);
        this.getChildren().add(textToSend);
        this.getChildren().add(clearBtn);
        this.getChildren().add(sendBtn);
        
    }
    
}
    
    
