package com.zuneeue.walletdemonew.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zuneeue.walletdemonew.R;

import org.w3c.dom.Text;

/**
 * Created by anupamsarfare on 9/23/15.
 */
public class IntroAdapter extends PagerAdapter {

    int[] introImages = {R.drawable.intro1,R.drawable.intro2,R.drawable.intro3,R.drawable.intro4};
    String[] introHeaders = {"REWARD-O-LUTIONS HERE", "SHARE MONEY WITH FRIEND", "PAY FOR RIDE", "CLAIM REWARDS"};
    String[] introSubHeaders = {"Wallet that rewards for transactions", "Wallet to wallet or wallet to account", "Now no need to carry change", "Save money, live better"};

    Context context;
    LayoutInflater inflater;

    public IntroAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return introImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = inflater.inflate(R.layout.intro_swipe_layout,container,false);
        ImageView introImage = (ImageView) item_view.findViewById(R.id.introImage);
        TextView introHeader = (TextView) item_view.findViewById(R.id.introHeader);
        TextView introSubHeader = (TextView) item_view.findViewById(R.id.introSubHeader);
        introImage.setImageResource(introImages[position]);
        introHeader.setText(introHeaders[position]);
        introSubHeader.setText(introSubHeaders[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((LinearLayout)object);
    }
}
