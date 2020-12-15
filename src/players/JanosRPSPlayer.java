package players;

public class JanosRPSPlayer extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] possibleHands = new String[]{"rock", "paper", "scissors"};
        return possibleHands[(int) (Math.random() * 3)];
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String getName() {
        return "Biro Janos";
    }
}
