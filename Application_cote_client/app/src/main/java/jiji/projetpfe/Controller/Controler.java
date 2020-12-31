package jiji.projetpfe.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiji on 02/04/2017.
 */

public class Controler {

   public String fomat_ref(String ref){
       //Date systeme
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
       //date to string
       Date date = new Date();
       String d = dateFormat.format(date);
       System.out.println(d);
       ref=(d.replaceAll("\\W", ""));
       return ref;
   }
    /*************************************************************************/
    public static final String md5(final String password) {
        try {
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("MD5");
            digest.update(password.getBytes());
            byte messageDigest[]= digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i< messageDigest.length; i++) {
                String h = Integer.toHexString(0xFF & messageDigest[i]);
                while (h.length() < 2)
                    h = "0" +h;
                hexString.append(h);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static Pattern pattern;
    private static Matcher matcher;

    //Email Pattern
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validate(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isNotNull(String txt) {
        return txt!=null && txt.trim().length()>0 ? true: false;
    }

    /*
    public boolean validate_login(String email, String password) {

        boolean valid = true;

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            logintxt.setError("enter une adresse mail valide");
            valid = false;
        } else {
            logintxt.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            mdp.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            mdp.setError(null);
        }
        return valid;
    }

    public void onLoginSuccess() {
        btncnx.setEnabled(true);
        //finish();
    }
*/
}
