import players.*;

public class BalazsRockPaperScissors{
    public static void main(String[] args) {
        BalazsGame game = new BalazsGame();

        game.addPlayer(new AdamTeboldRPSPlayer());
        game.addPlayer(new BalazsAI());
        game.addPlayer(new GeriSzaszRPSPlayer());
        game.addPlayer(new IZsolt());
        game.addPlayer(new JanosRPSPlayer());
        game.addPlayer(new KMarcellRPSPlayer());
        game.addPlayer(new Marci());
        game.addPlayer(new NorbiRPSPlayer());
        game.addPlayer(new PJanosPlayer());
        game.addPlayer(new SzabiRPSPlayer());
        game.addPlayer(new Zemen());
        game.addPlayer(new Zoly());

        game.autoPlay();
    }
}
