package jiji.projetpfe.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jiji on 28/03/2017.
 */

public class Base {
    public Connection connection;
    public void connectionBD(){
        //chargement de la bd
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de la bd");
            e.getMessage();
            System.exit(0);
        }
        //connexion de la bd
        try {
            String url = "jdbc:mysql://localhost/formapro";
            String user = "root";
            String pwd = "";
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion a la bd");
        }
    }
    public Connection getConnection(){
        return connection;
    }

    //Deconnexion

    public void Deconnexion(){

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Deconnexion impossible");
        }
    }
}
