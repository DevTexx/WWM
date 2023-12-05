package interfaces;

import java.awt.Color;

public interface Player {

	int getScore();
	void setScore(int newScore);
	void resetScore();
	String getDisplayName();
	void setDisplayName(String newName);
	Color getPlayerColor();
	void setPlayerColor(Color color);
	
}
