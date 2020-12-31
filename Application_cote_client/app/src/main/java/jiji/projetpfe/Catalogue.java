package jiji.projetpfe;

import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jiji on 29/03/2017.
 */

public class Catalogue extends BaseAdapter{
    private Fragment mContext;
    private final String[] gridViewString;
    private final int[] gridViewImageid;

        public Catalogue(Fragment context, String[] gridViewString, int[] gridViewImageid) {
            mContext = context;
            this.gridViewImageid = gridViewImageid;
            this.gridViewString = gridViewString;
        }




    @Override
    public int getCount() {
        return gridViewString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid ;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = inflater.inflate(R.layout.activity_catalogue_gridv_layout, null);
            TextView textView = (TextView) grid.findViewById(R.id.android_gridview_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.android_gridview_image);
            textView.setText(gridViewString[position]);
            imageView.setImageResource(gridViewImageid[position]);
        return grid;
    }
}
