package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Paiement {

    private String ref;
    private Date date;
    private double montant;

    public Paiement(String ref, Date date, double montant) {
        this.ref = ref;
        this.date = date;
        this.montant = montant;
    }

    public Paiement() {
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
