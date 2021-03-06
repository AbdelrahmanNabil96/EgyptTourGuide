package com.example.abdu.egypttourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ZooFragment();
        } else if (position == 1) {
            return new CairoTowerFragment();
        } else if (position == 2) {
            return new EgyptianMuseumFragment();
        } else {
            return new PyramidsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.zoo);
        } else if (position == 1) {
            return context.getString(R.string.tow);
        } else if (position == 2) {
            return context.getString(R.string.pyr);
        } else {
            return context.getString(R.string.mus);
        }
    }
}
