package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Commentaire {

    private String ref;
    private String commentaire;
    private Date date_com;

    public Commentaire() {
    }

    public Commentaire(String ref, String commentaire, Date date_com) {
        this.ref = ref;
        this.commentaire = commentaire;
        this.date_com = date_com;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate_com() {
        return date_com;
    }

    public void setDate_com(Date date_com) {
        this.date_com = date_com;
    }
}
