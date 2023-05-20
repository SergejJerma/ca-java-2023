package level1.lesson14.animal;

public class Bite implements Gyvunas, Skraidantis {

	@Override
	public String skleidziamasGarsas() {
		return "Bzzz";
	}

	@Override
	public void skrendu() {
		System.out.println("Bite skrenda");
	}

}
