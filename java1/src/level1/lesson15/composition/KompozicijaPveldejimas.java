package level1.lesson15.composition;

public class KompozicijaPveldejimas {

	public static void main(String[] args) {
		
		TransportoPriemone tp = new Automobilis(5);
		tp.metodasX();
		
		int skersmuo = ((Automobilis)tp).getVairas().getSkersmuo();
		
		System.out.println(skersmuo);
		
	}

}