package level1.biudzetas;

public class PajamuIrasas extends Irasas{

	public static final String PAJAMU_KATEGORIJA = "P";
	
	private String pajamuKategorija;
	private String pajamuTipas;

	public String getPajamuKategorija() {
		return pajamuKategorija;
	}

	public void setPajamuKategorija(String pajamuKategorija) {
		this.pajamuKategorija = pajamuKategorija;
	}

	public String getPajamuTipas() {
		return pajamuTipas;
	}

	public void setPajamuTipas(String pajamuTipas) {
		this.pajamuTipas = pajamuTipas;
	}

	@Override
	public String toString() {
		return String.format("Pajamu iraso ID: %d \nPajamu suma: %.2f \nKomentaras: %s \nData: %s \nPajamu tipas: %s \n",
				id, suma, komentaras, laikas, pajamuTipas);
	}
}

