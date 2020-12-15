package players;

import java.util.Random;

public class BenceAI extends RockPaperScissorsPlayer {
    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);

         switch (randomNumber) {
            case 0:
                return "scissors";
            case 1:
                return "rock";
            default:
                return "paper";
        }
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String getName() {
        return "Mozes Bence Botond";
    }
}

