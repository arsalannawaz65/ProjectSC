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
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ViewPatient {
	public static Font bigFont = new Font("Serif", 35);
	public static Font font = new Font("Serif", 17);
	
	Stage addpatientstage = new Stage();
	static public FileInputStream in = null;
	
	static public File file = new File("AddPatient.txt");
	void Method() throws IOException
	{
		
		AnchorPane ac2 = new AnchorPane();
		ac2.setStyle("-fx-background-color: #3949ab;");
		
		Button b = new Button("Home");
		b.setStyle("-fx-background-color: green;");
		b.prefWidth(66);
		b.prefHeight(30);
		b.setLayoutX(20);
		b.setLayoutY(20);
		b.setTextFill(Color.WHITE);
		ac2.getChildren().add(b);
		Label l = new Label("View Patients");
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
		
		 
		
		    Collection<CountryData> list = Files.readAllLines(new File("AddPatient.txt").toPath())
                    .stream()
                    .map(line -> {
                        String[] details = line.split(",");
                        CountryData cd = new CountryData();
                        cd.set1(details[0]);
                        cd.set2(details[1]);
                        cd.set3(details[2]);
                        cd.set4(details[3]);
                        cd.set5(details[4]);
                        cd.set6(details[5]);
                        cd.set7(details[6]);
                        cd.set8(details[7]);
                        cd.set9(details[8]);
                        cd.set10(details[9]);
                        return cd;
                    })
                    .collect(Collectors.toList());

    ObservableList<CountryData> details = FXCollections.observableArrayList(list);

    TableView<CountryData> tableView = new TableView<>();
    TableColumn<CountryData, String> col1 = new TableColumn<>("First Name");
    TableColumn<CountryData, String> col2 = new TableColumn<>("Last Name");
    TableColumn<CountryData, String> col3 = new TableColumn<>("Contact");
    TableColumn<CountryData, String> col4 = new TableColumn<>("Email");
    TableColumn<CountryData, String> col5 = new TableColumn<>("Address");
    TableColumn<CountryData, String> col6 = new TableColumn<>("Blood Group");
    TableColumn<CountryData, String> col7 = new TableColumn<>("Current Date");
    TableColumn<CountryData, String> col8 = new TableColumn<>("Date of Birth");
    TableColumn<CountryData, String> col9 = new TableColumn<>("Diagnose");
    TableColumn<CountryData, String> col10 = new TableColumn<>("Message");
    
    tableView.setMaxHeight(361);
    tableView.setMinWidth(426);
    tableView.setMaxWidth(426);
    tableView.setEditable(false);
    tableView.setLayoutX(14);
    tableView.setLayoutY(14);	
    tableView.setMinHeight(361);

    tableView.getColumns().addAll(col1, col2, col3, col4,col5,col6,col7,col8,col9,col10);

    col1.setCellValueFactory(data -> data.getValue().c1());
    col2.setCellValueFactory(data -> data.getValue().c2());
    col3.setCellValueFactory(data -> data.getValue().c3());
    col4.setCellValueFactory(data -> data.getValue().c4());
    col5.setCellValueFactory(data -> data.getValue().c5());
    col6.setCellValueFactory(data -> data.getValue().c6());
    col7.setCellValueFactory(data -> data.getValue().c7());
    col8.setCellValueFactory(data -> data.getValue().c8());
    col9.setCellValueFactory(data -> data.getValue().c9());
    col10.setCellValueFactory(data -> data.getValue().c10());
    tableView.setItems(details);

    





 pane.getChildren().add(tableView);
		
		
		ac2.getChildren().add(pane);

		
		
Scene scene = new Scene(ac2,750,500);
addpatientstage.setTitle("Hub River Hospital");
addpatientstage.setResizable(false);
addpatientstage.setScene(scene);
addpatientstage.show();
	}
}
	
	

