package jiji.projetpfe.Model;

/**
 * Created by jiji on 25/03/2017.
 */

public class Local {

    private String ref;
    private String libelle;
    private String adresse;
    private int tel1;
    private int tel2;
    private int fax1;
    private int fax2;

    public Local() {
    }

    public Local(String ref, String libelle, String adresse, int tel1, int tel2, int fax1, int fax2) {
        this.ref = ref;
        this.libelle = libelle;
        this.adresse = adresse;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.fax1 = fax1;
        this.fax2 = fax2;
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

    public int getFax1() {
        return fax1;
    }

    public void setFax1(int fax1) {
        this.fax1 = fax1;
    }

    public int getFax2() {
        return fax2;
    }

    public void setFax2(int fax2) {
        this.fax2 = fax2;
    }
}
