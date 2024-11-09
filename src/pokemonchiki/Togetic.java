package pokemonchiki;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Togetic extends Togepi {
	public Togetic (String name, int lvl) {
		super(name,lvl);
		setStats(55,40,85,80,105,40);
		addMove(new SweetKiss());
	}
}