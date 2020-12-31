package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Personne {

    private String ref;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel1;
    private int tel2;
    private String mail;
    private Date date_naiss;

    public Personne(String ref, String nom, String prenom, String adresse, int tel1, int tel2, String mail, Date date_naiss) {
        this.ref = ref;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.mail = mail;
        this.date_naiss = date_naiss;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel1() {
        return tel1;
    }

    public void setTel1(int tel1) {
        this.tel1 = tel1;
    }

    public int getTel2() {
        return tel2;
    }

    public void setTel2(int tel2) {
        this.tel2 = tel2;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public Boolean Connect(String login, String mdp){
        Boolean succes_cnx = false;

        // Appel service
        // verifier l existance du login et mdp
        //retour service

        return succes_cnx;
    }
}
