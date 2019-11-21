package com.example.btechproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

public class workshop1 extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop1);

        tabLayout = findViewById(R.id.id_tab_layout);
        appBarLayout = findViewById(R.id.id_app_bar);
        viewPager = findViewById(R.id.id_view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentAvailableMachinery(), "Available Machinery");
        adapter.addFragment(new FragmentUpload(), "Upload");
        adapter.addFragment(new FragmentAboutWorkshop(), "About Workshop");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
