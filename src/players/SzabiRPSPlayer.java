package players;

public class SzabiRPSPlayer extends RockPaperScissorsPlayer {

    @Override
    public Integer getLives() { return this.lives; }

    @Override
    public String showHand() {
        String[] rps = {"Rock", "Paper", "Scissors"};
        return rps[(int)(Math.random() * 3)];
    }

    @Override
    public void decreaseLives() { this.lives--; }

    @Override
    public String getName() {
        return "Szabi";
    }
}
