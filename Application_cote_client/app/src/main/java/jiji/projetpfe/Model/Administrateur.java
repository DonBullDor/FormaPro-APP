package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Administrateur extends Personne {

    private String login;
    private String mdp;

    public Administrateur(String ref, String nom, String prenom, String adresse, int tel1, int tel2, String mail, Date date_naiss, String login, String mdp) {
        super(ref, nom, prenom, adresse, tel1, tel2, mail, date_naiss);
        this.login = login;
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
