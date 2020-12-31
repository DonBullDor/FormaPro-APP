package jiji.projetpfe;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jiji on 06/02/2017.
 */

public class AproposdenousFragment extends Fragment {
    View myViewAproposdenous;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("A propos");
        myViewAproposdenous = inflater.inflate(R.layout.activity_a_propos_de_nous , container , false);
        return myViewAproposdenous;
    }
}
