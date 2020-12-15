package players;

import java.util.Random;

public class HenriettHrubyRPSPlayer extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() { return this.lives; }

    @Override
    public String showHand() {
        Random random = new Random();
        int randNum = random.nextInt(3);
        switch (randNum) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Try again";
        }
    }

    @Override
    public void decreaseLives() { this.lives--; }

    @Override
    public String getName() {
        return "Hruby Henriett";
    }
}
