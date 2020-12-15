package players;

import java.util.Random;

public class AdamTeboldRPSPlayer extends RockPaperScissorsPlayer {

    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        Random random = new Random();
        int rps = random.nextInt(3);

        switch (rps) {
            case 0 :
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String getName() {
        return "Spock";
    }
}
