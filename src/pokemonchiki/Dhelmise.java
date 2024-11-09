package pokemonchiki;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Dhelmise extends Pokemon {
	public Dhelmise (String name, int lvl) {
		super(name, lvl);
		setStats(70,131,100,86,90,40);
		setType(Type.GHOST,Type.GRASS);
		setMove(new FocusBlast(),new Extrasensory(),new Confide(),new SteelWing());
	}
}