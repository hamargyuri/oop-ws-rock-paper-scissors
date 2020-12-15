import players.AdamTeboldRPSPlayer;
import players.BenceAI;
import players.RockPaperScissorsPlayer;

public class RockPaperScissors {
    public static void main(String[] args) {
        play(new BenceAI(), new AdamTeboldRPSPlayer());
    }

    public static void play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {

        winRound(player1, player2);

        System.out.println(player1.getLives() > 0 ? player1.getName() : player2.getName() + " is the WINNER!");
    }

    public static void winRound(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        String player1Hand = player1.showHand().toLowerCase();
        String player2Hand = player2.showHand().toLowerCase();

        while (player1.getLives() > 0 && player2.getLives() > 0) {
            switch (player1Hand) {
                case "rock":
                    if (player2Hand.equals("paper")) {
                        player1.decreaseLives();
                    } else if (player2Hand.equals("scissors")) {
                        player2.decreaseLives();
                    }
                case "paper":
                    if (player2Hand.equals("rock")) {
                        player2.decreaseLives();
                    } else if (player2Hand.equals("scissors")) {
                        player1.decreaseLives();
                    }
                case "scissors":
                    if (player2Hand.equals("rock")) {
                        player2.decreaseLives();
                    } else if (player2Hand.equals("paper")) {
                        player2.decreaseLives();
                    }
            }
        }
    }
}
