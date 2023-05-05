package level1.lesson15.number;

public class SkaiciuPrograma {

	public static void main(String[] args) {
		
		Skaicius skaicius1 = new LyginisSkaicius();
		Skaicius skaicius2 = new TeigiamasSkaicius();
		
		run(skaicius1);
		run(skaicius2);
		
		printArray(skaicius1);
		printArray(skaicius2);
		
		System.out.println("Lyginiu suma: " + skaicius1.suma());
		System.out.println("Teigiamu suma: " + skaicius2.suma());

	}
	
	public static void run(Skaicius s) {
		s.generuok();
	}
	
	public static void printArray(Skaicius s) {
		System.out.println("--------------------------");
		for(int elem : s.getMasyvas()) {
			System.out.println(elem);
		}
		System.out.println("--------------------------");
	}

}
