package android.materialdesign.labs.playwithlayouts.screens.swipetabsscreen;

import android.materialdesign.labs.playwithlayouts.R;
import android.materialdesign.labs.playwithlayouts.model.ViewPagerAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SwipeTabsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_tabs);
        toolbar =findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.beginFakeDrag(); // 3shan el tabs bs hya ely teshta3'l

        tabLayout =findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
