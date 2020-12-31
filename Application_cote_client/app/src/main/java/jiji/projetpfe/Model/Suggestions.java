package jiji.projetpfe.Model;

import java.util.Date;

/**
 * Created by jiji on 25/03/2017.
 */

public class Suggestions {

    private String suggestion;
    private Date date_suggest;

    public Suggestions() {
    }

    public Suggestions(String suggestion, Date date_suggest) {
        this.suggestion = suggestion;
        this.date_suggest = date_suggest;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Date getDate_suggest() {
        return date_suggest;
    }

    public void setDate_suggest(Date date_suggest) {
        this.date_suggest = date_suggest;
    }
}
