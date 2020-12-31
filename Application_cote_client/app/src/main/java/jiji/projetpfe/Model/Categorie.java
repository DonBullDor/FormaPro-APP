package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Categorie {

    private String ref;
    private String libelle;
    private String details;

    public Categorie() {
    }

    public Categorie(String ref, String libelle, String details) {
        this.ref = ref;
        this.libelle = libelle;
        this.details = details;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
