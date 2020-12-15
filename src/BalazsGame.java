import players.RockPaperScissorsPlayer;

import java.util.ArrayList;
import java.util.List;

public class BalazsGame{
    private List<RockPaperScissorsPlayer> players = new ArrayList<>();

    public void addPlayer(RockPaperScissorsPlayer player){
        players.add(player);
    }

    public void autoPlay(){
        int[] results = new int[players.size()];

        for (int i = 0; i < players.size() - 1; i++){
            for (int j = i + 1; j < players.size(); j++){
                int result = play(players.get(i), players.get(j));
                if (result == -1) results[i]++;
                else if (result == 1) results[j]++;
            }
        }

        printResults(results);
    }

    public int play(RockPaperScissorsPlayer player1, RockPaperScissorsPlayer player2){
        int maxLife = 10000;
        //player1.setLife(maxLife);
        //player2.setLife(maxLife);
        int antiCheatCounter1 = maxLife;
        int antiCheatCounter2 = maxLife;

        //while (player1.getLives() > 0 && player2.getLives() > 0){
        while (antiCheatCounter1 > 0 && antiCheatCounter2 > 0){
            String player1Hand = null;
            String player2Hand = null;
            try{
                player1Hand = player1.showHand();
            }catch(Exception e){}
            try{
                player2Hand = player2.showHand();
            }catch(Exception e){}

            if (player1Hand == null && player2Hand == null) return 0;
            if (player1Hand == null) return 1;
            if (player2Hand == null) return -1;

            if (!isValidHand(player1Hand) && !isValidHand(player2Hand)) return 0;
            if (!isValidHand(player1Hand)) return 1;
            if (!isValidHand(player2Hand)) return -1;

            int result = compare(player1Hand, player2Hand);
            if (result == -1){
                player2.decreaseLives();
                antiCheatCounter2--;
            }else if (result == 1){
                player1.decreaseLives();
                antiCheatCounter1--;
            }
            //if (player1.getLives() != antiCheatCounter1 && player2.getLives() != antiCheatCounter2) return 0;
            //if (player2.getLives() != antiCheatCounter2) return -1;
            //if (player1.getLives() != antiCheatCounter1) return 1;
        }

        System.out.print(getNameByClass(player1) + " vs " + getNameByClass(player2) + "  -> The winner is ");
        if (antiCheatCounter1 == 0){
        //if (player1.getLives() == 0){
            System.out.println(getNameByClass(player2));
            return 1;
        }else{
            System.out.println(getNameByClass(player1));
            return -1;
        }
    }

    private int compare(String hand1, String hand2){
        if (hand1.equals("rock")){
            if (hand2.equals("paper")) return 1;
            if (hand2.equals("scissors")) return -1;
            return 0;
        }else if (hand1.equals("paper")){
            if (hand2.equals("scissors")) return 1;
            if (hand2.equals("rock")) return -1;
            return 0;
        }else{
            if (hand2.equals("rock")) return 1;
            if (hand2.equals("paper")) return -1;
            return 0;
        }
    }

    private boolean isValidHand(String hand){
        if (hand.equals("rock") || hand.equals("paper") || hand.equals("scissors")) return true;
        return false;
    }

    private void printResults(int[] results){
        for (int i = 0; i < results.length; i++){
            System.out.println(getNameByClass(players.get(i)) + ": " + results[i] + " win");
        }
    }

    private String getNameByClass(RockPaperScissorsPlayer player){
        return player.toString().split("\\.")[1].split("@")[0];
    }
}
