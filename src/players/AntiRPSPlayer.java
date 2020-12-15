package players;

public class AntiRPSPlayer extends RockPaperScissorsPlay {

    public Integer getLives () {
        return this.lives;
    }

    public String showHand() {
        String[] possibleHands = new String[] {"rock", "paper", "scissors"};
        Random random = new Random();
        int rps = random.nextInt(3);
        String showHand = switch (rps) {
            case 0:
                "rock";
            case 1:
                "paper";
            default:
                "scissors";
        };
        return showHand
    }

    public void decreaseLives() {
        this.lives--;
    }

    @Override
    public String getName() {
        return "Anti"
    }
}