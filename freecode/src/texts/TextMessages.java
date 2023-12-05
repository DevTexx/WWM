package texts;

public enum TextMessages {

	PLAYER_1_DEFAULT("Spieler 1", 1),
	PLAYER_2_DEFAULT("Spieler 2", 1);

	String message;
	int weight;
	
	TextMessages(String message, int weight) {
		this.message = message;
		this.weight = weight;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
