package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by jiji on 16/04/2017.
 */

public class Change_password extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Changer le mot de passe");
        View rootView = inflater.inflate(R.layout.activity_change_password,container, false);
        // Set view to register.xml
        final EditText act_mdp = (EditText) rootView.findViewById(R.id.act_mdp);
        final EditText nv_mdp = (EditText) rootView.findViewById(R.id.nv_mdp);
        final EditText rep_nv_mdp = (EditText) rootView.findViewById(R.id.rep_nv_mdp);
        Button btn_conserver = (Button) rootView.findViewById(R.id.btn_conserver);
        Button btn_annuler = (Button) rootView.findViewById(R.id.btn_annuler);
        btn_conserver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // On récupère les valeurs et on les convertit en string
                String mdp_actuelle = act_mdp.getText().toString();
                String mdp_nouveau = nv_mdp.getText().toString();
                String mdp_nouveau_confirm = rep_nv_mdp.getText().toString();
                // On teste si les champs login et password sont vides
                if (mdp_actuelle.equals(""))
                {
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner votre mot de passe actuel.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();

                }
                else
                if(mdp_nouveau.equals("")){
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner votre nouveau mot de passe.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else
                if (mdp_nouveau_confirm.equals("")){
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez confirmer votre nouveau mot de passe.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else
                if (mdp_nouveau_confirm != mdp_nouveau){
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

        btn_annuler.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Fragment Profile= new Profile();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Profile);
                transaction.addToBackStack(null);
                transaction.commit();

            }


        });
        return rootView;
    }

}
