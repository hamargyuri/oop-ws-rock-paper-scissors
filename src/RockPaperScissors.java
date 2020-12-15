import players.*;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public static List<RockPaperScissorsPlayer> players = new ArrayList<>();

    public static void main(String[] args) {
        players.add(new AdamTeboldRPSPlayer());
        players.add(new BalazsAI());
        players.add(new BenceAI());
        players.add(new ErikRPSPlayer());
        players.add(new GeriSzaszRPSPlayer());
        players.add(new HenriettHrubyRPSPlayer());
        players.add(new IZsolt());
        players.add(new JanosRPSPlayer());
        players.add(new KMarcellRPSPlayer());
        players.add(new Marci());
        players.add(new NorbiRPSPlayer());
        players.add(new PJanosRPSPlayer());
        players.add(new SzabiRPSPlayer());
        players.add(new Zemen());
        players.add(new Zoly());
        players.add(new ZsofiSzakalRPSPlayer());
        players.add(new ZsoltNemethRPSPlayer());



        for (int i = 0; i < players.size(); i++){
            RockPaperScissorsPlayer player1 = players.get(i);
            for (int j = 0; j < players.size(); j++){
                RockPaperScissorsPlayer player2 = players.get(j);
                System.out.println(decideWinner(player1,player2));
            }
        }
    }

    public static String decideWinner(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2){
        String play1 = player1.showHand();
        String play2 = player2.showHand();

        while (player1.getLives()>0 || player2.getLives() > 0){
            String hand1 = player1.showHand().toLowerCase();
            String hand2 = player2.showHand().toLowerCase();
            if (hand1.equals("rock")){
                if (hand2.equals("paper")){
                    player1.decreaseLives();
                }
                if (hand2.equals("scissors")){
                    player2.decreaseLives();
                }
            }
            if (hand1.equals("paper")){
                if (hand2.equals("scissors")){
                    player1.decreaseLives();
                }
                if (hand2.equals("rock")){
                    player2.decreaseLives();
                }
            }
            if (hand1.equals("scissors")){
                if (hand2.equals("rock")){
                    player1.decreaseLives();
                }
                if (hand2.equals("paper")){
                    player2.decreaseLives();
                }
            }
        }

        return player1.getLives() == 0 ? player1.getName() : player2.getName();

    }
}
