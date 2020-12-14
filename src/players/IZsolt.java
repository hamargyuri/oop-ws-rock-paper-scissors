package players;

public class IZsolt extends RockPaperScissorsPlayer{


    @Override
    public Integer getLives() {
        return lives;
    }

    @Override
    public String showHand() {
        return ;
    }

    @Override
    public void decreaseLives() {
    lives--;
    }
}
