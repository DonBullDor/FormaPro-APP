package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jiji on 30/03/2017.
 */

public class Profile extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Mon profile");
        View rootView = inflater.inflate(R.layout.material_design_profile_screen_xml_ui_design, container, false);
        // Set view to register.xml
        TextView change_mdp = (TextView) rootView.findViewById(R.id.change_password);
        TextView name = (TextView) rootView.findViewById(R.id.user_profile_name);
        change_mdp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment Change_password = new Change_password();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame, Change_password);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        name.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment Change_name = new Change_name();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame, Change_name);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        return rootView;
    }
}
