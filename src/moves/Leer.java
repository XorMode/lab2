package moves;
import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove {
	
	// Leer lowers the target's Defense by one stage.

	public Leer () {
		super(Type.NORMAL,0,100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (p.getStat(Stat.DEFENSE  ) > -6) {
			Effect e = new Effect().stat(Stat.DEFENSE  , -1);
		}
	}
	
	@Override
    protected String describe() {
        return "has used Leer";
    }
}