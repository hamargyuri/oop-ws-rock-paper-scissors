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
        String[] hands2 = new String[]{"paper", "scissor", "rock"};
        Random random = new Random(3);
        Random rand2 = new Random(3);
        if (random.equals("rock")) {
            return hands2[rand2.nextInt()-1];
        }
        return hands[random.nextInt() - 1];
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }
}
