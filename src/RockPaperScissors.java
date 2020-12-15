import players.Marci;
import players.RockPaperScissorsPlayer;
import players.Zoly;

import java.util.Arrays;


public class RockPaperScissors {
    static String[] hands = {"rock", "paper", "scissors"};
    private static RockPaperScissorsPlayer player1;
    private static RockPaperScissorsPlayer player2;
    public static void main(String[] args) {
        initPlay(new Zoly(), new Marci());
    }

    public static void initPlay(RockPaperScissorsPlayer p1, RockPaperScissorsPlayer p2){
        player1 = p1;
        player2 = p2;
    }
    public static void turn() {
        int i1 = Arrays.asList(hands).indexOf(player1.showHand());
        int i2 = Arrays.asList(hands).indexOf(player2.showHand());
        if (i1 == i2+1 ||i1 ==i2-2){
            player2.decreaseLives();
        } else if (i2 == i1+1 ||i2 ==i1-2) {
            player1.decreaseLives();
        } else {
            player2.decreaseLives();
            player1.decreaseLives();
        }
    }
}
