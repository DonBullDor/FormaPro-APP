package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Session {

    private String ref;
    private Date date_deb;
    private Date date_fin;
    private int nbr_heures;
    private int remise;

    public Session() {
    }

    public Session(String ref, int remise, Date date_fin, int nbr_heures, Date date_deb) {
        this.ref = ref;
        this.remise = remise;
        this.date_fin = date_fin;
        this.nbr_heures = nbr_heures;
        this.date_deb = date_deb;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }
}
