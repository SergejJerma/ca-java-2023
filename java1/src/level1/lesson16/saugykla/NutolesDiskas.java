package level1.lesson16.saugykla;

import java.util.ArrayList;
import java.util.List;

public class NutolesDiskas implements Saugykla {

	private List<Info> listas = new ArrayList<>();
	
	@Override
	public void saugotiInfo(Info i) {
		listas.add(i);
		System.out.println("Issaugota i nutolusi diska");
	}

	@Override
	public Info rastiInfo(int id) {
		for(Info i : listas) {
			if (i.getId() == id) {
				System.out.println("Rasta diske pagal ID");
				return i;
			}
		}
		System.out.println("Nerasta diske pagal ID");
		return null;
	}

	@Override
	public Info rastiInfo(String zodis) {
		for(Info i : listas) {
			if (i.arYraTekste(zodis)) {
				System.out.println("Rasta diske paga zodi");
				return i;
			}
		}
		System.out.println("Nerasta diske pagal zodi");
		return null;
	}

}
