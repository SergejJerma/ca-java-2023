package level1.biudzetas;

abstract public class Irasas {

	protected Integer id;
	protected Double suma;
	protected String laikas;
	protected String komentaras;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(Double suma) {
		this.suma = suma;
	}

	public String getLaikas() {
		return laikas;
	}

	public void setLaikas(String laikas) {
		this.laikas = laikas;
	}

	public String getKomentaras() {
		return komentaras;
	}

	public void setKomentaras(String komentaras) {
		this.komentaras = komentaras;
	}
}