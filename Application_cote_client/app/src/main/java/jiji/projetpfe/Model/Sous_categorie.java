package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Sous_categorie {

    private String ref;
    private String libelle;
    private String datails;

    public Sous_categorie() {
    }

    public Sous_categorie(String ref, String datails, String libelle) {
        this.ref = ref;
        this.datails = datails;
        this.libelle = libelle;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDatails() {
        return datails;
    }

    public void setDatails(String datails) {
        this.datails = datails;
    }
}
