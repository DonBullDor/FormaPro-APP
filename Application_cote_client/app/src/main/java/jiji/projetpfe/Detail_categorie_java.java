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
 * Created by jiji on 23/04/2017.
 */
public class Detail_categorie_java extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Details");
        View rootView = inflater.inflate(R.layout.activity_details_categorie_java,container, false);
        // Set view to register.xml
        Button btn_inscrire = (Button) rootView.findViewById(R.id.btn_inscrire);
        Button btn_annuler = (Button) rootView.findViewById(R.id.btn_annuler);
        btn_inscrire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    //Définition du Toast 'champs pas rempli"
                    Context context = v.getContext();
                    CharSequence text = "Succes d'inscription";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
            }


        });

        btn_annuler.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Fragment info= new Main_categorie_info();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,info);
                transaction.addToBackStack(null);
                transaction.commit();

            }


        });
        return rootView;
    }




}
