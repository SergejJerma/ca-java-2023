package level1.lesson14.animal;

public class Programa {

	public static void main(String[] args) {
		
		Gyvunas g1 = new Suo();
		Gyvunas g2 = new Katinas();
		Gyvunas g3 = new Bite();
		Gyvunas g4 = new Bite();

		System.out.println(Gyvunas.field);

		g2.testMethod();

		Skraidantis g5 = new Bite();
		Bite g6 = new Bite();
		
		System.out.println(g1.skleidziamasGarsas());
		System.out.println(g2.skleidziamasGarsas());
		System.out.println(g3.skleidziamasGarsas());
		System.out.println(g4.skleidziamasGarsas());

		
		Skraidantis s = (Skraidantis) g3;
		s.skrendu();

		g5.skrendu();
		g6.skleidziamasGarsas();
		g6.skrendu();
		
		Gyvunas g = (Gyvunas)s;
		g.skleidziamasGarsas();

		g4.testMethod();

		Gyvunas.staticMeth();

	}

}