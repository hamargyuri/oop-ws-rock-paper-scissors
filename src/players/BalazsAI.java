package players;

public class BalazsAI extends RockPaperScissorsPlayer{
    private int logic = (int) (Math.random() * 2);

    @Override
    public Integer getLives(){
        return this.lives;
    }

    @Override
    public String showHand(){
        if (this.logic == 0) return onlyRock();
        return randomHand();
    }

    @Override
    public void decreaseLives(){
        this.logic = this.logic == 0 ? 1 : 0;
        this.lives--;
    }

    private String randomHand(){
        int i = (int) (Math.random() * 3);

        if (i == 0) return "rock";
        if (i == 1) return "paper";
        return "scissors";
    }

    private String onlyRock(){
        return "rock";
    }

}
