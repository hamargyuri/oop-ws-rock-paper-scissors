import players.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<RockPaperScissorsPlayer> players = new ArrayList<>();


    public static void main(String[] args) {
        addPlayers();

        while (players.size() != 1) {
            int player1Index = new Random().nextInt(players.size());
            RockPaperScissorsPlayer player1 = players.get(player1Index);
            players.remove(player1);
            int player2Index = new Random().nextInt(players.size());
            RockPaperScissorsPlayer player2 = players.get(player2Index);
            players.remove(player2);

            players.add(play(player1, player2));
        }

        System.out.println(players.get(0).getClass() + " has won the championship!");
    }

    public static RockPaperScissorsPlayer play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2) {

        while (player1.getLives() > 0 && player2.getLives() > 0) {
            if (player1.showHand().equalsIgnoreCase(player2.showHand())) {

            } else if (player1.showHand().equalsIgnoreCase("rock") && player2.showHand().equalsIgnoreCase("scissor")) {
                player2.decreaseLives();
            } else if (player1.showHand().equalsIgnoreCase("paper") && player2.showHand().equalsIgnoreCase("rock")) {
                player2.decreaseLives();
            } else if (player1.showHand().equalsIgnoreCase("scissor") && player2.showHand().equalsIgnoreCase("paper")) {
                player2.decreaseLives();
            } else {
                player1.decreaseLives();
            }
        }

        if (player1.getLives() == 0) {
            System.out.println(player1.getClass() + " has won against " + player1.getClass());
            return player2;
        } else {
            System.out.println(player2.getClass() + " has won against " + player2.getClass());
            return player1;
        }
    }

    public static void addPlayers() {
        players.add(new BalazsAI());
        players.add(new BenceAI());
        players.add(new ErikRPSPlayer());
        players.add(new GeriSzaszRPSPlayer());
        players.add(new IZsolt());
        players.add(new JanosRPSPlayer());
        players.add(new KMarcellRPSPlayer());
        players.add(new Marci());
        players.add(new PJanosPlayer());
        players.add(new SzabiRPSPlayer());
        players.add(new Zemen());
        players.add(new ZsoltNemethRPSPlayer());
    }
}
