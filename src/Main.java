import ru.ifmo.se.pokemon.*;
import moves.*;
import pokemonchiki.*;
class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new Dhelmise("Dhelmise", 1);
		Pokemon p2 = new Corphish("Corphish", 3);
		Pokemon p3 = new Crawdaunt("Crawdaunt",14);
		Pokemon p4 = new Togepi("Togepi",15);
		Pokemon p5 = new Togetic("Togetic",2);
		Pokemon p6 = new Togekiss("Togekiss",2);
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
	}
}