package moves;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
	
	// Уверенность снижает уровень специальной атаки цели на один пункт.
	// Статистика может быть снижена минимум до -6 этапов в каждом.
	public Confide() {
		super(Type.NORMAL,0,0);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (p.getStat(Stat.SPECIAL_ATTACK )>-6) {
			Effect e = new Effect().stat(Stat.SPECIAL_ATTACK , -1);
		}
	}
	
	@Override
    protected String describe() {
        return "has used Confide";
    }
}