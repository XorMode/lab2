package moves;
import ru.ifmo.se.pokemon.*;
public class FireBlast extends SpecialMove {
	
	// Fire Blast deals damage and has a 10% chance of burning the target.
	public FireBlast () {
		super(Type.FIRE,110,85);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1);
		e.burn(p);
	}
	
	@Override
    protected String describe() {
        return "has used FireBlast";
    }
}