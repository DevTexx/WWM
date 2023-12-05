package interfaces;

import java.awt.Color;

import util.Main;

public class Player1 implements Player{

	
	int score = 0;
	String displayName;
	Color playerColor;
	
	public Player1(String displayName, Color playerColor) {
		this.displayName = displayName;
		this.playerColor = playerColor;
	
	}
	
	
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public void setScore(int newScore) {
		// TODO Auto-generated method stub
		if (score != newScore) {
			score = newScore;
			return;
		}
	}

	@Override
	public void resetScore() {
		// TODO Auto-generated method stub
		if (score != 0) {
			score = 0;
			return;
		}
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	@Override
	public void setDisplayName(String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getPlayerColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerColor(Color color) {
		// TODO Auto-generated method stub
		
	}

}
