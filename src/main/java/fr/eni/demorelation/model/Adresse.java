package fr.eni.demorelation.model;

import javax.persistence.*;

@Entity
@Table(name = "ADRESSE_OTM")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cp",length = 5)
    private String codePostal;
    private String ville;

    public Adresse() {
    }

    public Adresse(String codePostal, String ville) {
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
