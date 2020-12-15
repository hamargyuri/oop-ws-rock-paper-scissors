package players;

import java.util.Random;

public class ZsofiSzakalRPSPlayer extends RockPaperScissorsPlayer {


    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String [] possibleHands =  new String[]{"rock", "paper", "scissors"};
        Random random = new Random(3);
        return possibleHands[random.nextInt()];
    }

    @Override
    public void decreaseLives() {
        this.lives--;

    }
    @Override
    public String getName() {
        return "Zsofi Szakal";
    }
}
