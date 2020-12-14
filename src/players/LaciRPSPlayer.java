package players;

import java.util.Random;

public class LaciRPSPlayer extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() {

        return this.lives;
    }
    @Override
    public String showHand() {
        String[] hands = new String[]{"rock", "paper", "scissor"};
        Random random = new Random(3);
        return hands[random.nextInt() - 1];
    }
    @Override
    public void decreaseLives() {
        this.lives--;
    }
}
