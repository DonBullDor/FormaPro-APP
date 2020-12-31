package jiji.projetpfe;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/*
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;

import static jiji.projetpfe.R.id.btn_register;*/

/**
 * Created by jiji on 03/02/2017.
 */

public class ContactFragment extends Fragment {
    //MapView mapView;
    View myView;
    //private GoogleMap googleMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Contact");

        myView = inflater.inflate(R.layout.activity_contact, container, false);
        /*
        mapView = (MapView) myView.findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        }catch (Exception e) {
            e.printStackTrace();
        }
*/

        LinearLayout call = (LinearLayout)myView.findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:29215715"));
                startActivity(callIntent);

            }
        });

        return myView;
    }

}
