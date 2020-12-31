package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import jiji.projetpfe.Controller.Controler;

import static jiji.projetpfe.R.id.btn_login;
import static jiji.projetpfe.R.id.btn_register;
import static jiji.projetpfe.R.id.content_navigation_drawer;
import static jiji.projetpfe.R.id.design_navigation_view;
import static jiji.projetpfe.R.id.et_mail;
import static jiji.projetpfe.R.id.et_mdp;
import static jiji.projetpfe.R.id.nav_view;
import org.json.JSONException;
import org.json.JSONObject;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;



/**
 * Created by jiji on 05/02/2017.
 */

public class LoginFragment extends Fragment {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    //initialisation

    Button btncnx=null;
    TextView btnregister=null;
    EditText logintxt=null;
    EditText mdp=null;

    private static String TAG = "LoginFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Connexion");
        final View rootView = inflater.inflate(R.layout.activity_login, container, false);


        // Inflate the layout for this fragment
        TextView errorMsg = (TextView)rootView.findViewById(R.id.login_error);
        ProgressDialog prgDialog;
        prgDialog = new ProgressDialog(rootView.getContext());
        prgDialog.setMessage("Attendez SVP...");
        prgDialog.setCancelable(false);
        logintxt = (EditText)rootView.findViewById(et_mail);
        mdp = (EditText)rootView.findViewById(et_mdp);
        btncnx = (Button)rootView.findViewById(btn_login) ;
        btnregister = (TextView)rootView.findViewById(btn_register);
        btncnx.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // On récupère les valeurs et on les convertit en string
                String email = logintxt.getText().toString();
                String password = mdp.getText().toString();

                //RequestParams params = new RequestParams();
                // On teste si les champs login et password sont vides

                //if((email=="jiji")&& (password=="jiji") ){
                    //NavigationView navigationView = (NavigationView)rootView.findViewById(R.id.nav_view);
                    Fragment Profile= new Profile();

                    FragmentManager manager = getFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.content_frame,Profile);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    //navigationView.getMenu().setGroupVisible(R.id.groupe_1, true);


                //}

/*
                //when Email Edit View and Password Edit View have values other then Null
                if(Controler.isNotNull(email) && Controler.isNotNull(password)) {
                    //when email entered is valid
                    if(Controler.validate(email)) {
                        //Put Http Parameter username with value of Email Edit View control
                        params.put("username", email);
                        //Put Http Parameter password with value of Email Edit View control
                        params.put("password", password);
                        //Invoke RESTful Web Service with Http parameters
                        //invokeWS(params);
                        NavigationView navigationView = (NavigationView)rootView.findViewById(R.id.nav_view);
                        navigationView.getMenu().setGroupVisible(R.id.groupe_1, true);
                    }
                    //when email is invalid
                    else{
                        Context context = v.getContext();
                        CharSequence text = "Veuillez renseigner un email valide.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                    }
                } else{
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner tous les champs.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                } */


            }

        });
        btnregister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Fragment Register;
                Register = new RegisterFragment();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Register);
                transaction.addToBackStack(null);
                transaction.commit();

            }


        });

        // Inflate the layout for this fragment


        return rootView;
    }
    /*
    private void invokeWS(RequestParams params) {
        // show progress dialog
        prg_Dialog.show();
        // Make restfull webservice call using AsyncHttpClient object
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://192.168.2.2:9999/useraccount/login/dologin" ,params ,new AsyncHttpResponseHandler()){
            //when the response returned by REST has Http response code '200'
            public void onSuccess(String response) {
                //Hide progress dialog
                prgDialog.hide();
                try {
                    //JSON Object
                    JSONObject obj = new JSONObject(response);
                    //when the json response has status boolean value assignedwith true
                    if(obj.getBoolean("status")){
                        Context context = v.getContext();
                        CharSequence text = "Succes d'authentification.";
                        int duration = Toast.LENGTH_LONG;
                        Toast.makeText(context, text, duration).show();
                        //navigate to home screen

                    }
                    else{
                        errorMsg.setText(obj.getString("error_msg"));
                        Context context = v.getContext();
                        int duration = Toast.LENGTH_LONG;
                        Toast.makeText(context, errorMsg, duration).show();
                    }
                } catch (JSONException e) {
                    Context context = v.getContext();
                    CharSequence text = "Error Occured [server's JSON response might be invalid]!.";
                    int duration = Toast.LENGTH_LONG;
                    Toast.makeText(context, text, duration).show();
                    e.printStackTrace();
                }
            }
            // when the response returned by REST has Http response code other than '200'
        public void onFailure(int statusCode, Throwable error, String content) {
            prgDialog.hide();
            if(statusCode == 404){
                Toast.makeText(getContext(),"Requested ressource not found", Toast.LENGTH_LONG).show();
            }
            else if(statusCode == 500){
                Toast.makeText(getContext(),"something went wrong at server end", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getContext(),"Unexpected Error occured! [Most common error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
            }
        }
        });
    }
*/

}



