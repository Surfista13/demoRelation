package fr.eni.demorelation.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PERSONNE_OTM")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    @ManyToOne
    private Civilite civilite;

    public Personne() {

}

    public Personne(String nom, String prenom, Civilite civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personne{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
