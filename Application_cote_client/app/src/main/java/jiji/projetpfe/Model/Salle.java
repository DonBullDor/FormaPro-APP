package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Salle {

    private String ref;
    private String libelle;
    private int capacite;
    private int nbr_pc;

    public Salle() {
    }

    public Salle(String ref, String libelle, int capacite, int nbr_pc) {
        this.ref = ref;
        this.libelle = libelle;
        this.capacite = capacite;
        this.nbr_pc = nbr_pc;
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

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNbr_pc() {
        return nbr_pc;
    }

    public void setNbr_pc(int nbr_pc) {
        this.nbr_pc = nbr_pc;
    }
}
