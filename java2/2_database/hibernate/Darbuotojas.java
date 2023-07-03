package model;
import jakarta.persistence.*;

//@Entity
//@Table(name = "darbuotojai")
public class Darbuotojas {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name ="id")
    private int id;
    private String vardas;
    private String pavarde;
    private int atlyginimas;


    public Darbuotojas() {
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
}