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
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by jiji on 23/04/2017.
 */

public class Main_categorie_commerce extends Fragment {
    GridView grid;
    String[] gridViewString = {
            "Francais",
            "Anglais",
            "Allemand",
            "Italien",
            "Espagnol",
            "Japonaise"
    };
    int[] gridViewImageid = {
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais,
            R.drawable.anglais
    };

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Commerce");
        myView = inflater.inflate(R.layout.activity_catalogue_gridv_text_image, container, false);
        Catalogue adapter = new Catalogue(this, gridViewString, gridViewImageid);
        grid = (GridView)myView.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                position = 1;
                Toast.makeText(myView.getContext(), "Vous avez cliquez sur " +gridViewString[+ position], LENGTH_SHORT).show();
                Fragment Profile= new Profile();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Profile);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        return myView;
    }
}

