package moves;
import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove{
	
	// Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit.
	// Stats can be raised to a maximum of +6 stages each.
	
	public DoubleTeam (){
		super(Type.NORMAL,0,0);
	}
	
	@Override
	protected void	applySelfEffects(Pokemon p) {
		if (p.getStat(Stat.EVASION) < 6) {
			p.setMod(Stat.EVASION,  +1);
		}
	}
	
	@Override
    protected String describe() {
        return "has used DoubleTeam";
    }
}