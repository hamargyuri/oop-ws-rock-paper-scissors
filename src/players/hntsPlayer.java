package players;

import java.util.Random;

public class hntsPlayer extends RockPaperScissorsPlayer {

    private int firstRoundRandom = 0;
    private float[][] markovChain;
    private int lastMove;
    private int[] previousRounds;
    private int moveBeforeLast;


   public hntsPlayer(){
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
        } /* else {
            moveBeforeLast = lastMove;
            if (opponentMove.equals("rock")) {
                lastMove = 0;
            } else if (opponentMove.equals("paper")) {
                lastMove = 1;
            } else {
                lastMove = 2;
            }

            for(int i = 0; i < 3; i++){
                markovChain[moveBeforeLast][i] *= previousRounds[moveBeforeLast];
            }

            markovChain[moveBeforeLast][lastMove] += 1;

            previousRounds[moveBeforeLast]++;

            for(int j = 0; j < 3; j++){
                markovChain[moveBeforeLast][j] /= previousRounds[moveBeforeLast];
            }
        }
        */

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



    public String getName() {
        return " no name has been specified UwU ";
    }

}
