package players;

public class IZsolt extends RockPaperScissorsPlayer{


    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String showHand() {
        String[] possibleHands = new String[]{"rock","paper","scissors"};
        int index=(int)(Math.random()* possibleHands.length);
        return possibleHands[index];
    }

    @Override
    public void decreaseLives() {
    this.lives--;
    }

    @Override
    public String getName(){
        return "Iszály Zsolt";
    }
}
