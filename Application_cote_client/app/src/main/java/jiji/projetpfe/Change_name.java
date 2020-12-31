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

public class Change_name extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Changer le nom");
        View rootView = inflater.inflate(R.layout.activity_change_name,container, false);
        // Set view to register.xml
        final EditText nv_name = (EditText) rootView.findViewById(R.id.nv_name);
        Button btn_conserver = (Button) rootView.findViewById(R.id.btn_conserver);
        Button btn_annuler = (Button) rootView.findViewById(R.id.btn_annuler);
        btn_conserver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // On récupère les valeurs et on les convertit en string
                String name_nv = nv_name.getText().toString();
                // On teste si les champs login et password sont vides
                if (name_nv.equals(""))
                {
                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Veuillez renseigner votre nom.";
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
