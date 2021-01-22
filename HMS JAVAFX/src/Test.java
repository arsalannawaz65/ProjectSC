import java.util.ResourceBundle.Control;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Test extends Application {

	public static  Button b;
	public static TextField t;
	public static PasswordField f;
	public static Label l;
	public static Stage firststage= new Stage();
	
	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage arg) throws Exception {
		this.firststage=arg;
		AnchorPane root = new AnchorPane();
		root.prefHeight(729);
		root.prefWidth(567);
		root.setStyle("-fx-background-color: #3949ab;");
		Pane pane = new Pane();
		pane.setStyle(
                "-fx-background-color: white; " +
                "-fx-effect: dropshadow(three-pass-box, black, 10, 0, 0, 0);"
        );
		
		MainPage Redirect = new MainPage();
		
		b = new Button("Submit");
		b.setStyle("-fx-background-color: green;");
		b.prefWidth(66);
		b.prefHeight(30);
		b.setLayoutX(114);
		b.setLayoutY(240);
		b.setTextFill(Color.WHITE);
		b.setOnAction(new EventHandler() {
			 
		    

			@Override
			public void handle(Event event) {
				String username=t.getText().toUpperCase();
				if(username.equals("PROGRAMMER") && f.getText().equals("12345") )
				{
					t.setText("");
					f.setText("");
					l.setText(" ");
				Redirect.login();	
				}
				else
				l.setText("Invalid Username or Password");
				
				f.setText("");
				
			}
		});
		
		
		Image image = new Image("logo.png");
		ImageView iv2 = new ImageView();
        iv2.setImage(image);
        iv2.setLayoutX(72);
        iv2.setLayoutY(35);
        iv2.prefHeight(78);
        iv2.prefWidth(150);
        iv2.setPreserveRatio(true);
        iv2.setPickOnBounds(true);
        iv2.setFitHeight(78);
        iv2.setFitWidth(150);
        
		
		
		
		
		 t = new TextField();
		t.setLayoutX(73);
		t.setLayoutY(126);
		t.prefHeight(25);
		t.prefWidth(148);
		t.setPromptText("Username");
		
		 f = new PasswordField();
		f.setLayoutX(73);
		f.setLayoutY(179);
		f.prefHeight(25);
		f.prefWidth(148);
		f.setPromptText("Passsword");
		
		l= new Label();
		l.setLayoutX(65);
		l.setLayoutY(275);
		l.prefHeight(200);
		l.prefWidth(31);
		l.setTextFill(Color.RED);
		
		pane.getChildren().add(b);
		pane.getChildren().add(l);
		pane.getChildren().add(t);
		pane.getChildren().add(iv2);
		pane.getChildren().add(f);
		pane.prefHeight(294);
		pane.prefWidth(357);
		pane.relocate(234, 105);
		pane.setScaleX(1);
		pane.setScaleY(1);
		pane.setScaleZ(1);
		pane.setMinHeight(300);
		pane.setMinWidth(300);
		root.getChildren().add(pane);
		
		Scene scene = new Scene(root,750,500);
		
		arg.setTitle("Hub River Hospital");
		arg.setResizable(false);
		arg.setScene(scene);
		arg.show();
		
	}

	

}
