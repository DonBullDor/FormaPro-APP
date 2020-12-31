package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Clt_Entreprise extends Client {

    public Clt_Entreprise(String ref, String nom, String prenom, String adresse, int tel1, int tel2, String mail, Date date_naiss) {
        super(ref, nom, prenom, adresse, tel1, tel2, mail, date_naiss);
    }
}
