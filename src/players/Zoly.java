package players;


public class Zoly extends RockPaperScissorsPlayer {
	protected Integer lives = 3;
	private String[] insults ={"Asshole!", "Bastard!", "Bitch!", "Cunt!", "Prick!"};
	private String[] hands = {"rock", "paper", "scissors"};

	@Override
	public Integer getLives() {
		return this.lives;
	}

	@Override
	public String showHand() {
		psychologicalWarfare();
		return hands[(int) (3*Math.random())];
	}

	@Override
	public void decreaseLives() {
		this.lives--;

	}
	private void psychologicalWarfare(){
		String psychologicalWarfare = "I will show you a ";
		psychologicalWarfare += hands[(int) (3*Math.random())] + ". ";
		psychologicalWarfare += insults[(int) (5*Math.random())] + " ";
		System.out.println(psychologicalWarfare);
	}

	@Override
	public String getName() {
		return "Z-oly";
	}
}
