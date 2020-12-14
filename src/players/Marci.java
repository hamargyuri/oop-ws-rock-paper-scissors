package players;

public class Marci extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] possibleHands = new String[] {"rock", "paper", "scissors"};
        return possibleHands[0];
    }

    @Override
    public void decreaseLives() {
      this.lives--;
    }
}
