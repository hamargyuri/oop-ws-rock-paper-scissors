package players;

import java.util.Random;

public class NorbiRPSPlayer extends RockPaperScissorsPlayer {

    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] possibleHand = new String[]{"rock", "paper", "scissors"};
        Random random = new Random(3);
        return possibleHand[random.nextInt() - 1];
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }
}
