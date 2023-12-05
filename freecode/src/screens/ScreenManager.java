package screens;

import interfaces.GameScreen;

public class ScreenManager{

	private static GameScreen currentScreen;

public static void setCurrentScreen(GameScreen newValue) {
	currentScreen = newValue;
	currentScreen.startScreen();
}

public static GameScreen getCurrentScreen() {
	if (currentScreen == null) setCurrentScreen(new HomeScreen());
	return currentScreen;
	}
}
