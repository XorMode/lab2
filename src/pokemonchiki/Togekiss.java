package pokemonchiki;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Togekiss extends Togetic {
	public Togekiss (String name, int lvl) {
		super(name,lvl);
		setStats(85,50,95,120,115,80);
		addMove(new SteelWing());
	}
}