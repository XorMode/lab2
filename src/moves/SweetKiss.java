package moves;
import ru.ifmo.se.pokemon.*;
public class SweetKiss extends StatusMove {
	
	// Sweet Kiss causes the target to become confused. Confused Pokémon have a 33% chance
	// of hurting themselves each turn, for 4 attacking turns.
	// The damage received is as if the Pokémon attacks itself with a typeless 40 base power Physical attack.
	
	public SweetKiss () {
		super(Type.FAIRY,0,75);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		int attackFirst = (int)p.getStat(Stat.ATTACK);
		p.setMod(Stat.ATTACK, 40);
		Effect e = new Effect().attack(0.33).turns(4);
		e.confuse(p);
		p.setMod(Stat.ATTACK, attackFirst);
	}
	
	@Override
    protected String describe() {
        return "has used SweetKiss";
    }
}