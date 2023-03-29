package fr.eni.demorelation.model;

import javax.persistence.*;

@Entity
@Table(name="PERSONNE_MTO")
public class Civilite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cle;
    private String libelle;

    public Civilite() {
}
    public Civilite(String cle, String libelle) {
        this.cle = cle;
        this.libelle = libelle;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Civilite{");
        sb.append("cle='").append(cle).append('\'');
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
