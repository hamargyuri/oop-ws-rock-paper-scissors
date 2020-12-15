import players.JanosRPSPlayer;
import players.KMarcellRPSPlayer;
import players.NorbiRPSPlayer;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("This is a real combat!");
        play(new JanosRPSPlayer(), new KMarcellRPSPlayer());


    }

    private static void play(JanosRPSPlayer player1, KMarcellRPSPlayer player2) {
        String hand1 = player1.showHand();
        String hand2 = player2.showHand();
        while (player1.getLives() > 0 || player2.getLives() > 0) {
            switch (hand1) {
                case "rock": {
                    if (hand2.equals("paper")) {
                        player1.decreaseLives();
                    } else if (hand2.equals("scissors")) {
                        player2.decreaseLives();
                    }
                }
                break;
                case "paper": {
                    if (hand2.equals("rock")) {
                        player2.decreaseLives();
                    } else if (hand2.equals("scissors")) {
                        player1.decreaseLives();
                    }

                }
                break;
                case "scissors":

                    if (hand2.equals("rock")) {
                        player1.decreaseLives();
                    } else if (hand2.equals("paper")) {
                        player2.decreaseLives();
                    }
                    break;
            }
        }
        if (player1.getLives() == 0) System.out.println("Win " + player2.getName());
        else System.out.println("Win " + player1.getName());
    }
}
