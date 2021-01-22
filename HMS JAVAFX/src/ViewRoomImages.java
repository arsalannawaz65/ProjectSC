import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ViewRoomImages {
	public static Font bigFont = new Font("Serif", 35);
	public static Font font = new Font("Serif", 17);
	static public int a=1;
	Stage addpatientstage = new Stage();
	static public FileInputStream in = null;
	
	void Method()
	{
		
		AnchorPane ac2 = new AnchorPane();
		
		
		Button b = new Button("Home");
		b.setStyle("-fx-background-color: green;");
		b.prefWidth(66);
		b.prefHeight(30);
		b.setLayoutX(20);
		b.setLayoutY(5);
		b.setTextFill(Color.WHITE);
		ac2.getChildren().add(b);
		
		Button b1 = new Button("<<");
		b1.setStyle("-fx-background-color: green;");
		b1.prefWidth(66);
		b1.prefHeight(30);
		b1.setLayoutX(200);
		b1.setLayoutY(5);
		b1.setTextFill(Color.WHITE);
		b1.setFont(font);
		ac2.getChildren().add(b1);
		
		Label label = new Label("Room Id:1");
		label.setFont(font);
		label.setLayoutX(360);
		label.setLayoutY(10);
		ac2.getChildren().add(label);
		
				
		
		
		Button b2 = new Button(">>");
		b2.setStyle("-fx-background-color: green;");
		b2.prefWidth(66);
		b2.prefHeight(30);
		b2.setLayoutX(600);
		b2.setLayoutY(5);
		b2.setFont(font);
		b2.setTextFill(Color.WHITE);
		ac2.getChildren().add(b2);
		
		 b.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    	addpatientstage.close();
			    	MainPage main = new MainPage();
			    	main.login();
			       
			        
			    }
			});
		 
		Pane pane = new Pane();
		pane.setLayoutY(50);
		
		 Image image2 = new Image("1.png");
			ImageView iv3 = new ImageView();
		    iv3.setImage(image2);
		    iv3.setPreserveRatio(true);
		    iv3.setPickOnBounds(true);
		    pane.getChildren().add(iv3);
		    
		    
		    
		    
		    b2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	a++;
				    	
				    	pane.getChildren().removeAll();	
			    	if(a==1)
			    	{Image image2 = new Image("1.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:1");
			    		
			    	}
			    	if(a==2)
			    	{Image image2 = new Image("2.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:2");
			    		
			    	}
			    	if(a==3)
			    	{Image image2 = new Image("3.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:3");
			    		
			    	}
			    	if(a==4)
			    	{Image image2 = new Image("4.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:4");
			    		
			    	}
			    	if(a==5)
			    	{Image image2 = new Image("5.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:5");
			    		
			    	}
			    	if(a>5)
			    	{
			    		a=1;
			    		Image image2 = new Image("1.png");
						ImageView iv3 = new ImageView();
					    iv3.setImage(image2);
					    iv3.setPreserveRatio(true);
					    iv3.setPickOnBounds(true);
					    pane.getChildren().add(iv3);
					    label.setText("Room Id:1");
			    	}
			    	ac2.getChildren().remove(pane);
			    	ac2.getChildren().add(pane);
			       
			        
			    }
			});
		    
		    
		    b1.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	a--;
			    	pane.getChildren().removeAll();
			    	if(a==1)
			    	{Image image2 = new Image("1.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:1");
			    		
			    	}
			    	if(a==2)
			    	{Image image2 = new Image("2.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:2");
			    		
			    	}
			    	if(a==3)
			    	{Image image2 = new Image("3.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:3");
			    		
			    	}
			    	if(a==4)
			    	{Image image2 = new Image("4.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:4");
			    		
			    	}
			    	if(a==5)
			    	{Image image2 = new Image("5.png");
					ImageView iv3 = new ImageView();
				    iv3.setImage(image2);
				    iv3.setPreserveRatio(true);
				    iv3.setPickOnBounds(true);
				    pane.getChildren().add(iv3);
				    label.setText("Room Id:5");
				    	
			    	}
			    	if(a<1)
			    	{
			    		a=5;
			    		Image image2 = new Image("5.png");
						ImageView iv3 = new ImageView();
					    iv3.setImage(image2);
					    iv3.setPreserveRatio(true);
					    iv3.setPickOnBounds(true);
					    pane.getChildren().add(iv3);
					    label.setText("Room Id:5");
			    	}
			    	ac2.getChildren().remove(pane);
			    	ac2.getChildren().add(pane);
			       
			        
			    }
			});
		    ac2.getChildren().add(pane);
		 
		
		
	
Scene scene = new Scene(ac2,750,500);
addpatientstage.setTitle("Hub River Hospital");
addpatientstage.setResizable(false);
addpatientstage.setScene(scene);
addpatientstage.show();
	}
	
	
	
}
