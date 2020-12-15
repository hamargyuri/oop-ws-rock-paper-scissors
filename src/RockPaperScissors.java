import players.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        play(new Zemen(), new AdamTeboldRPSPlayer());
    }

    public static void play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {

        winRound(player1, player2);

        System.out.println(player1.getLives() > 0 ? player1.getName() : player2.getName() + " is the WINNER!");
    }

    public static void winRound(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        String player1Hand = player1.showHand().toLowerCase();
        String player2Hand = player2.showHand().toLowerCase();

        while (player1.getLives() > 0 && player2.getLives() > 0) {

            if (player1Hand.equals("rock")) {
                if (player2Hand.equals("paper")) {
                    player1.decreaseLives();
                } else if (player2Hand.equals("scissors")) {
                    player2.decreaseLives();
                }
            } else if (player1Hand.equals("paper")) {
                if (player2Hand.equals("rock")) {
                    player2.decreaseLives();
                } else if (player2Hand.equals("scissors")) {
                    player1.decreaseLives();
                }
            } else if (player1Hand.equals("scissors")) {
                if (player2Hand.equals("rock")) {
                    player1.decreaseLives();
                } else if (player2Hand.equals("paper")) {
                    player2.decreaseLives();
                }
            }
            
//            switch (player1Hand) {
//                case "rock":
//                    if (player2Hand.equals("paper")) {
//                        player1.decreaseLives();
//                    } else if (player2Hand.equals("scissors")) {
//                        player2.decreaseLives();
//                    }
//                    break;
//                case "paper":
//                    if (player2Hand.equals("rock")) {
//                        player2.decreaseLives();
//                    } else if (player2Hand.equals("scissors")) {
//                        player1.decreaseLives();
//                    }
//                    break;
//                case "scissors":
//                    if (player2Hand.equals("rock")) {
//                        player1.decreaseLives();
//                    } else if (player2Hand.equals("paper")) {
//                        player2.decreaseLives();
//                    }
//                    break;
//            }
        }
    }
}
