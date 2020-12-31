package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jiji on 06/02/2017.
 */

public class AccueilFragment extends Fragment {
    View myViewAccueil;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Accueil");
        myViewAccueil = inflater.inflate(R.layout.activity_catalogue_gridv_layout , container , false);
        /*
        tv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = new Fragment();
                fragmentTransaction.replace(R.id.content_frame, new Main_catalogue());
                fragmentTransaction.commit();
            }
        });*/
        return myViewAccueil;
    }
}
