package moves;
import ru.ifmo.se.pokemon.*;
public class FocusBlast extends SpecialMove{
	
	// Focus Blast deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
	// Stats can be lowered to a minimum of -6 stages each.
	
	public FocusBlast() {
		super(Type.FIGHTING,120,70);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (p.getStat(Stat.SPECIAL_DEFENSE)>-6) {
			Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
		}
	}
	
	
	@Override
    protected String describe() {
        return "has used FocusBlast";
    }
}