package android.materialdesign.labs.playwithlayouts.screens.coordinatorscreen;

import android.materialdesign.labs.playwithlayouts.R;
import android.materialdesign.labs.playwithlayouts.model.ViewPagerAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CoordinatorActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        //viewPager.beginFakeDrag(); // 3shan el tabs bs hya ely teshta3'l

        tabLayout =findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
