package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Module_de_Formation {

    private String ref;
    private String type;
    private int nbr_heures_par_mois;
    private String libelle_module;

    public Module_de_Formation() {
    }

    public Module_de_Formation(String ref, String type, int nbr_heures_par_mois, String libelle_module) {
        this.ref = ref;
        this.type = type;
        this.nbr_heures_par_mois = nbr_heures_par_mois;
        this.libelle_module = libelle_module;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbr_heures_par_mois() {
        return nbr_heures_par_mois;
    }

    public void setNbr_heures_par_mois(int nbr_heures_par_mois) {
        this.nbr_heures_par_mois = nbr_heures_par_mois;
    }

    public String getLibelle_module() {
        return libelle_module;
    }

    public void setLibelle_module(String libelle_module) {
        this.libelle_module = libelle_module;
    }
}
