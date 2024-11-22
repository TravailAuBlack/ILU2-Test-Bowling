package tdd;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game;
	
	
	@BeforeEach
	void initGame() {
		Game game = new Game();
	}
	
	@Test
	void aucuneQuille() {
		for(int i =0; i<20; i++) {
			game.roll(0);
		}
		assertEquals(0,game.score());
	}

}
