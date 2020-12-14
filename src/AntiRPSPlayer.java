package players;

pucblic class AntiRPSPlayer extends RockPaperScissorsPlayers {

    public Integer getLives () {
        return this.lives;
    }

    public String showHand() {
        String[] possibleHands = new String[] {"rock", "paper", "scissors"};
        Random ranom = new Random();
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
}