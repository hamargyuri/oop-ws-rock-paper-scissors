package players;

import java.util.Random;

public class ZsoltNemethRPSPlayer extends RockPaperScissorsPlayer {

    private double callNumber = 0;

    public ZsoltNemethRPSPlayer() {
        this.lives = getLives();
        String showZsoltHand = showHand();
    }

    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        callNumber += 1;
        String[] possibleHands = new String[]{"scissors", "paper", "rock"};
      /*          Random random = new Random(3);
        return possibleHands[random.nextInt() -1]; */
        return possibleHands[(int) (callNumber * Math.sqrt(callNumber)) % 3];
    }

    @Override
    public void decreaseLives() {
       this.lives --;
    }
}
