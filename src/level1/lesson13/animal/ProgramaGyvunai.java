package level1.lesson13.animal;

import java.util.ArrayList;

public class ProgramaGyvunai {

	public static void main(String[] args) {
		
		ArrayList<Gyvunas> gyvunai = new ArrayList<>();
		
		Gyvunas suo = new Suo();
		Gyvunas katinas = new Katinas();
		Gyvunas bite = new Bite();
		
		gyvunai.add(suo);
		gyvunai.add(katinas);
		gyvunai.add(bite);
		
		for(Gyvunas g : gyvunai) {
			g.skleidziamasGarsas();
			g.metodasInfo();
			System.out.println("***************");
		}

	}

}