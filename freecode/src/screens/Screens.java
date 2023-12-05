package screens;

public enum Screens {

	HOMESCREEN("Wer wird Millionär?"),
	GAMESCREEN(""),
	GAMEOVERSCREEN(""),
	CREDITSSCREEN("");
	
	
	String name;
	Screens(String name){
		this.name = name;
	}
	
	public String getTitle() {
		return name;
	}
}
