package admin.formapro.administrationformapro.GestionFormateur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import admin.formapro.administrationformapro.R;

import static android.R.attr.button;

public class AjouterFormation extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_ajouter_formation, container, false);
    }
}
