import players.*;

import java.util.Locale;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("The winner is: " + play(new JanosRPSPlayer(), new Zoly()));
    }

    private static String play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        while (player1.getLives() > 0 && player2.getLives() > 0) {
            decideRound(player1, player2);

        }
        if (player1.getLives() == 0) {
            return player2.getName();
        } else if (player2.getLives() == 0) {
            return player1.getName();
        } else {
            return "Draw!";
        }


    }

    private static void decideRound(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        String hand1 = player1.showHand().toLowerCase(Locale.ROOT);
        String hand2 = player2.showHand().toLowerCase(Locale.ROOT);
        if (hand1.equals(hand2)) {
            player1.decreaseLives();
            player2.decreaseLives();
        } else if ((hand1.equals("rock") && hand2.equals("paper"))|| (hand1.equals("paper") && hand2.equals("scissors")) || (hand1.equals("scissors") && hand2.equals("rock"))) {
            player1.decreaseLives();
        } else {
            player2.decreaseLives();
        }
    }
}
