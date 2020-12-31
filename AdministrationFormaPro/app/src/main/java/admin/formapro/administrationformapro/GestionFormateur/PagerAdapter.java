package admin.formapro.administrationformapro.GestionFormateur;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AojuterFormateur tab1 = new AojuterFormateur();
                return tab1;
            case 1:
                ModifierFormateur tab2 = new ModifierFormateur();
                return tab2;
           /* case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;*/
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}