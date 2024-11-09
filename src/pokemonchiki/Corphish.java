package pokemonchiki;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Corphish extends Pokemon{
	public Corphish (String name, int lvl) {
		super(name, lvl);
		setStats(43,80,65,50,35,35);
		setType(Type.WATER,Type.DARK);
		setMove(new DoubleTeam(),new Bubble(),new Leer());
	}
}