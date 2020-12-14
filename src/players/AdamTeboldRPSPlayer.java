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

        return switch (rps) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissor";
        };
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }
}
