package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "miestai")
public class Miestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="miesto_id")
    private int id;
    @Column(name ="miesto_pavadinimas")
    private String pavadinimas;

    @ManyToMany(mappedBy = "miestai", cascade = CascadeType.ALL)
    private List<Darbuotojas> darbuotojai = new ArrayList<>();

    public Miestas() {
    }

    public Miestas(String pavadinimas) {
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

    public List<Darbuotojas> getDarbuotojai() {
        return darbuotojai;
    }

    public void setDarbuotojai(List<Darbuotojas> darbuotojai) {
        this.darbuotojai = darbuotojai;
    }
}
