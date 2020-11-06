package skunk.domain;

public class Controller {
	private String playerName;
	private char playerControls;
	private GameManager manager;
	
	public Controller() {
		this.playerName = "noName";
		this.playerControls = 'Y';
		this.manager = new GameManager();
	}

	public void setsPlayerName(String name) {
		this.playerName = name;
	}

	public String getPlayerName() {
		return this.playerName;
	}
	
	//normal dice
	public int[] shareRoll() {
		manager.checkRollRecord();
		return manager.returnDiceRoll();
	}
	
	//fixed dice
	public int[] shareRoll(int die1, int die2) {
		manager.checkRollRecord(die1, die2);
		return manager.returnDiceRoll();
	}

	public int rollTotal() {
		return manager.diceTotalScore();
	}

	public char getsPlayerDecision() {
		return this.playerControls;
	}

	public void setPlayerInput(char playerInput) {
		this.playerControls = playerInput;
		manager.setContinueTurn(playerInput);
	}

	public Boolean startNewRoll() {
		return manager.getContinueTurn();
	}

	public int totalTurnScore() {
		return manager.totalTurnScore();
	}

	
	public int reportsSpecificRoll(int rolls) {
		return manager.sharesTurnScores().get(rolls);
	}

	public int numberOfRolls() {
		return manager.numberOfRolls();
	}

	public int getPlayerChips() {
		Player currentPlayer = this.manager.getPlayer();
		return currentPlayer.getChips();
	}

	public void giveNametoManager(String name) {
		this.manager.createPlayer(name);
	}

	public Player getPlayerFromManager() {
		return this.manager.getPlayer();
	}
	
	public String getPlayerNameFromManager() {
		Player player = getPlayerFromManager();
		return player.getPlayerName();
	}
	
	public int getPlayerChipsFromManager() {
		Player player = getPlayerFromManager();
		return player.getChips();
	}
	


	
}
