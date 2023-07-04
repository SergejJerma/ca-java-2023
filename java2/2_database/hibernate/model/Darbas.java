package model;

import jakarta.persistence.*;

@Entity
@Table(name = "darbai")
public class Darbas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="darbo_id")
    private int id;
    @Column(name ="darbo_pavadinimas")
    private String pavadinimas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "darbuotojo_id")
    private Darbuotojas darbuotojas;

    public Darbas() {
    }

    public Darbas(String pavadinimas) {
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




