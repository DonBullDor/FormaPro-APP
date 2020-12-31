package jiji.projetpfe;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import static android.R.id.tabs;

/**
 * Created by jiji on 12/04/2017.
 */

public class Tabs extends Fragment implements TabHost.OnTabChangeListener{
/*
private View view;
    private TabHost tabHost;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(tabs, null);
        tabHost = (TabHost) view.findViewById(android.R.id.tabhost);
        setupTabs();
        return view;
    }

    private void setupTabs() {
        tabHost.setup();
        tabHost.addTab(newTab());
    }*/

    @Override
    public void onTabChanged(String tabId) {

    }
}
