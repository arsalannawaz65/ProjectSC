import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainPage {

	Test olp = new Test();
	Stage secondstage = new Stage();
	
	void login()
{
	olp.firststage.close();	
	AnchorPane ac = new AnchorPane();
	
	
	Image image2 = new Image("main.png");
	ImageView iv3 = new ImageView();
    iv3.setImage(image2);
    iv3.setPreserveRatio(true);
    iv3.setPickOnBounds(true);
    ac.getChildren().add(iv3);
	

	Image image = new Image("logo.png");
	ImageView iv2 = new ImageView();
    iv2.setImage(image);
    iv2.setLayoutX(560);
    iv2.setLayoutY(5);
    iv2.prefHeight(78);
    iv2.prefWidth(150);
    iv2.setPreserveRatio(true);
    iv2.setPickOnBounds(true);
    iv2.setFitHeight(78);
    iv2.setFitWidth(150);
    
	//Main bar
    MenuBar menubar = new MenuBar();
	//Patients
	final Menu menu1 = new Menu("Patient");
	MenuItem menu11 = new MenuItem("Add Patient");
	menu11.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        secondstage.close();
	        AddPatient a = new AddPatient();
	        a.Method();
	        
	        
	    }
	});
	
	
	MenuItem menu12 = new MenuItem("View Patient");
	menu12.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        secondstage.close();
	        ViewPatient a = new ViewPatient();
	        try {
				a.Method();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
	        
	    }
	});
	
	
	
	
	menu1.getItems().add(menu11);
	menu1.getItems().add(menu12);
	
	//Doctors
	 final Menu menu2 = new Menu("Doctor");
	 MenuItem menu21 = new MenuItem("Add Doctor");
	 menu21.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        AddDoctor a = new AddDoctor();
		        a.Method();
		        
		        
		    }
		});
	 
	 MenuItem menu22 = new MenuItem("View Doctor");
	 menu22.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        ViewDoctors a = new ViewDoctors();
		        try {
					a.Method();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        
		    }
		});
	 
	 
	 menu2.getItems().add(menu21);
	 menu2.getItems().add(menu22);
	 
	 //Billing
	 final Menu menu3 = new Menu("Billing");
	 MenuItem m31 = new MenuItem("Add Bill");
	 m31.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        AddBill a = new AddBill();
		        a.Method();
		        
		        
		    }
		});
	 
	 MenuItem m32 = new MenuItem("Views Bills");
	 m32.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        ViewBill a = new ViewBill();
		        try {
					a.Method();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        
		    }
		});
	 
	 menu3.getItems().add(m31);
	 menu3.getItems().add(m32);
	 
	 
	 //rooms
	 final Menu menu4 = new Menu("Rooms");
	 MenuItem m41 = new MenuItem("View Rooms");
	 m41.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        ViewRoomImages a = new ViewRoomImages();
		        a.Method();
		        
		        
		    }
		});
	 
	 
	 MenuItem m42 = new MenuItem("Book Room");
	 m42.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        AddRoom a = new AddRoom();
		        a.Method();
		        
		        
		    }
		});
	 
	 MenuItem m43 = new MenuItem("View Bookings");
	 m43.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        ViewRoom a = new ViewRoom();
		        try {
					a.Method();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        
		    }
		});
	 
	 
	 menu4.getItems().add(m41);
	 menu4.getItems().add(m42);
	 menu4.getItems().add(m43);
	 
	 //More
	 final Menu menu5 = new Menu("More");
	 
	 MenuItem m53 = new MenuItem("Home");
	 m53.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	
		    	ac.getChildren().remove(iv3);
		    	ac.getChildren().remove(iv2);
		    	ac.getChildren().remove(menubar);
		    	
		     
		     try{
		    	 ac.getChildren().add(iv3);
		    	 ac.getChildren().add(menubar);
			  	 ac.getChildren().add(iv2);
		   
		  	 }
		     catch(Exception p)
		     {
		    	
		     }
		        
		    }
		});
	 
	 MenuItem m51 = new MenuItem("About");
	 m51.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	ac.getChildren().remove(iv3);
		    	ac.getChildren().remove(iv2);
		    	ac.getChildren().remove(menubar);
		    	Image image4 = new Image("main2.png");
		    	ImageView iv4 = new ImageView();
		        iv4.setImage(image4);
		        iv4.setPreserveRatio(true);
		        iv4.setPickOnBounds(true);
		       ac.getChildren().add(iv4);
		       ac.getChildren().add(menubar);
		  	 ac.getChildren().add(iv2);
		       
		        
		    }
		});
	 MenuItem m52 = new MenuItem("Log out");
	 menu5.getItems().add(m53);
	 menu5.getItems().add(m51);
	 menu5.getItems().add(m52);
	 m52.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        secondstage.close();
		        olp.firststage.show();
		        
		    }
		});
	 
	 
	 
	 menubar.setLayoutX(200);
	 menubar.getMenus().addAll(menu1, menu2, menu3,menu4,menu5);
	 ac.getChildren().add(menubar);
	 ac.getChildren().add(iv2);
	
	Scene scene = new Scene(ac,750,500);
	secondstage.setTitle("Hub River Hospital");
	secondstage.setResizable(false);
	secondstage.setScene(scene);
	secondstage.show();
	
}
	
}
