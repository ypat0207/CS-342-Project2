import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

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
    private Integer valueOfSpots;
    private Integer valueOfDrawings;
    public Integer buttonPressCounter = 0;
    
    betCard betOne = new betCard();

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
    private void addGrid(GridPane addGrid) {
    	// TODO 
      }

    private GridPane addGrid() {
	// TODO 
    	
    	GridPane grid = new GridPane();
    	grid.setPadding(new Insets(10));
    	grid.setHgap(1);
    	grid.setVgap(2);
    	for(int row = 0; row < 10; row++) {
    		for(int col = 0; col < 8; col++) {
    			Button button = new Button("" + (row + 1 + col * 10));
    			button.setPrefHeight(35);
    			button.setPrefWidth(35);
    			button.setPrefSize(80, 50);
    			grid.setConstraints(button, row, col);
                grid.getChildren().add(button);
    			button.setShape(new Rectangle(60, 60));
    			button.setStyle("-fx-background-color: \n"
    					+ "        #800000	,\n"
    					+ "        rgba(10,0,0,0.05),\n"
    					+ "        linear-gradient(#cca30e, #cca30e),\n"
    					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
    					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
    					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
    					+ "    -fx-background-radius: 0;\n"
    					+ "    -fx-padding: 15 30 15 30;\n"
    					+ "    -fx-font-family: \"Helvetica\";\n"
    					+ "    -fx-font-size: 14px;\n"
    					+ "    -fx-text-fill: #311c09;\n"
    					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1); -fx-font-weight: bold;");
    			button.setOnAction(new EventHandler<ActionEvent>() {
    				
    		        @Override
    		        public void handle(ActionEvent event) {
    		        		
    		        		button.setDisable(true);
    		        		button.setStyle("-fx-background-color: \n"
    		    					+ "        #800000	,\n"
    		    					+ "        rgba(10,0,0,0.05),\n"
    		    					+ "        linear-gradient(#cca30e, #cca30e),\n"
    		    					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
    		    					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
    		    					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
    		    					+ "    -fx-background-radius: 0;\n"
    		    					+ "    -fx-padding: 15 30 15 30;\n"
    		    					+ "    -fx-font-family: \"Helvetica\";\n"
    		    					+ "    -fx-font-size: 14px;\n"
    		    					+ "    -fx-text-fill: #311c09;\n"
    		    					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1);-fx-font: bold 16px 'Arial';");
    		        		
    		        		
    		        }
    		        
    		    });
    			
    		}
    	}
    	return grid;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Keno");
	
	// Start scene
	BorderPane borderPane = new BorderPane();
	borderPane.setPrefSize(900, 900);
	FileInputStream imageStream = new FileInputStream("src/main/resource/images/keno.png");
	Image image = new Image(imageStream);
	ImageView imageView = new ImageView(image);
	imageView.setFitHeight(300);
	imageView.setFitWidth(300);
	borderPane.setCenter(imageView);
	Button play = new Button();
	play.setPrefSize(300, 75);
	play.setText("Play Game");

	play.setStyle("-fx-background-color: \n"
			+ "        #ecebe9,\n"
			+ "        rgba(0,0,0,0.05),\n"
			+ "        linear-gradient(#cca30e, #cca30e),\n"
			+ "        linear-gradient(#CD853F 100%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
			+ "        linear-gradient(#e0bb34, #e6c34d);\n"
			+ "    -fx-background-insets: 0,9 9 8 9,9,0,6;\n"
			+ "    -fx-background-radius: 50;\n"
			+ "    -fx-padding: 15 30 15 30;\n"
			+ "    -fx-font-family: \"Helvetica\";\n"
			+ "    -fx-font-size: 18px;\n"
			+ "    -fx-text-fill: #311c09;\n"
			+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");

	// set the padding of button1 to move it a little higher
	borderPane.setBottom(play);
	HBox hb1 = new HBox();
	hb1.getChildren().add(play);
	hb1.setAlignment(Pos.TOP_CENTER);
	hb1.setPadding(new Insets(0, 10, 50, 10));

	
	
	
	
	
	borderPane.setBottom(hb1);
	FileInputStream background = new FileInputStream("/Users/yash/Desktop/CS-342-Project2/Keno/src/main/resource/images/WealthyBitterBlackbear-max-1mb.gif");
	Image image2 = new Image(background);
	ImageView backgroundImage = new ImageView();
	backgroundImage.setImage(image2);
	VBox vb1 = new VBox(borderPane);
	Scene startScene = new Scene(vb1, 700, 700);
    //BackgroundSize bSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);

	borderPane.setBackground(new Background(new BackgroundImage(image2,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(1.0, 1.0, true, true, false, false))));
	
	
	ImagePattern pattern = new ImagePattern(image2);
	startScene.setFill(pattern);
	
	// Rules scene
	Scene rulesScene;

	// Odds scene
	Scene oddsScene;


	// Card scene
	GridPane grid2 = addGrid();
	grid2.setAlignment(Pos.CENTER);
	
	
	ComboBox<Integer> numberOfSpotsCombo = new ComboBox<Integer>();
	numberOfSpotsCombo.setPromptText("Number Of Spots");
	List<Integer> numberOfSpotsCombolist = numberOfSpotsCombo.getItems();
	numberOfSpotsCombolist.add(1);
	numberOfSpotsCombolist.add(4);
	numberOfSpotsCombolist.add(8);
	numberOfSpotsCombolist.add(10);
	numberOfSpotsCombo.setStyle("-fx-background-color: gold; -fx-color: gold;");
	
	numberOfSpotsCombo.setOnAction(e-> { 
		 valueOfSpots = numberOfSpotsCombo.getSelectionModel().getSelectedItem();
		 betOne.setNumSpots(valueOfSpots);
	});
	
	ComboBox<Integer> numberOfDrawingsCombo = new ComboBox<Integer>();
	numberOfDrawingsCombo.setPromptText("Number Of Drawings");
	List<Integer> list = numberOfDrawingsCombo.getItems();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	numberOfDrawingsCombo.setStyle("-fx-background-color: gold; -fx-color: gold;");
	
	numberOfDrawingsCombo.setOnAction(e-> { 
		 valueOfDrawings = numberOfDrawingsCombo.getSelectionModel().getSelectedItem();
		 betOne.setNumDraws(valueOfDrawings);
	});


	
	Label numberOfSpots1 = new Label(" Number Of Spots:     \n");
	numberOfSpots1.setStyle("-fx-text-fill: gold;-fx-font: bold 16px 'Arial'; ");
	HBox hb1Scene2 = new HBox();
	hb1Scene2.setPadding(new Insets(25, 10, 10, 250));
	hb1Scene2.getChildren().addAll(numberOfSpots1,numberOfSpotsCombo);
	hb1Scene2.setAlignment(Pos.CENTER);
	
	Label numberOfDrawings = new Label(" Number Of Drawings:   \n");
	numberOfDrawings.setStyle("-fx-text-fill: gold;-fx-font: bold 16px 'Arial';");
	HBox hb1Scene22 = new HBox();
	hb1Scene22.setPadding(new Insets(10, 10, 10, 250));
	hb1Scene22.setAlignment(Pos.CENTER);
	hb1Scene22.getChildren().addAll(numberOfDrawings,numberOfDrawingsCombo);
	
	VBox comboBoxVBox = new VBox(hb1Scene2,hb1Scene22);
	
	Button chooseRandom = new Button("Choose Random");
	chooseRandom.setPrefSize(300, 75);
	chooseRandom.setStyle("-fx-background-color: \n"
			+ "        #ecebe9,\n"
			+ "        rgba(0,0,0,0.05),\n"
			+ "        linear-gradient(#cca30e, #cca30e),\n"
			+ "        linear-gradient(#CD853F 100%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
			+ "        linear-gradient(#e0bb34, #e6c34d);\n"
			+ "    -fx-background-insets: 0,9 9 8 9,9,0,6;\n"
			+ "    -fx-background-radius: 50;\n"
			+ "    -fx-padding: 15 30 15 30;\n"
			+ "    -fx-font-family: \"Helvetica\";\n"
			+ "    -fx-font-size: 18px;\n"
			+ "    -fx-text-fill: #311c09;\n"
			+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
	Button startDraw = new Button("Start Draw");
	startDraw.setPrefSize(300, 75);
	startDraw.setStyle("-fx-background-color: \n"
			+ "        #ecebe9,\n"
			+ "        rgba(0,0,0,0.05),\n"
			+ "        linear-gradient(#cca30e, #cca30e),\n"
			+ "        linear-gradient(#CD853F 100%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
			+ "        linear-gradient(#e0bb34, #e6c34d);\n"
			+ "    -fx-background-insets: 0,9 9 8 9,9,0,6;\n"
			+ "    -fx-background-radius: 50;\n"
			+ "    -fx-padding: 15 30 15 30;\n"
			+ "    -fx-font-family: \"Helvetica\";\n"
			+ "    -fx-font-size: 18px;\n"
			+ "    -fx-text-fill: #311c09;\n"
			+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
	
	
	
	BorderPane borderPaneScene2 = new BorderPane();
	borderPaneScene2.setPrefSize(900, 900);
	borderPaneScene2.setCenter(grid2);
	borderPaneScene2.setTop(comboBoxVBox);
	FileInputStream scene2Background = new FileInputStream("/Users/yash/Desktop/CS-342-Project2/Keno/src/main/resource/images/casino.jpeg");
	Image scene2Image = new Image(scene2Background);
	ImageView scene2ImageView = new ImageView();
	scene2ImageView.setImage(scene2Image);
	ImagePattern pattern2 = new ImagePattern(scene2Image);
	startScene.setFill(pattern2);
	borderPaneScene2.setBackground(new Background(new BackgroundImage(scene2Image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(1.0, 1.0, true, true, false, false))));

	// Testing
	
	StackPane sceneTwoStackPane = new StackPane();
	HBox hbox = new HBox();
	hbox.setPadding(new Insets(0, 10, 20, 10));
	
	HBox.setHgrow(chooseRandom, Priority.ALWAYS);
	HBox.setHgrow(startDraw, Priority.ALWAYS);
	Region growRegionSceneTwo = new Region();
	Region growRegionSceneTwoTwo = new Region();
	HBox.setHgrow(growRegionSceneTwo, Priority.SOMETIMES);
	HBox.setHgrow(growRegionSceneTwoTwo, Priority.SOMETIMES);
	StackPane.setAlignment(growRegionSceneTwo, Pos.CENTER_LEFT);
	StackPane.setAlignment(growRegionSceneTwoTwo, Pos.CENTER_RIGHT);
	hbox.getChildren().addAll(chooseRandom,growRegionSceneTwo, growRegionSceneTwoTwo, startDraw);
	sceneTwoStackPane.getChildren().add(hbox);
	borderPaneScene2.setBottom(sceneTwoStackPane);
	
	VBox vb2 = new VBox(borderPaneScene2);
	Scene cardScene = new Scene(vb2, 1000, 700);
	play.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        		primaryStage.setScene(cardScene);
        	
        }
    });
	
	

	// Game scene
	VBox vb3 = new VBox();
	Scene gameScene = new Scene(vb3, 700, 700);

	// End scene
	BorderPane endSceneBorderPane = new BorderPane();
	endSceneBorderPane.setPrefSize(900, 900);
	Button playAgain = new Button("Play Again");
	playAgain.setPrefSize(300, 75);
	playAgain.setStyle("-fx-background-color: \n"
			+ "        #ecebe9,\n"
			+ "        rgba(0,0,0,0.05),\n"
			+ "        linear-gradient(#cca30e, #cca30e),\n"
			+ "        linear-gradient(#CD853F 100%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
			+ "        linear-gradient(#e0bb34, #e6c34d);\n"
			+ "    -fx-background-insets: 0,9 9 8 9,9,0,6;\n"
			+ "    -fx-background-radius: 50;\n"
			+ "    -fx-padding: 15 30 15 30;\n"
			+ "    -fx-font-family: \"Helvetica\";\n"
			+ "    -fx-font-size: 18px;\n"
			+ "    -fx-text-fill: #311c09;\n"
			+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
	Button exit = new Button("Exit");
	exit.setPrefSize(300, 75);
	exit.setStyle("-fx-background-color: \n"
			+ "        #ecebe9,\n"
			+ "        rgba(0,0,0,0.05),\n"
			+ "        linear-gradient(#cca30e, #cca30e),\n"
			+ "        linear-gradient(#CD853F 100%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
			+ "        linear-gradient(#e0bb34, #e6c34d);\n"
			+ "    -fx-background-insets: 0,9 9 8 9,9,0,6;\n"
			+ "    -fx-background-radius: 50;\n"
			+ "    -fx-padding: 15 30 15 30;\n"
			+ "    -fx-font-family: \"Helvetica\";\n"
			+ "    -fx-font-size: 18px;\n"
			+ "    -fx-text-fill: #311c09;\n"
			+ "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
	
	StackPane endSceneStackPane = new StackPane();
	StackPane endSceneImagePane = new StackPane();
	HBox hbox2 = new HBox();
	hbox2.setPadding(new Insets(0, 10, 20, 10));
	
	HBox.setHgrow(playAgain, Priority.ALWAYS);
	HBox.setHgrow(exit, Priority.ALWAYS);
	Region region1 = new Region();
	Region region2 = new Region();
	HBox.setHgrow(region1, Priority.SOMETIMES);
	HBox.setHgrow(region2, Priority.SOMETIMES);
	StackPane.setAlignment(region1, Pos.CENTER_LEFT);
	StackPane.setAlignment(region2, Pos.CENTER_RIGHT);
	hbox2.getChildren().addAll(playAgain,region1, region2, exit);
	endSceneStackPane.getChildren().add(hbox2);
	endSceneBorderPane.setBottom(endSceneStackPane);
	
	
	FileInputStream endSceneBackground = new FileInputStream("/Users/yash/Desktop/CS-342-Project2/Keno/src/main/resource/images/1540818_fa9b6.gif");
	Image endSceneImage = new Image(endSceneBackground);
	ImageView endSceneImageView = new ImageView();
	endSceneImageView.setFitWidth(1000);
	endSceneImageView.setFitHeight(700);
	endSceneImageView.setImage(endSceneImage);
	endSceneBorderPane.setBackground(new Background(new BackgroundImage(scene2Image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(1.0, 1.0, true, true, false, false))));
	endSceneImagePane.getChildren().addAll(endSceneImageView);
	Label drawingsCompleteLabel = new Label("Drawings Complete");
	drawingsCompleteLabel.setPadding(new Insets(0, 10, 180, 10));
	Label moneyWonLabel = new Label("Money Won");
	moneyWonLabel.setPadding(new Insets(0, 10, 180, 0));
	drawingsCompleteLabel.setStyle("-fx-font-family: Calligraffitti; -fx-font-weight: 500;"
			+ "-fx-font-size: 70px;-fx-text-fill: #CD853F;\n"
			+ "-fx-effect: dropshadow(gaussian, #FFD700		\n"
			+ ", 2, 5, 2, 1);");
	moneyWonLabel.setStyle("-fx-font-family: Calligraffitti; -fx-font-weight: 500;"
			+ "-fx-font-size: 70px;-fx-text-fill: #CD853F;\n"
			+ "-fx-effect: dropshadow(gaussian, #FFD700		\n"
			+ ", 2, 5, 2, 1);");
	VBox endSceneVbox = new VBox();
	endSceneVbox.setAlignment(Pos.CENTER);	
	endSceneVbox.setPadding(new Insets(0, 10, 0, 0));
	endSceneVbox.getChildren().addAll(drawingsCompleteLabel,moneyWonLabel);
	endSceneBorderPane.setCenter(endSceneVbox);
	
	

	
	VBox vb4 = new VBox(endSceneBorderPane);
	Scene endScene = new Scene(vb4, 1000, 700);
	startDraw.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        		primaryStage.setScene(endScene);

        		exit.setText(betOne.numSpots + "");
        		playAgain.setText(betOne.numDraws + "");
        		
        	
        }
    });
	exit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        		System.exit(0);
        		
        		
        		
        	
        }
    });
	playAgain.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        	numberOfSpotsCombo.setPromptText("Number Of Spots:");
    		numberOfDrawingsCombo.setPromptText("Number Of Drawings:");
        		numberOfSpotsCombo.getSelectionModel().clearSelection();
        		numberOfDrawingsCombo.getSelectionModel().clearSelection();
        		primaryStage.setScene(cardScene);
        		
        		
        		
        	
        }
    });
	

	primaryStage.setScene(startScene);
	primaryStage.show();
		
	}

	

}
