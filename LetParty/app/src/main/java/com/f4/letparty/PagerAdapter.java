package com.f4.letparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by nhatn on 1/7/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle info = new Bundle();
        Fragment frag = new LocationContent();
        frag.setArguments(info);
        return frag;
        //return null;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="06/2016";
                break;
            case 1:
                title="07/2016";
                break;
            case 2:
                title="08/2016";
                break;
            case 3:
                title="09/2016";
                break;
            case 4:
                title="10/2016";
                break;
            case 5:
                title="LAST MONTH";
                break;
            case 6:
                title="THIS MONTH";
                break;
            case 7:
                title="01/2017";
                break;
        }

        return title;
        //return super.getPageTitle(position);
    }

}
