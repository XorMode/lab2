package moves;
import ru.ifmo.se.pokemon.*;
public class Extrasensory extends SpecialMove {
	
	// Extrasensory deals damage and has
	// a 10% chance of causing the target to flinch.
	
	public Extrasensory() {
		super(Type.PSYCHIC,80,100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1);
		e.flinch(p);
	}
	
	@Override
    protected String describe() {
        return "has used Extrasensory";
    }
}