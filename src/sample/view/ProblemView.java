package sample.view;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.entities.Problem;
import sample.controller.ProblemController;
import java.io.*;
import java.net.URL;


public class ProblemView {
	Parent Root;
	URL url;
		
		public ProblemView() {
		}
		
		public static void insert(Scene scene){
			
			Button insert = (Button) scene.lookup("#AjoutBtn");
			TextArea name = (TextArea) scene.lookup("#ProbName");
			insert.setOnAction(event -> {
				
				String nm=name.getText();
				
				ProblemController.insert(nm);
			});
			
		}
		
	
		
		public static void fillTable (Scene scene) {
			Button load=(Button) scene.lookup("#LoadDataProb");
			
			load.setOnAction(event ->{
			try{
				TableView table  = (TableView) scene.lookup("#table");
				
				//view
				ProblemController controller =new ProblemController();
				
				table.setItems(controller.fillTable());
				
				
				TableColumn<Problem,Integer> columnid = new TableColumn<Problem,Integer>("Identifiant");
				columnid.setCellValueFactory(new PropertyValueFactory("id"));
				TableColumn<Problem,String> columnname = new TableColumn<Problem,String>("Nom");
				columnname.setCellValueFactory(new PropertyValueFactory("name"));
				
				table.getColumns().setAll(columnid, columnname);
				table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);//don't touch this!! remove it and table gets messed up! don't know what it does tho!!!
				
			} catch (Exception e){
				e.printStackTrace();
			}
			
			
			
		});
		}
		
		
		
		
		public void Dashboard(Scene scene,String b){
			Button Dashboardprob=(Button)scene.lookup("#Dashboard");
			
				
				
				Dashboardprob.setOnAction(event -> {
					url  = getClass().getClassLoader().getResource("sample/view/fxml/Dashboard.fxml");
					try {
						Root = FXMLLoader.load(url);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
						Scene sc2 = new Scene(Root, 720, 540);
					Stage newstage =  (Stage)((Node) event.getSource()).getScene().getWindow();
					newstage.setScene(sc2);
					newstage.show();
						newstage.setTitle("Menu");
					TextField username =(TextField)sc2.lookup("#txtUserName");
					username.setText(b);
					HomeView view = new HomeView();
					view.dci(sc2,b);
					view.med(sc2,b);
					view.problem(sc2,b);
					view.service(sc2,b);
					view.service(sc2,b);
					view.userpending(sc2,b);
					view.user(sc2,b);
					view.Home(sc2,b);
					view.intervention(sc2,b);
					
				});
				
			
			
			
		}
		
		
		
}
