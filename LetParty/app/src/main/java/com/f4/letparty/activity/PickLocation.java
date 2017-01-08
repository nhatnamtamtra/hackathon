package com.f4.letparty.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.f4.letparty.adapter.PagerAdapter;
import com.f4.letparty.R;

public class PickLocation extends AppCompatActivity {
    TabLayout location_tablayout;
    ViewPager location_viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_location);
        location_tablayout = (TabLayout) findViewById(R.id.location_tab_layout);
        location_viewpager = (ViewPager) findViewById(R.id.location_view_pager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        location_viewpager.setAdapter(adapter);
        location_tablayout.setupWithViewPager(location_viewpager);
        location_viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(location_tablayout));

    }


}
