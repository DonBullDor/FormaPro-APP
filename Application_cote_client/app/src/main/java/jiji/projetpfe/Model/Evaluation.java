package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 02/04/2017.
 */

public class Evaluation {
    private String ref;
    private String type;
    private Date date;
    private int note;

    public Evaluation(String type, Date date, int note, String ref) {
        this.type = type;
        this.date = date;
        this.note = note;
        this.ref = ref;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
