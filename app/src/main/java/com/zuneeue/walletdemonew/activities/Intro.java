package com.zuneeue.walletdemonew.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zuneeue.walletdemonew.R;
import com.zuneeue.walletdemonew.adapters.IntroAdapter;

public class Intro extends Activity {

    ViewPager intro;
    ImageView slideOneIndicator;
    ImageView slideTwoIndicator;
    ImageView slideThreeIndicator;
    ImageView slideFourIndicator;

    LinearLayout skipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        intro = (ViewPager) findViewById(R.id.intro);
        IntroAdapter adapter = new IntroAdapter(getApplicationContext());
        intro.setAdapter(adapter);

        slideOneIndicator = (ImageView) findViewById(R.id.slideOneIndicator);
        slideTwoIndicator = (ImageView) findViewById(R.id.slideTwoIndicator);
        slideThreeIndicator = (ImageView) findViewById(R.id.slideThreeIndicator);
        slideFourIndicator = (ImageView) findViewById(R.id.slideFourIndicator);

        intro.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0) {
                    slideOneIndicator.setImageResource(R.drawable.circle_selected);
                    slideTwoIndicator.setImageResource(R.drawable.circle);
                    slideThreeIndicator.setImageResource(R.drawable.circle);
                    slideFourIndicator.setImageResource(R.drawable.circle);
                } else if (position == 1) {
                    slideTwoIndicator.setImageResource(R.drawable.circle_selected);
                    slideOneIndicator.setImageResource(R.drawable.circle);
                    slideThreeIndicator.setImageResource(R.drawable.circle);
                    slideFourIndicator.setImageResource(R.drawable.circle);
                } else if (position == 2) {
                    slideThreeIndicator.setImageResource(R.drawable.circle_selected);
                    slideOneIndicator.setImageResource(R.drawable.circle);
                    slideTwoIndicator.setImageResource(R.drawable.circle);
                    slideFourIndicator.setImageResource(R.drawable.circle);
                } else if (position == 3) {
                    slideFourIndicator.setImageResource(R.drawable.circle_selected);
                    slideOneIndicator.setImageResource(R.drawable.circle);
                    slideTwoIndicator.setImageResource(R.drawable.circle);
                    slideThreeIndicator.setImageResource(R.drawable.circle);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        skipView = (LinearLayout) findViewById(R.id.skipView);

        skipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intro.this,Home.class);
                startActivity(intent);
            }
        });



    }


}
