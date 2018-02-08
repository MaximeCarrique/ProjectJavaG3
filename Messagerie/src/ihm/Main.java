package ihm;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setWidth(650);
		primaryStage.setHeight(660);
		
		primaryStage.setTitle("temporaire");	//Changer par le nom du serveur.
		
		Group root = new Group();
		Scene scene = new Scene(root);
		
		FlowPane chat = new FlowPane();			//Panel contenant les messages du chat.
		FlowPane users = new FlowPane();		//Panel contenant la liste des utilisateurs.
		
		TextArea ta = new TextArea();			//Zone dans laquelle l'utilisateur écrira.
		Group buttons = new Group();			//Groupe qui contiendra les boutons.
		
		//Mise en place des bordures.
		chat.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		users.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		ta.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		
		//Création des boutons
		
		
		//Taille et placement des différents modules.
		chat.setMaxWidth(505);
		chat.setMinWidth(495);
		chat.setMaxHeight(455);
		chat.setMinHeight(445);
		
		chat.setLayoutX(10);
		chat.setLayoutY(10);
		
		users.setMaxWidth(105);
		users.setMinWidth(95);
		users.setMaxHeight(605);
		users.setMinHeight(595);
		
		users.setLayoutX(520);
		users.setLayoutY(10);
		
		ta.setMaxWidth(505);
		ta.setMinWidth(495);
		ta.setMaxHeight(105);
		ta.setMinHeight(95);
		
		ta.setLayoutX(10);
		ta.setLayoutY(460);
		
		//Placer le groupe Buttons
		
		
		//Multithreading pour MàJ users et chat [to do]
		
		
		root.getChildren().add(chat);
		root.getChildren().add(users);
		root.getChildren().add(buttons);
		root.getChildren().add(ta);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
