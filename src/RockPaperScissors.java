import players.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("The winner is: ");
    }
    private static String play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        if (player1.getLives() > 0 && player2.getLives() > 0) {
            decideRound(player1, player2);
        }
        return player1.getLives() > 0 ? player1.getName() : player2.getName();
    }
    private static void decideRound(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {
        String hand1 = player1.showHand();
        String hand2 = player2.showHand();

        switch (hand1) {
            case "rock":
                if (hand2.equals("paper")) {
                    player1.decreaseLives();
                } else if (hand2.equals("scissor")) {
                    player2.decreaseLives();
                }
                break;
            case "scissor":
                if (hand2.equals("paper")) {
                    player2.decreaseLives();
                } else if (hand2.equals("rock")) {
                    player1.decreaseLives();
                }
                break;
            case "paper":
                if (hand2.equals("rock")) {
                    player2.decreaseLives();
                } else if (hand2.equals("scissor")) {
                    player1.decreaseLives();
                }
                break;
        }
    }
}
