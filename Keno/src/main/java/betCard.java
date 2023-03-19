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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class betCard {
    private int numSpots;
    private int numDraws;
    private ArrayList<Integer> chosenSpots = new ArrayList();
   
    public betCard() {
    	numDraws = 0;
    	numSpots = 0;
    	chosenSpots = new ArrayList();


    }
    
//    public void resetGrid() {
//    	
//    	for(Node Node : grid.getChildren()) {
//			button = (Button) Node;
//			button.setDisable(false);
//			button.setStyle("-fx-background-color: \n"
//					+ "        #800000	,\n"
//					+ "        rgba(10,0,0,0.05),\n"
//					+ "        linear-gradient(#cca30e, #cca30e),\n"
//					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
//					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
//					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
//					+ "    -fx-background-radius: 0;\n"
//					+ "    -fx-padding: 15 30 15 30;\n"
//					+ "    -fx-font-family: \"Helvetica\";\n"
//					+ "    -fx-font-size: 14px;\n"
//					+ "    -fx-text-fill: #311c09;\n"
//					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1); -fx-font-weight: bold;");
//
//			
//		}
//    	for(Node Node : grid2.getChildren()) {
//			button = (Button) Node;
//			button.setDisable(false);
//			button.setStyle("-fx-background-color: \n"
//					+ "        #800000	,\n"
//					+ "        rgba(10,0,0,0.05),\n"
//					+ "        linear-gradient(#cca30e, #cca30e),\n"
//					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
//					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
//					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
//					+ "    -fx-background-radius: 0;\n"
//					+ "    -fx-padding: 15 30 15 30;\n"
//					+ "    -fx-font-family: \"Helvetica\";\n"
//					+ "    -fx-font-size: 14px;\n"
//					+ "    -fx-text-fill: #311c09;\n"
//					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1); -fx-font-weight: bold;");
//
//			
//		}
//    	
//    }
    

    public void chooseRandom() {
    	chosenSpots.clear();
    	
    	Random random = new Random();
    	while(chosenSpots.size() < numSpots) {
    		int num = random.nextInt(80 - 1 + 1) + 1;
    		if(!chosenSpots.contains(num)) {
    			chosenSpots.add(num);
    		}
    	}
    
    	
//
//    	for(int row = 1; row <= 8; row++) {
//    		for(int col = 1; col <= 10; col++) {
//    			Button button = new Button();
//    			int index = (row - 1) * 10 + col;
//    			button.setText(Integer.toString(index));
//    			if(chosenSpots.contains(index)) {
//    				button.setStyle("-fx-background-color: red");
//    				button.setDisable(true);
//    				
//    				
//    			}
//    			else {
////    				button.setOnAction(e -> {
////    					chosenSpots.add(index);
////    					//button.setStyle("-fx-background-color: red");
////    					button.setDisable(true);
////    					
////    					
////    				});
//    			}
//    			button.setPrefHeight(35);
//    			button.setPrefWidth(35);
//    			button.setPrefSize(80, 50);
//    			grid2.setConstraints(button, col, row);
//                grid2.getChildren().add(button);
//    			button.setShape(new Rectangle(60, 60));
//    			button.setStyle("-fx-background-color: \n"
//    					+ "        #800000	,\n"
//    					+ "        rgba(10,0,0,0.05),\n"
//    					+ "        linear-gradient(#cca30e, #cca30e),\n"
//    					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
//    					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
//    					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
//    					+ "    -fx-background-radius: 0;\n"
//    					+ "    -fx-padding: 15 30 15 30;\n"
//    					+ "    -fx-font-family: \"Helvetica\";\n"
//    					+ "    -fx-font-size: 14px;\n"
//    					+ "    -fx-text-fill: #311c09;\n"
//    					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1); -fx-font-weight: bold;");
////    			button.setOnAction(new EventHandler<ActionEvent>() {
////    		        @Override
////    		        public void handle(ActionEvent event) {
////    		        	
////    		        		button.setDisable(true);
////    		        		button.setStyle("-fx-background-color: \n"
////    		    					+ "        #800000	,\n"
////    		    					+ "        rgba(10,0,0,0.05),\n"
////    		    					+ "        linear-gradient(#cca30e, #cca30e),\n"
////    		    					+ "        linear-gradient(#CD853F 200%, #f4e5bc 80%, #e6c75d 20%, #cca30e 40%),\n"
////    		    					+ "        linear-gradient(#e0bb34, #e6c34d);\n"
////    		    					+ "    -fx-background-insets: 0,9 9 8 9,9,1,3;\n"
////    		    					+ "    -fx-background-radius: 0;\n"
////    		    					+ "    -fx-padding: 15 30 15 30;\n"
////    		    					+ "    -fx-font-family: \"Helvetica\";\n"
////    		    					+ "    -fx-font-size: 14px;\n"
////    		    					+ "    -fx-text-fill: #311c09;\n"
////    		    					+ "    -fx-effect: innershadow( three-pass-box , rgba(10,20,50,0.1) , 2, 0.0 , 0 , 1);-fx-font: bold 16px 'Arial';");
////    		        	
////    		        }
////    		    });
//    			
//    		}
//    		
//    	}
//    	
    
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
