package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Client extends Personne {

    private String login;
    private String mdp;
    private int cin;

    public Client(String ref, String nom, String prenom, String adresse, int tel1, int tel2, String mail, Date date_naiss, String login, String mdp, int cin) {
        super(ref, nom, prenom, adresse, tel1, tel2, mail, date_naiss);
        this.login = login;
        this.mdp = mdp;
        this.cin = cin;
    }

    public Client(String ref, String nom, String prenom, String adresse, int tel1, int tel2, String mail, Date date_naiss) {
        super(ref, nom, prenom, adresse, tel1, tel2, mail, date_naiss);
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

    public int getCin() { return cin; }

    public void setCin(int cin) { this.cin = cin; }
}

