package jiji.projetpfe;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jiji on 25/04/2017.
 */

public class TabFragment extends Fragment {
    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.tab_layout, null);
        tabLayout = (TabLayout)x.findViewById( R.id.tabs );
        viewPager = (ViewPager)x.findViewById( R.id.viewpager );

        //viewPager.setAdapter( new MyAdapter (x.getChildFragmentManager()));
        tabLayout.post( new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager( viewPager );
            }
        } );
        return x;
    }

    class MyAdapter extends FragmentPagerAdapter {
Context c;


        public MyAdapter(FragmentManager childFragmentManager) {
            super( childFragmentManager );
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position){
                case 0 : return new PrimaryFragment();
                case 1 : return new PrimaryFragment();
                case 2 : return new PrimaryFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0 : return "Tab1";
                case 1 : return "Tab2";
                case 2 : return "Tab3";
            }
            return null;
        }
    }
}
