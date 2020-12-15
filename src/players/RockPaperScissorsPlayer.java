package players;

public abstract class RockPaperScissorsPlayer {
    protected Integer lives = 100;

    public abstract Integer getLives(); // starts from 3, lives decrease by one if a round is lost
    public abstract String showHand(); // should return "rock" / "paper" / "scissors"
    public abstract void decreaseLives(); // decrease lives by 1
}
