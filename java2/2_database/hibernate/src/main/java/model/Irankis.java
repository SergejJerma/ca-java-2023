package model;

import jakarta.persistence.*;

@Entity
@Table(name = "irankiai")
public class Irankis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="irankio_id")
    private int id;

    @Column(name ="irankio_pavadinimas")
    private String pavadinimas;

    @OneToOne(mappedBy = "irankis", cascade = CascadeType.ALL)
    private Darbuotojas darbuotojas;

    public Irankis() {
    }

    public Irankis(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Darbuotojas getDarbuotojas() {
        return darbuotojas;
    }

    public void setDarbuotojas(Darbuotojas darbuotojas) {
        this.darbuotojas = darbuotojas;
    }
}
