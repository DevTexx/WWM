package interfaces;

import screens.Screens;

public interface GameScreen {

	void startScreen();
	Screens getType();
	String getDisplayName();
	void setDisplayName(String name);
	void endScreen();
	
}
