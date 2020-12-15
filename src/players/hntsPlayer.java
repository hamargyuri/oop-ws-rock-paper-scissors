package players;

import java.util.Random;

public class hntsPlayer extends RockPaperScissorsPlayer {

    private int firstRoundRandom = 0;
    private float[][] markovChain;
    private int lastMove;
    private int[] previousRounds;


    hntsPlayer(){
        markovChain = new float[][] {{0.33f, 0.33f, 0.33f}, {0.33f, 0.33f, 0.33f}, {0.33f, 0.33f, 0.33f}};
        previousRounds = new int[] {0, 0, 0};
    }

    @Override
    public Integer getLives() {
        return this.lives;
    }


    @Override
    public String showHand() {

        if (firstRoundRandom < 1) {
            int [] options = new int[]{0, 1, 2};
            Random lastMovePlaceHolder = new Random(2);
            lastMove = options[lastMovePlaceHolder.nextInt() -1];
            firstRoundRandom++;
        } // else lastMove is the numerical value of the other player's last choice

        Random random = new Random();
        float ranFloat = random.nextFloat();
        if (ranFloat <= markovChain[lastMove][1]) {
            return "paper";
        } else if (ranFloat <= markovChain[lastMove][2] + markovChain[lastMove][1]) {
            return "scissors";
        } else {
            return "rock";

        }
    }

        @Override
    public void decreaseLives() {
        this.lives--;

    }

}
