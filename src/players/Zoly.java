package players;

import java.util.Random;

public class Zoly extends RockPaperScissorsPlayer {

	String[] insults ={"Asshole!", "Bastard!", "Bitch!", "Cunt!"};

	String[] hands = {"rock", "paper", "scissors"};
	@Override
	public Integer getLives() {
		return 3;
	}

	@Override
	public String showHand() {
		psychologicalWarfare();
		return hands[(int) (3*Math.random())];
	}

	@Override
	public void decreaseLives() {

	}
	public void psychologicalWarfare(){
		String psychologicalWarfare = "I will show you a ";
		psychologicalWarfare += hands[(int) (3*Math.random())] + ". ";
		psychologicalWarfare += insults[(int) (4*Math.random())] + " ";
		System.out.println(psychologicalWarfare);
	}
}
