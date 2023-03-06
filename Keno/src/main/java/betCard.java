/*  
 * betCard.java
 * A class for the bet card 
 * submitted in a Keno game.
 */

import java.util.ArrayList;

public class betCard {
    private int numSpots;
    private int numDraws;
    private ArrayList<Integer> chosenSpots;

    public betCard() {
	// TODO
    }

    public void chooseRandom() {
	// TODO
    }

    // Getters and Setters for private variables
    public void setNumSpots(int num) {numSpots = num;}
    public int getNumSpots() {return numSpots;}
    public void setNumDraws(int num) {numDraws = num;}
    public int getNumDraws() {return numDraws;}
    public void setChosenSpots(ArrayList<Integer> arr) {chosenSpots = arr;}
    public ArrayList<Integer> getChosenSpots() {return chosenSpots;}

}
