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

        switch(randomNumber)  {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return  "scissors";
            default:
                return null;
        }
    }

    @Override
    public Integer getLives() {
        return this.lives;
    }

}
