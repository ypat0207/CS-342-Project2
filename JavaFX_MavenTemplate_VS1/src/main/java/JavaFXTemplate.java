import java.io.FileInputStream;
import java.io.InputStream;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;


public class JavaFXTemplate extends Application {

	
	 private VBox root, root2;
	 private GridPane gridPane;
	 private Label mainScreenLabel;
	 private Tooltip t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Keno Game");
		MenuBar m = new MenuBar();
		Menu menuOne = new Menu("Menu");
		MenuItem iOne = new MenuItem("Display Rules");
		MenuItem iTwo = new MenuItem("Display Odds");
		MenuItem iThree = new MenuItem("Exit");
		menuOne.getItems().add(iOne);
		menuOne.getItems().add(iTwo);
		menuOne.getItems().add(iThree);
		m.getMenus().addAll(menuOne);
		Label mainScreenLabel = new Label();
		mainScreenLabel.setStyle("-fx-text-fill: Red");
		mainScreenLabel.setText("KENO");
		mainScreenLabel.setAlignment(Pos.CENTER);
		
		Button button = new Button("Play Game");
		button.setStyle("-fx-background-color:\n"
				+ "            linear-gradient(#e68400, #ffd65b),\n"
				+ "            linear-gradient(#f2ba44, #ffef84),\n"
				+ "            linear-gradient(#efaa22, #ffea6a),\n"
				+ "            linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%),\n"
				+ "            linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-insets: 0,1,2,3,0;\n"
				+ "    -fx-text-fill: #654b00;\n"
				+ "    -fx-font-weight: bold;\n"
				+ "    -fx-font-size: 14px;\n"
				+ "    -fx-padding: 10 20 10 20;");
		Image image = new Image("Keno-Game.png");
		ImageView imageView=new ImageView();
		imageView.setImage(image);
		iOne.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
        		
				final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
                Label rules = new Label("Rules: \n \n 1. Bet card: a grid of numbers (1-80) that the player uses to choose what numbers to play \n \n 2. Number of spots: a player can choose to play 1 number(1 spot), 4 numbers(4 spots), 8 numbers(8 spots) or 10 numbers(10 spots) \n \n    - One bet card plays only one of the designated number of spots. \n \n 3. Drawings: each unique selection of 20 random numbers, with no duplicates, by the game. Players may play a single bet card for a minimum of 1 and maximum of 4 drawings.");
                rules.setWrapText(true);
                dialogVbox.getChildren().add(rules);
                
                Scene dialogScene = new Scene(dialogVbox, 500, 200);
                dialog.setScene(dialogScene);
                dialog.show();
        }
			
		});
		
		 root = new VBox(m,button);
	     Scene scene = new Scene(root, 1200,1200);
	  
			primaryStage.setScene(scene);
			primaryStage.show();
		
				
		
	}

}
