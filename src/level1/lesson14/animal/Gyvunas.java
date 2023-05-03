package level1.lesson14.animal;

interface Gyvunas  {

	String field = "test";

	String skleidziamasGarsas();

	default void testMethod() {
		System.out.println("default");
	}
}


/*abstract public class Gyvunas {
	
	abstract public String skleidziamasGarsas();
	
	public void kitasMetodas() {
		System.out.println("Kitas metodas");
	}
	
}*/
