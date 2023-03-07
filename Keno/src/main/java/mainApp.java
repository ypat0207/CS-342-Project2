import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;

import javafx.util.Duration;

import javafx.stage.Stage;

public class mainApp extends Application {
    
    private Button playButton;	
    private Button startDrawButton;	
    private Button chooseRandomButton;	
    private Button nextDrawButton;	
    private Button exitButton;
    private MenuBar menuBar;
    private GridPane gameBoard;
    private GridPane randomBoard;
    private ComboBox spotsBox;
    private ComboBox drawsBox;
    private Image logoImg;
    private ImageView logoImgView;
    private kenoGame game;
    private betCard card;
    private BorderPane startScreenPane;
    private EventHandler<ActionEvent> GPHandler;

    public static void main(String[] args) {
	launch(args);
    }
    
    private void initGame() {
	// TODO
    }

    private void showDraws() {
	// TODO
    }

    private void changeLook() {
	// TODO
    }

    private void addGrid(GridPane grid) {
	// TODO 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Keno");
	
	// Start scene
	BorderPane borderPane = new BorderPane();
	borderPane.setPrefSize(700, 700);
	FileInputStream imageStream = new FileInputStream("/Users/yash/Desktop/CS-342-Project2/Keno/src/main/resource/images/keno.png");
	Image image = new Image(imageStream);
	ImageView imageView = new ImageView(image);
	imageView.setFitHeight(200);
	imageView.setFitWidth(200);
	borderPane.setCenter(imageView);
	FileInputStream background = new FileInputStream("/Users/yash/Desktop/CS-342-Project2/Keno/src/main/resource/images/bluemoon.png");
	Image image2 = new Image(background);
	ImagePattern pattern = new ImagePattern(image2);

	VBox vb1 = new VBox(borderPane);
	
	Scene startScene = new Scene(vb1, 700, 700);
	startScene.setFill(pattern);
	
	// Rules scene
	Scene rulesScene;

	// Odds scene
	Scene oddsScene;

	// Card scene
	VBox vb2 = new VBox();
	Scene cardScene = new Scene(vb2, 700, 700);

	// Game scene
	VBox vb3 = new VBox();
	Scene gameScene = new Scene(vb3, 700, 700);

	// End scene
	VBox vb4 = new VBox();
	Scene endScene = new Scene(vb4, 700, 700);

	primaryStage.setScene(startScene);
	primaryStage.show();
		
	}

}
