public class Game {
	final int PLAYER_COUNT;
	private Map<Card, Integer> cardPool;
	private List<Player> players;
	
	public Game(int playerCount) {
		PLAYER_COUNT = playerCount;
		System.out.println("Starting new game with " + PLAYERS + " players.");
		players = new ArrayList<Player>(PLAYER_COUNT);
		initializePool();
			
	}

	public void initializePool() {
		
	}
}
