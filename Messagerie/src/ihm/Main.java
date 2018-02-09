package ihm;

import java.io.PrintWriter;

import client.Client;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

	double yMessage = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		//Client user = new Client(server.adresse, server.nom);
		//ClientSend userS = new ClientSend(user.out);
		
//		PrintWriter out = new PrintWriter(new PrintWriter(socket.getOutputStream());
		
		primaryStage.setWidth(650);
		primaryStage.setHeight(660);
		
		primaryStage.setTitle("temporaire");	//Changer par le nom du serveur.
		//primaryStage.setTitle(server.name);
		
		Group root = new Group();
		Scene scene = new Scene(root);
		
		FlowPane chat = new FlowPane();			//Panel contenant les messages du chat.
		chat.setOrientation(Orientation.VERTICAL);
		FlowPane users = new FlowPane();		//Panel contenant la liste des utilisateurs.
		users.setOrientation(Orientation.VERTICAL);
		
		TextArea ta = new TextArea();			//Zone dans laquelle l'utilisateur Ècrira.
		Group buttons = new Group();			//Groupe qui contiendra les boutons.
		
		//Mise en place des bordures.
		chat.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		users.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		ta.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		
		//CrÈation des boutons
		Button sendBut = new Button("Send");
		Button wizzBut = new Button("Wizz");
		Button quitBut = new Button("Quit"); //Permet d'assurer que le client est bien dÈconnectÈ.
		
		wizzBut.setVisible(false);
		quitBut.setVisible(false);
		
		buttons.getChildren().add(sendBut);
		buttons.getChildren().add(wizzBut);
		buttons.getChildren().add(quitBut);
		
		//Taille et placement des diffÈrents modules.
			//Zone de chat
		chat.setMaxWidth(505);
		chat.setMinWidth(495);
		chat.setMaxHeight(455);
		chat.setMinHeight(445);
		
		chat.setLayoutX(10);
		chat.setLayoutY(10);

			//Listing users connected
		users.setMaxWidth(105);
		users.setMinWidth(95);
		users.setMaxHeight(605);
		users.setMinHeight(595);
		
		users.setLayoutX(520);
		users.setLayoutY(10);
		
			//TextArea
		ta.setMaxWidth(505);
		ta.setMinWidth(495);
		ta.setMaxHeight(105);
		ta.setMinHeight(95);
		
		ta.setLayoutX(10);
		ta.setLayoutY(460);
		
			//Button send
		sendBut.setMaxWidth(140);
		sendBut.setMinWidth(150);
		sendBut.setMaxHeight(45);
		sendBut.setMinHeight(35);
		
		sendBut.setLayoutX(20);
		sendBut.setLayoutY(570);
		
			//Button wizz
		wizzBut.setMaxWidth(140);
		wizzBut.setMinWidth(150);
		wizzBut.setMaxHeight(45);
		wizzBut.setMinHeight(35);
		
		wizzBut.setLayoutX(185);
		wizzBut.setLayoutY(570);
		
			//Button quit
		quitBut.setMaxWidth(140);
		quitBut.setMinWidth(150);
		quitBut.setMaxHeight(45);
		quitBut.setMinHeight(35);
		
		quitBut.setLayoutX(350);
		quitBut.setLayoutY(570);
		
		//Action bouton
			//Button send
		sendBut.setOnAction((javafx.event.ActionEvent event) -> {
			//Ajouter le nom de l'expediteur
			//userS.
			Text message = new Text("User : " + ta.getText());
			chat.getChildren().add(message);
		});
		
			//Button wizz
		wizzBut.setOnAction((javafx.event.ActionEvent event) -> {
			//Implementer fonction wizz
		});
		
			//Button quit
		quitBut.setOnAction((javafx.event.ActionEvent event) -> {
			//Implementer la deconnexion
		});
		
		//Multithreading pour M‡J users et chat [to do]
		
		
		root.getChildren().add(chat);
		root.getChildren().add(users);
		root.getChildren().add(buttons);
		root.getChildren().add(ta);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
}
