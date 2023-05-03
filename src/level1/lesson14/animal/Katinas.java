package level1.lesson14.animal;

public class Katinas implements Gyvunas{

	@Override
	public String skleidziamasGarsas() {
		return "Miau";
	}

	@Override
	public void testMethod() {
		System.out.println("Katinas Miau");
	}
}
