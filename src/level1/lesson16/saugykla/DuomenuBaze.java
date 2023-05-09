package level1.lesson16.saugykla;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuomenuBaze implements Saugykla {

	private Map<Integer, Info> mapas = new HashMap<>(); // key:value
	
	@Override
	public void saugotiInfo(Info i) {
		mapas.put(i.getId(), i);
		System.out.println("Issaugota i DB");
	}

	@Override
	public Info rastiInfo(int id) {
		Info rastasInfo = mapas.get(id);
		if (rastasInfo != null) {
			System.out.println("Rasta DB pagal ID");
		} else {
			System.out.println("Nerasta DB pagal ID");
		}
		return rastasInfo;
	}

	@Override
	public Info rastiInfo(String z) {
		Set<Integer> visiRaktai = mapas.keySet();
		for (Integer raktas : visiRaktai) {
			Info i = mapas.get(raktas);
			if (i.arYraTekste(z)) {
				System.out.println("Rasta DB pagal zodi");
				return i;
			}
		}
		System.out.println("Nerasta DB pagal zodi");
		return null;
	}

}
