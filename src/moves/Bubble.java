package moves;
import ru.ifmo.se.pokemon.*;
public class Bubble extends SpecialMove {
	
	// Bubble deals damage and has a 10% chance of lowering the target's Speed by one stage.

	public Bubble() {
		super(Type.WATER,40,100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1).stat(Stat.SPEED, -1);
	}
	
	@Override
    protected String describe() {
        return "has used Bubble";
    }
}