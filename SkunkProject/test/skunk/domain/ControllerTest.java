package skunk.domain;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ControllerTest {
	/*
	@Test
	void controller_gets_player_name() {
		Controller control = new Controller();
		String result = control.getPlayerName();
		assertTrue( result.equals("noName"));
	}
	
	@Test
	void controller_sets_player_name() {
		Controller control = new Controller();
		String newName = "mike";
		control.setsPlayerName(newName);
		String result = control.getPlayerName();
		assertTrue( result.equals(newName));
	}
	
	
	@Test
	void controller_gets_roll_from_manager() {
		Controller control = new Controller();
		int[] dice = control.shareRoll(2,5);
		assertTrue(dice[0] == 2 && dice[1] == 5);
	}
	
	@Test
	void controller_gets_total_roll_from_manager() {
		Controller control = new Controller();
		control.shareRoll(3, 4);
		int expected = 7;
		int actual = control.rollTotal();
		assertEquals(expected, actual);
	}
	
	@Test
	void controller_gets_player_roll_input() {
		Controller control = new Controller();
		char playerDecision = control.getsPlayerDecision();
		assertTrue(playerDecision == 'Y');
	}
	
	@Test
	void controller_sets_player_roll_input() {
		Controller control = new Controller();
		char expected = 'N';
		control.setPlayerInput('N');
		char actual = control.getsPlayerDecision();
		assertEquals(expected, actual);
	}
	
	@Test
	void controller_sees_if_the_player_wants_another_round() {
		Controller control = new Controller();
		Boolean newRoll = control.startNewRoll();
		assertTrue(newRoll);
	}
	

	@Test
	void controller_checks_turn_status_before_any_roll() {
		Controller control = new Controller();
		control.setPlayerInput('N');
		control.startNewRoll();
		assertNull(control.shareRoll());
	}

*/
}
