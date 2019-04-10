package android.materialdesign.labs.playwithlayouts.model;

import android.materialdesign.labs.playwithlayouts.screens.swipetabsscreen.seasonsscreen.SeasonsFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        SeasonsFragment seasonsFragment = new SeasonsFragment();
        i++;
        Bundle bundle =new Bundle();
        bundle.putString("Season" , "Fragment :"+i);
        seasonsFragment.setArguments(bundle);
        return seasonsFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position++;

        String season = null;
        if(position == 1)
            season= "Summer";
        else if(position == 2)
            season ="Winter";
        else if(position == 3)
            season ="Fall";
        else if(position == 4)
            season ="Spring";
        return (CharSequence) season;
    }
}
