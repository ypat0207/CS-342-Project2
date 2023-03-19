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
    
    public void chooseRandom() {
    	
    	chosenSpots.clear();
    	
    	Random random = new Random();
    	while(chosenSpots.size() < numSpots) {
    		int num = random.nextInt(80 - 1 + 1) + 1;
    		if(!chosenSpots.contains(num)) {
    			chosenSpots.add(num);
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
