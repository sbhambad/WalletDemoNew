package com.zuneeue.walletdemonew.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zuneeue.walletdemonew.R;
import com.zuneeue.walletdemonew.fragments.MyAccountFragment;
import com.zuneeue.walletdemonew.fragments.RewardsFragment;
import com.zuneeue.walletdemonew.fragments.RideFragment;
import com.zuneeue.walletdemonew.fragments.TransferFragment;

/**
 * Created by anupamsarfare on 10/2/15.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {

    String[] tabs;
    int[] icons = {R.drawable.ride_img,R.drawable.transfer_img,R.drawable.rewards_img,R.drawable.my_accout_img};
    Context context;


    public HomePagerAdapter(FragmentManager fm,Context context) {

        super(fm);
        tabs = context.getResources().getStringArray(R.array.home_tabs);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new RideFragment();
            case 1:
                return new TransferFragment();
            case 2:
                return new RewardsFragment();
            case 3:
                return new MyAccountFragment();

            default:
                break;

        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {

          return tabs[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
