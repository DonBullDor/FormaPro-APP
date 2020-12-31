package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Formation {

    private String ref;
    private String libelle;
    private String categorie;
    private String type;
    private float prix;
    private int nbr_heures;

    public Formation() {
    }

    public Formation(String ref, String libelle, String categorie, String type, float prix, int nbr_heures) {
        this.ref = ref;
        this.libelle = libelle;
        this.categorie = categorie;
        this.type = type;
        this.prix = prix;
        this.nbr_heures = nbr_heures;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }
}
