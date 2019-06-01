package optional;

import java.util.Random;

public class TastyEgg {
	public static void main(String[] args) {
		KinderSurprise myKinderSurprise = new KinderSurprise(new Egg(new Toy()));

		System.out.println(myKinderSurprise.getKinderSurpriseContents().getEggContents().getToyName());

	}
}

class KinderSurprise {
	private Egg egg;

	public KinderSurprise(Egg egg) {
		this.egg = egg;
	}

	Egg getKinderSurpriseContents() {
		egg.getEggContents();

		return egg;
	}
}

class Egg {

	private Toy toy;

	public Egg(Toy toy) {
		this.toy = toy;
	}

	Toy getEggContents() {
		toy.getToyName();

		return toy;
	}

}

class Toy {
	String getToyName() {
		int randomToySelector = new Random().nextInt(3);
		if (randomToySelector == 0)
			return "tamagotchi";
		else if (randomToySelector == 1)
			return "train";
		else
			return "fidget spinner";
	}

}
