package level1.lesson16.saugykla;

public class Programa {

	public static void main(String[] args) {

		// susikuriame dvi skirtingas saugyklas
		Saugykla saugykla1 = new DuomenuBaze();
		Saugykla saugykla2 = new NutolesDiskas();

		// susikuriame keleta Info objektu
		Info info1 = new Info(111, "pirmas tekstas");
		Info info2 = new Info(222, "antras tekstas");
		Info info3 = new Info(333, "trecias tekstas");

		// issaugome Info objektus i pirmaja saugykla
		saugoti(saugykla1, info1);
		saugoti(saugykla1, info2);
		saugoti(saugykla1, info2);

		// issaugome tuos pacius Info objektus i antraja saugykla
		saugoti(saugykla2, info1);
		saugoti(saugykla2, info2);
		saugoti(saugykla2, info2);

		// ieskome Info iraso pagal id pirmoje saugykloje
		rasti(saugykla1, 222);

		// ieskome Info iraso pagal zodi pirmoje saugykloje
		rasti(saugykla1, "trecias");

		// ieskome Info iraso pagal id antroje saugykloje
		rasti(saugykla2, 111);

		// ieskome Info iraso pagal zodi antroje saugykloje
		rasti(saugykla2, "antras");

	}
	
	private static void saugoti(Saugykla saugykla, Info info) {
		saugykla.saugotiInfo(info);
	}
	
	private static void rasti(Saugykla saugykla, int id) {
		Info rastasInfo = saugykla.rastiInfo(id);
		if (rastasInfo != null) {
			System.out.println("Rastas info objektas pagal ID: " + rastasInfo);
		}
	}
	
	private static void rasti(Saugykla saugykla, String zodis) {
		Info rastasInfo = saugykla.rastiInfo(zodis);
		if (rastasInfo != null) {
			System.out.println("Rastas info objektas pagal zodi: " + rastasInfo);
		}
	}
	

}