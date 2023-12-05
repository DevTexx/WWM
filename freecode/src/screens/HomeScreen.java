package screens;

import interfaces.GameScreen;

public class HomeScreen implements GameScreen{

	private Screens screenType;
	private String name;
	
		@Override
	public void startScreen() {
		// TODO Auto-generated method stub
			
			screenType = Screens.HOMESCREEN;
			name = getType().name;
			
	}
	
	@Override
	public Screens getType() {
		// TODO Auto-generated method stub
		return this.screenType;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setDisplayName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void endScreen() {
		// TODO Auto-generated method stub
		
	}

}
