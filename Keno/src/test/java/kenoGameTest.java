import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class kenoGameTest {
    private kenoGame game = new kenoGame();

    @Test
    void testConstructor() {
	assertEquals(game.getSpotsMatched(), 0, "spotsMatched is not 0.");
	assertEquals(game.getCurrentPayout(), 0, "currentPayout is not 0.");
	for (int i = 0; i < 8; i++) {
	    for (int j = 0; j < 10; j++) {
		assertEquals(game.getBoard().get(i).get(j), (i * 10) + j);
	    }
	} 
    }

    @Test
    void testPlayRound() {
	fail("Not yet implemented");
	// Test with 3 sample betCards
    }

}
