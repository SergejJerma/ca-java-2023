package level1.biudzetas;


import java.util.Objects;

public class Irasas {

	private Integer id;
	private Double suma;
	private String laikas;
	private String komentaras;
	private Category kategorija;
	private String tipas;

	public Irasas() {
	}

	public Irasas(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
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

	public Category getKategorija() {
		return kategorija;
	}

	public void setKategorija(Category kategorija) {
		this.kategorija = kategorija;
	}

	public String getTipas() {
		return tipas;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Irasas irasas = (Irasas) o;
		return Objects.equals(id, irasas.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Irasas{" +
				"id=" + id +
				", suma=" + suma +
				", laikas='" + laikas + '\'' +
				", komentaras='" + komentaras + '\'' +
				", kategorija=" + kategorija +
				", tipas='" + tipas + '\'' +
				'}';
	}
}