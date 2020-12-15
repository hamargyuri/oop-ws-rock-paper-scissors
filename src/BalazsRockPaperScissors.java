import players.*;

public class BalazsRockPaperScissors{
    public static void main(String[] args) {
        BalazsGame game = new BalazsGame();

        game.addPlayer(new AdamTeboldRPSPlayer());
        game.addPlayer(new AndrasVasmaticsRPSPlayer());
        //game.addPlayer(new AntiRPSPlayer());
        game.addPlayer(new BalazsAI());
        game.addPlayer(new BenceAI());
        game.addPlayer(new ErikRPSPlayer());
        game.addPlayer(new GeriSzaszRPSPlayer());
        //game.addPlayer(new hntsPlayer());
        game.addPlayer(new IZsolt());
        game.addPlayer(new JanosRPSPlayer());
        game.addPlayer(new KMarcellRPSPlayer());
        game.addPlayer(new LaciRPSPlayer());
        game.addPlayer(new Marci());
        game.addPlayer(new NorbiRPSPlayer());
        game.addPlayer(new PJanosPlayer());
        game.addPlayer(new SzabiRPSPlayer());
        //game.addPlayer(new Zemen());
        game.addPlayer(new Zoly());
        game.addPlayer(new ZsofiSzakalRPSPlayer());
        game.addPlayer(new ZsoltNemethRPSPlayer());

        game.autoPlay();
    }
}
