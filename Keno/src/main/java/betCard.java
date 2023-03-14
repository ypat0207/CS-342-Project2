/*  
 * betCard.java
 * A class for the bet card 
 * submitted in a Keno game.
 */

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class betCard {
    public int numSpots;
    public int numDraws;
    private ArrayList<Integer> chosenSpots;

    public betCard() {
    	
    	numSpots = 0;
    	numDraws = 0;
    	chosenSpots = null;

    }

    public void chooseRandom() {
    
    	ArrayList<Integer> randomSpots = new ArrayList<Integer>();
    	for(int i = 0; i < numSpots; i++) {
    		int randomNumber = (int)Math.random() * 80;
    		randomSpots.add(randomNumber);
    	}
    	chosenSpots = randomSpots;
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
