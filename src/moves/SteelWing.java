package moves;
import ru.ifmo.se.pokemon.*;
public class SteelWing extends PhysicalMove{
	
	// Steel Wing deals damage and has a 10% chance of raising the user's Defense by one stage.
	public SteelWing () {
		super(Type.STEEL,70,90);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		if (p.getStat(Stat.DEFENSE  ) < 6) {
			Effect e = new Effect().chance(0.1).stat(Stat.DEFENSE  , +1);
		}
	}
	
	@Override
    protected String describe() {
        return "has used SteelWing";
    }
}