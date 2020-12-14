package players;
import java.util.Random;

public class GeriSzaszRPSPlayer extends RockPaperScissorsPlayer {

    @Override
    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String showHand() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        String hand = "";

        switch(randomNumber)  {
            case 0:
                hand = "rock";
                break;
            case 1:
                hand = "paper";
                break;
            case 2:
                hand = "scissors";
                break;
        }

        return hand;
    }

    @Override
    public Integer getLives() {
        return this.lives;
    }

}
