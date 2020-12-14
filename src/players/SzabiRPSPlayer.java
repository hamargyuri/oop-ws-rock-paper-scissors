package players;

public class SzabiRPSPlayer extends RockPaperScissorsPlayer {

    @Override
    public Integer getLives() { return this.lives; }

    @Override
    public String showHand() {
        String[] rps = {"Rock", "Paper", "Scissors"};
        int rand = (int)(Math.random() * 3) + 0;
        return rps[rand];
    }

    @Override
    public void decreaseLives() { this.lives--; }
}
