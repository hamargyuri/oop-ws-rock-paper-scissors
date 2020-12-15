package players;

public class Zemen extends RockPaperScissorsPlayer {

    public Integer getLives() {
		return this.lives;
	}
	
    public String showHand() {
		return "rock";
	}	
	
	
    public void decreaseLives() {
		this.lives--;
	}

	public String getName() {
    	return "Zsolt";
	}
}
