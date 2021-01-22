import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AddRoom {
	public static Font bigFont = new Font("Serif", 35);
	public static Font font = new Font("Serif", 17);
	Stage addpatientstage = new Stage();
	static public FileInputStream in = null;
	static public TextField[] inputs = new TextField[10];
	static public Button Submit = new Button("Submit");
	static public Label show = new Label();
	static public File file = new File("AddRoom.txt");
	void Method()
	{
		AnchorPane ac2 = new AnchorPane();
		ac2.setStyle("-fx-background-color: #3949ab;");
		show.setText("");
		Button b = new Button("Home");
		b.setStyle("-fx-background-color: green;");
		b.prefWidth(66);
		b.prefHeight(30);
		b.setLayoutX(20);
		b.setLayoutY(20);
		b.setTextFill(Color.WHITE);
		ac2.getChildren().add(b);
		Label l = new Label("Book New Room");
		l.setLayoutX(236);
		l.setTextFill(Color.WHITE);
		l.setLayoutY(14);
		l.prefWidth(278);
		l.prefHeight(42);

		l.setFont(bigFont);

		 b.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {

			    	addpatientstage.close();
			    	MainPage main = new MainPage();
			    	main.login();


			    }
			});

		//container
		Pane pane = new Pane();
		pane.setStyle(
                "-fx-background-color: white; " +
                "-fx-effect: dropshadow(three-pass-box, black, 10, 0, 0, 0);"
        );
		pane.prefHeight(386);
		pane.prefWidth(452);
		pane.relocate(150, 66);
		pane.setScaleX(1);
		pane.setScaleY(1);
		pane.setScaleZ(1);
		pane.setMinHeight(386);
		pane.setMinWidth(452);
		ac2.getChildren().add(l);

		for(int a=0;a<10;a++)
		{
			inputs[a]= new TextField();
		}

		inputs[0].setLayoutX(39);
		inputs[0].setLayoutY(50);
		inputs[0].setPromptText("Booker's Name");

		inputs[1].setLayoutX(241);
		inputs[1].setLayoutY(50);

		inputs[1].setPromptText("Patient's Name");

		inputs[2].setLayoutX(39);
		inputs[2].setLayoutY(92);

		inputs[2].setPromptText("Patient's Contact");



		inputs[3].setLayoutX(241);
		inputs[3].setLayoutY(92);

		inputs[3].setPromptText("Patient's Email");


		inputs[4].setLayoutX(39);
		inputs[4].setLayoutY(133);
		inputs[4].setPromptText("Patient's Address");

		inputs[5].setLayoutX(39);
		inputs[5].setLayoutY(181);
		inputs[5].setPromptText("Room Number");

		inputs[6].setLayoutX(176.5);
		inputs[6].setLayoutY(181);
		inputs[6].setPromptText("Room Type");


		inputs[7].setLayoutX(314);
		inputs[7].setLayoutY(181);
		inputs[7].setPromptText("Booking Date");


		inputs[8].setLayoutX(39);
		inputs[8].setLayoutY(222);

		inputs[8].setPromptText("Room Details");

		inputs[9].setLayoutX(40);
		inputs[9].setLayoutY(263);

		inputs[9].setPromptText("Other Details");


		//height width of all boxes
		inputs[1].setMinHeight(25);
		inputs[2].setMinHeight(25);
		inputs[3].setMinHeight(25);
		inputs[4].setMinHeight(25);
		inputs[5].setMinHeight(25);
		inputs[6].setMinHeight(25);
		inputs[7].setMinHeight(25);
		inputs[8].setMinHeight(25);
		inputs[9].setMinHeight(63);

		inputs[0].setMinWidth(170);
		inputs[1].setMinWidth(165);
		inputs[2].setMinWidth(170);
		inputs[3].setMinWidth(165);

		inputs[4].setMinWidth(385);
		inputs[8].setMinWidth(385);
		inputs[9].setMinWidth(385);

		inputs[5].setMinWidth(110);
		inputs[6].setMinWidth(110);
		inputs[7].setMinWidth(110);
		inputs[5].setMaxWidth(110);
		inputs[6].setMaxWidth(110);
		inputs[7].setMaxWidth(110);


		for(int a=0;a<10;a++)
		{
			pane.getChildren().add(inputs[a]);
		}


		show.prefWidth(372);
		show.prefHeight(25);
		show.setLayoutX(40);
		show.setLayoutY(14);
		show.setTextFill(Color.GREEN);

		Submit.setStyle("-fx-background-color: green;");
		Submit.prefWidth(66);
		Submit.prefHeight(30);
		Submit.setLayoutX(187);
		Submit.setLayoutY(334);
		Submit.setTextFill(Color.WHITE);
		Submit.setFont(font);
		pane.getChildren().add(Submit);
		pane.getChildren().add(show);
		Submit.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {

		    	try{

		    		String[] values = new String[10];
		    		for(int a=0;a<10;a++)
		    		{
		    			values[a]=inputs[a].getText();
		    			inputs[a].setText("");
		    		}
		    		if(!file.exists())
		    		{
		    			file.createNewFile();
		    			PrintWriter value = new PrintWriter(file);
		 
		    			for(int a=0;a<10;a++)
		    			{
		    				value.print(values[a]+",");
		    			}
		    			value.close();

		    			show.setText("Room number "+values[5]+" by "+values[0]+"  Successfully ");
		    		}

		    		else{
		    			PrintWriter value = new PrintWriter(new FileWriter(file, true));
		    			
		    			for(int a=0;a<10;a++)
		    			{
		    				value.print(values[a]+",");
		    				
		    			}
		    			value.println("");
		    			value.close();
		    			show.setText("Room number "+values[5]+" by "+values[0]+"  Successfully ");
		    		}
		    	}
		    	catch(Exception o){

		    		show.setText("Can't Connect to System right now");

		    	}


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
