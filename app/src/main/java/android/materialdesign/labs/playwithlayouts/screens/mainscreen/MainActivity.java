package android.materialdesign.labs.playwithlayouts.screens.mainscreen;

import android.content.Intent;
import android.materialdesign.labs.playwithlayouts.R;
import android.materialdesign.labs.playwithlayouts.screens.colorsscreen.ColorsActivity;
import android.materialdesign.labs.playwithlayouts.screens.coordinatorscreen.CoordinatorActivity;
import android.materialdesign.labs.playwithlayouts.screens.dayslistscreen.DaysListActivity;
import android.materialdesign.labs.playwithlayouts.screens.fourseasonsscreen.FourSeasonsActivity;
import android.materialdesign.labs.playwithlayouts.screens.registrationformscreen.RegistrationFormActivity;
import android.materialdesign.labs.playwithlayouts.screens.swipetabsscreen.SwipeTabsActivity;
import android.materialdesign.labs.playwithlayouts.screens.textdecorationscreen.TextDecorationActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    MainContract.MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenterImpl(this);
    }

    public void getFourSeasons(View view) {
        Intent intent = new Intent(MainActivity.this , FourSeasonsActivity.class);
        startActivity(intent);
    }

    public void getColorsActivity(View view) {
        Intent intent = new Intent(MainActivity.this , ColorsActivity.class);
        startActivity(intent);
    }

    public void getTextDecoration(View view) {
        Intent intent = new Intent(MainActivity.this , TextDecorationActivity.class);
        startActivity(intent);
    }

    public void getDaysList(View view) {
        Intent intent = new Intent(MainActivity.this , DaysListActivity.class);
        startActivity(intent);
    }

    public void getSwipeTabs(View view) {
        Intent intent = new Intent(MainActivity.this , SwipeTabsActivity.class);
        startActivity(intent);
    }

    public void getCoordinator(View view) {
        Intent intent = new Intent(MainActivity.this , CoordinatorActivity.class);
        startActivity(intent);
    }

    public void getRegistrationForm(View view) {
        Intent intent = new Intent(MainActivity.this , RegistrationFormActivity.class);
        startActivity(intent);
    }
}
