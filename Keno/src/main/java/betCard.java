/*  
 * betCard.java
 * A class for the bet card 
 * submitted in a Keno game.
 */

import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class betCard {
    public int numSpots;
    public int numDraws;
    public ArrayList<Integer> chosenSpots;
    public int buttonIdx;
    public Button button = new Button();
    public GridPane grid = new GridPane();
    public Random rand = new Random();
    public int num;
    public betCard() {
    	
    	
    

    }

    public void chooseRandom() {
    	
    	ArrayList<Integer> chosenSpot = new ArrayList();
    	Random random = new Random();
    	while(chosenSpot.size() < numSpots) {
    		int num = random.nextInt(80 - 1 + 1) + 1;
    		if(!chosenSpot.contains(num)) {
    			chosenSpot.add(num);
    		}
    	}
    	
        
    	
    	grid.setPadding(new Insets(10,1,1,100));
    	grid.setHgap(1);
    	grid.setVgap(2);
    	for(int row = 1; row <= 8; row++) {
    		for(int col = 1; col <= 10; col++) {
    			Button button = new Button();
    			int index = (row - 1) * 10 + col;
    			button.setText(Integer.toString(index));
    			if(chosenSpot.contains(index)) {
    				button.setDisable(true);
    				button.setStyle("-fx-background-color: \\n\"\n"
    						+ " 	+ \"        #800000	,\\n\"\n"
    						+ "    	+ \"        rgba(10,0,0,0.05),\\n\"\n"
    						+ "     + \"        linear-gradient(#cca30e, #cca30e),\\n\"\n"
    						+ "    	+ \"        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\\n\"\n"
    						+ "    	+ \"        linear-gradient(#e0bb34, #e6c34d);\\n\"\n"
    						+ "    	+ \"    -fx-background-insets: 0,9 9 8 9,9,1,3;\\n\"\n"
    						+ "     + \"    -fx-background-radius: 0;\\n\"\n"
    						+ "     + \"    -fx-padding: 15 30 15 30;\\n\"\n"
    						+ "     + \"    -fx-font-family: \\\"Helvetica\\\";\\n\"\n"
    						+ "    	+ \"    -fx-font-size: 14px;\\n\"\n"
    						+ "    	+ \"    -fx-text-fill: #311c09;\\n\"\n"
    						+ "     + \"    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1);-fx-font: bold 16px 'Arial';");
    			}
    			else {
    				button.setOnAction(e -> {
    					chosenSpot.add(index);
    					button.setDisable(true);
    					button.setStyle("-fx-background-color: \\n\"\n"
    							+ "   + \"        #800000	,\\n\"\n"
    							+ "   + \"        rgba(10,0,0,0.05),\\n\"\n"
    							+ "   + \"        linear-gradient(#cca30e, #cca30e),\\n\"\n"
    							+ "   + \"        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\\n\"\n"
    							+ "   + \"        linear-gradient(#e0bb34, #e6c34d);\\n\"\n"
    							+ "   + \"    -fx-background-insets: 0,9 9 8 9,9,1,3;\\n\"\n"
    							+ "   + \"    -fx-background-radius: 0;\\n\"\n"
    							+ "   + \"    -fx-padding: 15 30 15 30;\\n\"\n"
    							+ "   + \"    -fx-font-family: \\\"Helvetica\\\";\\n\"\n"
    							+ "   + \"    -fx-font-size: 14px;\\n\"\n"
    							+ "   + \"    -fx-text-fill: #311c09;\\n\"\n"
    							+ "   + \"    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1);-fx-font: bold 16px 'Arial';");
    				});
    			}
    			button.setPrefHeight(35);
    			button.setPrefWidth(35);
    			button.setPrefSize(80, 50);
    			grid.setConstraints(button, col, row);
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
    	
    
    }

    // Getters and Setters for private variables
    public void setNumSpots(int num) {
    	numSpots = num;
    }
    public int getNumSpots() {
    	return numSpots;
    }
    public void setNumDraws(int num) {
    	numDraws = num;
    }
    public int getNumDraws() {
    	return numDraws;
    }
    public void setChosenSpots(ArrayList<Integer> arr) {
    	chosenSpots = arr;
    }
    public ArrayList<Integer> getChosenSpots() {
    	return chosenSpots;
    }

}
