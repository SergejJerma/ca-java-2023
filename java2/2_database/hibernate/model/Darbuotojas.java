package model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "darbuotojai")
public class Darbuotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="darbuotojo_id")
    private int id;
    private String vardas;
    private String pavarde;
    private int atlyginimas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "irankio_id")
    private Irankis irankis;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "darbuotojas")
    private List<Darbas> darbai = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "darbuotojai_miestai",
            joinColumns =
                    {@JoinColumn(referencedColumnName = "darbuotojo_id") }, inverseJoinColumns = {@JoinColumn(referencedColumnName =  "miesto_id") })
    private List<Miestas> miestai = new ArrayList<>();


    public Darbuotojas() {
    }

    public Darbuotojas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public Irankis getIrankis() {
        return irankis;
    }

    public void setIrankis(Irankis irankis) {
        this.irankis = irankis;
    }

    public List<Darbas> getDarbai() {
        return darbai;
    }

    public void setDarbai(List<Darbas> darbai) {
        this.darbai = darbai;
    }

    public List<Miestas> getMiestai() {
        return miestai;
    }

    public void setMiestai(List<Miestas> miestai) {
        this.miestai = miestai;
    }

    @Override
    public String toString() {
        return "Darbuotojas{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }
}