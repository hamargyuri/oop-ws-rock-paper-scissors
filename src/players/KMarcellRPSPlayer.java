package players;

import java.util.Random;

public class KMarcellRPSPlayer extends RockPaperScissorsPlayer{


    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] aiRespond = {"rock","paper","sciccors"};
        int randomMove = new Random().nextInt((aiRespond.length));
        String aismove = aiRespond[randomMove];
        System.out.println(aismove);

        return aismove;
    }

    @Override
    public void decreaseLives() {
        this.lives--;
    }
}
