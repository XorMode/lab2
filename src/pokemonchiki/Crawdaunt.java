package pokemonchiki;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Crawdaunt extends Corphish{
	public Crawdaunt (String name, int lvl) {
		super(name,lvl);
		setStats(63,120,85,90,55,55);
		addMove(new Snarl());
	}
}