package jiji.projetpfe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jiji on 28/04/2017.
 */
public class Client_activities extends Fragment {
    View v;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Contact");

        v = inflater.inflate(R.layout.activity_contact, container, false);
        LinearLayout l1 = (LinearLayout)v.findViewById( R.id.l1 );
        LinearLayout l2 = (LinearLayout)v.findViewById( R.id.l2 );
        LinearLayout l3 = (LinearLayout)v.findViewById( R.id.l3 );
        ImageView img1 = (ImageView)v.findViewById( R.id.img1 );
        ImageView img2 = (ImageView)v.findViewById( R.id.img2 );
        ImageView img3 = (ImageView)v.findViewById( R.id.img3 );
        final TextView msg = (TextView)v.findViewById( R.id.msg );

        img1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg.setText( "Visulaliser vos paiements des formations ici !" );
            }
        });

        img2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg.setText( "Visulaliser vos formations ici !" );
            }
        });

        img3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg.setText( "Vous pouvez commander vos attestations ici !" );
            }
        });


        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment Paiement= new Profile();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Paiement);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment Paiement= new Profile();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Paiement);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment Paiement= new Profile();

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_frame,Paiement);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return v;
    }
}
