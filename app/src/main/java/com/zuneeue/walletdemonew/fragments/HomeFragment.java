package com.zuneeue.walletdemonew.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zuneeue.walletdemonew.R;
import com.zuneeue.walletdemonew.adapters.HomePagerAdapter;
import com.zuneeue.walletdemonew.views.SlidingTabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private SlidingTabLayout mTabs;
    private ViewPager mPager;



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        mTabs = (SlidingTabLayout) rootView.findViewById(R.id.tabs);
        mPager = (ViewPager) rootView.findViewById(R.id.pager);
        HomePagerAdapter adapter = new HomePagerAdapter(getFragmentManager(), getActivity());
        mPager.setAdapter(adapter);
        mTabs.setCustomTabView(R.layout.custom_tab_view, R.id.tabText);
        mTabs.setDistributeEvenly(true);
        mTabs.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.white));
        mTabs.setSelectedIndicatorColors(ContextCompat.getColor(getActivity(),R.color.colorAccent));
        mTabs.setViewPager(mPager);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
