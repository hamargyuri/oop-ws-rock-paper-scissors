package players;

public class Zemen extends RockPaperScissorsPlayer {
    protected Integer lives = 3;

    public Integer getLives() {
		return lives;
	}
	
    public String showHand() {
		return "Rock";
	}	
	
	
    public void decreaseLives() {
		this.lives--;
	}
}
