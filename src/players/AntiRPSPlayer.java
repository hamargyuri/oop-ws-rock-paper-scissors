package players;

import java.util.Random;

public class AntiRPSPlayer extends RockPaperScissorsPlayer {

    public Integer getLives () {
        return this.lives;
    }

    public String showHand() {
        String[] possibleHands = new String[] {"rock", "paper", "scissors"};
        Random random = new Random();
        int rps = random.nextInt(3);
        switch (rps) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String getName() {
        return "Anti";
    }
}