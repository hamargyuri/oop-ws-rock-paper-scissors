public abstract class RockPaperScissorsPlayer {
    public abstract Integer getLives(); // starts from 3, lives decrease by one if a round is lost
    public abstract String showHand(); // should return "rock" / "paper" / "scissors"
    public abstract void decreaseLives(); // decrease lives by 1
}
