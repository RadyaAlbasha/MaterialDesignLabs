package android.materialdesign.labs.playwithlayouts.screens.dayslistscreen;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.materialdesign.labs.playwithlayouts.R;
import android.materialdesign.labs.playwithlayouts.model.Day;
import android.materialdesign.labs.playwithlayouts.model.DayAdapter;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class DaysListActivity extends AppCompatActivity implements DaysListContract.DaysListView{

    ArrayList<Day> days;
    private RecyclerView recyclerView;
    DaysListContract.DaysListPresenter presenter;


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    FloatingActionButton fab;
    Animation fabBtnAnimation;
    ObjectAnimator fabBtnobAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_list);
        initComponents();

        recyclerView = findViewById(R.id.recyclerViewDays);
        presenter = new DaysListPresenterImpl(this);
        days = presenter.getData(days);
        presenter.setData(days);
    }

    private void initComponents(){
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.nav_toolbar);
        fab = findViewById(R.id.fab);
        setSupportActionBar(toolbar);
        setMenu();

        setAnimations();
        setListeners();

    }

    private void setAnimations(){
        fabBtnAnimation = AnimationUtils.loadAnimation(this,R.anim.raised_btn);

        fabBtnobAnimation = ObjectAnimator.ofFloat(fab,"x",800);
        fabBtnobAnimation.setRepeatCount(1);
        fabBtnobAnimation.setRepeatMode(ObjectAnimator.REVERSE);
        fabBtnobAnimation.setDuration(2000);
    }
    private void setListeners(){

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                fab.startAnimation(fabBtnAnimation);
                LinearLayout root = (LinearLayout) findViewById( R.id.LinearLayoutFab);
                DisplayMetrics dm = new DisplayMetrics();
                DaysListActivity.this.getWindowManager().getDefaultDisplay().getMetrics( dm );

                int originalPos[] = new int[2];
                view.getLocationOnScreen( originalPos );

                int xDest = dm.widthPixels/6;
                xDest -= (view.getMeasuredWidth());

                TranslateAnimation anim = new TranslateAnimation( 0, xDest - originalPos[0] , 0, 0 );
                anim.setDuration(1000);
                anim.setFillAfter( true );
                anim.setRepeatMode(Animation.REVERSE);
                anim.setRepeatCount(1);
                view.startAnimation(anim);
            }
        });
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);

                        // close drawer when item is tapped
                        drawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        drawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );
    }

    private void setMenu(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void showData(DayAdapter adapter) {
        recyclerView.setLayoutManager(new LinearLayoutManager(DaysListActivity.this));
        recyclerView.setAdapter(adapter);
    }
}
