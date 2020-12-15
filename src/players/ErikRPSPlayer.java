package players;

import java.util.Random;

public class ErikRPSPlayer extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] hand = new String[]{"rOcK", "pApEr", "sCiSsOrS"};
        Random random = new Random();
        int ranNum = random.nextInt(3);

        if (ranNum==1) {
            return hand[0];
        } else if (ranNum==2) {
            return hand[1];
        } else {
            return hand[2];
        }

    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }

}
