package players;

import java.util.Random;

public class PJanosPlayer extends RockPaperScissorsPlayer{
    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        Random random = new Random();
        int rand = random.nextInt(100)+1;
        if (rand < 34 && rand > 0){
            return "rock";
        } else if (rand > 33 && rand < 67){
            return "paper";
        }else return "scissors";
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }

}
