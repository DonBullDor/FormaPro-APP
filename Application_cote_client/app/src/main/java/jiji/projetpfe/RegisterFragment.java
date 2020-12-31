package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by jiji on 10/02/2017.
 */

public class RegisterFragment extends Fragment {
    public RegisterFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Inscription");
        View rootView = inflater.inflate(R.layout.activity_register, container, false);
        // Set view to register.xml
        final EditText reg_email = (EditText) rootView.findViewById(R.id.reg_email);
        final EditText reg_password = (EditText) rootView.findViewById(R.id.reg_password);
        final EditText reg_password_confirm = (EditText) rootView.findViewById(R.id.reg_password_confirm);
        Button btnRegister = (Button) rootView.findViewById(R.id.btnRegister);
        TextView loginScreen = (TextView) rootView.findViewById(R.id.link_to_login);

        btnRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                // On récupère les valeurs et on les convertit en string
                String email = reg_email.getText().toString();
                String password = reg_password.getText().toString();
                String password_confirm = reg_password_confirm.getText().toString();
                // On teste si les champs login et password sont vides
                if (email.equals(""))
                {
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner votre email.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();

                }
                else
                if(password.equals("")){
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner votre mot de passe.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else
                if (password_confirm.equals("")){
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez confirmer votre mot de passe.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else
                if (password_confirm != password){
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veillez tapez le meme mot de passe";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else{
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Succes";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
            }


        });
        loginScreen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Fragment Login;
                Login = new LoginFragment();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Login);
                transaction.addToBackStack(null);
                transaction.commit();

            }


        });

        return rootView;
    }

}
