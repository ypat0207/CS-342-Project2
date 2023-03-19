import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class betCardTest {
	  
	//private betCard testCard;
	static betCard numSpots;
	static betCard numDraws;
	static betCard chosenSpots;
	private static betCard game;
	
	
	@BeforeAll
	static void setup() {
		game = new betCard();
	}
	
	@Test
	public void testConstructors() {
		assertEquals(0, game.getNumSpots());
        assertEquals(0, game.getNumDraws());
        assertTrue(game.getChosenSpots().isEmpty());
	}
	
	@Test
	public void testChooseRandom() {
		int numSpots = 10;
		Random random = new Random();
		ArrayList<Integer> chosenSpots = new ArrayList<Integer>();
		while(chosenSpots.size() < numSpots) {
			int num = random.nextInt(80 - 1 + 1) + 1;
            if(!chosenSpots.contains(num)) {
                chosenSpots.add(num);
            }
        }
        assertEquals(numSpots, chosenSpots.size());
	}
	@Test
	public void testChooseRandomTwo() {
		int numSpots = 10;
        Random random = new Random();
        ArrayList<Integer> chosenSpots = new ArrayList<Integer>();
        while(chosenSpots.size() < numSpots) {
            int num = random.nextInt(80 - 1 + 1) + 1;
            if(!chosenSpots.contains(num)) {
                chosenSpots.add(num);
            }
        }
        for (int i = 0; i < chosenSpots.size(); i++) {
            int spot = chosenSpots.get(i);
            assertTrue(spot >= 1 && spot <= 80);
        }
		
	}
	
	
	@Test
	public  void testSetAndGetNumSpots() {
		game.setNumSpots(10);
		assertEquals(10, game.getNumSpots(), "Number of spots does not equal");
		game.setNumSpots(0);
	}
	@Test
	public  void testSetAndGetNumDraws() {
		game.setNumDraws(8);
		assertEquals(8, game.getNumDraws(), "Number of draws does not equal");
		game.setNumDraws(0);
	}
	@Test
	public  void testSetAndGetChosenSpots() {
		ArrayList<Integer> tempChosenSpots = new ArrayList();
		ArrayList<Integer> nullArrayForTest = new ArrayList();
		tempChosenSpots.add(1);
		tempChosenSpots.add(2);
		tempChosenSpots.add(3);
		tempChosenSpots.add(4);
		tempChosenSpots.add(5);
		game.setChosenSpots(tempChosenSpots);
		assertEquals(tempChosenSpots,game.getChosenSpots(),"Chosen Spots does not equal");
		game.setChosenSpots(nullArrayForTest);
	}
	@Test
	public void testSizeOfChosenSpots() {
		ArrayList<Integer> tempChosenSpots = new ArrayList();
		ArrayList<Integer> nullArrayForTest = new ArrayList();
		
		tempChosenSpots.add(10);
		tempChosenSpots.add(20);
		tempChosenSpots.add(30);
		tempChosenSpots.add(40);
		tempChosenSpots.add(50);
		game.setChosenSpots(tempChosenSpots);
		assertEquals(tempChosenSpots.size(),game.getChosenSpots().size(),"Chosen Spots does not equal");
		game.setChosenSpots(nullArrayForTest);
	}
	
	
	
	
	

	  
}
