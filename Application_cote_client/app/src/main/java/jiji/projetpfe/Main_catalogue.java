package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Switch;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by jiji on 29/03/2017.
 */

public class Main_catalogue extends Fragment {
    GridView grid;
    String[] gridViewString = {
            "Informatique",
            "Langues",
            "Commerce",
            "Banque",
            "Archive",
            "Electonique",
            "Mecanique",
            "Medecine",
            "Gestion"
    };
    int[] gridViewImageid = {
            R.drawable.info,
            R.drawable.lang1,
            R.drawable.commerce,
            R.drawable.bank,
            R.drawable.archive,
            R.drawable.electro,
            R.drawable.mecaniq,
            R.drawable.medecine,
            R.drawable.gestion
    };

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Catalogue");
        myView = inflater.inflate(R.layout.activity_catalogue_gridv_text_image, container, false);
        Catalogue adapter = new Catalogue(Main_catalogue.this, gridViewString, gridViewImageid);
        grid = (GridView)myView.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                FragmentManager manager;
                FragmentTransaction transaction;

            switch (position) {
                case 0:
                    Fragment info= new Main_categorie_info();

                    manager = getFragmentManager();
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.content_frame,info);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    break;
                case 1:
                    Fragment langues= new Main_categorie_langues();

                    manager = getFragmentManager();
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.content_frame,langues);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    break;

                case 2:
                    Fragment commerce= new Main_categorie_commerce();

                    manager = getFragmentManager();
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.content_frame,commerce);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    break;

                case 5:
                    Fragment electro= new Main_categorie_electronique();

                    manager = getFragmentManager();
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.content_frame,electro);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    break;

            }
                /*
                Toast.makeText(myView.getContext(), "Vous avez cliquez sur " +gridViewString[+ position], LENGTH_SHORT).show();
                Fragment categorie= new Main_categorie_langues();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,categorie);
                transaction.addToBackStack(null);
                transaction.commit();

                */
            }


        });
        return myView;
    }
}
