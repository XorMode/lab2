package moves;
import ru.ifmo.se.pokemon.*;
public class Snarl extends SpecialMove {
	
	// Snarl deals damage and lowers the target's Special Attack by one stage.

	public Snarl () {
	super(Type.DARK,55,95);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (p.getStat(Stat.SPECIAL_ATTACK  ) > -6) {
			Effect e = new Effect().stat(Stat.SPECIAL_ATTACK  , -1);
		}
	}
	
	@Override
    protected String describe() {
        return "has used Snarl";
    }
}