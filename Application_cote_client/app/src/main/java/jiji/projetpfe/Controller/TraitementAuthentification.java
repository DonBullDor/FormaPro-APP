package jiji.projetpfe.Controller;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by jiji on 28/03/2017.
 */

public class TraitementAuthentification /* extends Context implements View.OnClickListener */{
/*
    final EditText logintxt = (EditText)findViewById(et_mail);
    final EditText mdp = (EditText)findViewById(et_mdp);

    public Base b = new Base();
    public Connection connection;
    PreparedStatement statement = null;
    ResultSet resultat;

    public TraitementAuthentification(){
    }

    @Override
    public void onClick(View v) {
        String login = logintxt.toString();
        String password = mdp.toString();

        b.connectionBD();
        connection = b.getConnection();
        try {
            statement = (PreparedStatement) connection.createStatement();
            String sql = "SELECT mdp FROM client WHERE login ='"+login+"'";
            resultat = statement.executeQuery(sql);

            if(resultat.next()){
                String motDePasse = resultat.getString(1);
            if(motDePasse.equals(password)){
                AlertDialog.Builder alert = new AlertDialog.Builder(TraitementAuthentification.this);
                alert.setTitle("Succes")
                        .setMessage("connexion reussie")
                        .setNeutralButton("OK",new DialogInterface.OnClickListener(){
                            public void onClick (DialogInterface dialogInterface, int which){
                                dialogInterface.cancel();
                            }
                        }).show();

                System.out.println("connexion reussie");
            }else {
                AlertDialog.Builder alert = new AlertDialog.Builder(TraitementAuthentification.this);
                alert.setTitle("Erreur")
                        .setMessage("Mot de passe incorrecte!")
                        .setNeutralButton("OK",new DialogInterface.OnClickListener(){
                            public void onClick (DialogInterface dialogInterface, int which){
                                dialogInterface.cancel();
                            }
                        }).show();
            }
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }*/
}
