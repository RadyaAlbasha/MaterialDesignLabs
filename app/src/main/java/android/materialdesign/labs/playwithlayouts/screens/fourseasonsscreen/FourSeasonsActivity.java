package android.materialdesign.labs.playwithlayouts.screens.fourseasonsscreen;

import android.materialdesign.labs.playwithlayouts.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FourSeasonsActivity extends AppCompatActivity implements FourSeasonsContract.FourSeasonsView{

    ImageView summer;
    FourSeasonsContract.FourSeasonsPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_seasons);
    }

    public void springSeason(View view) {
        Toast.makeText(this, "Spring", Toast.LENGTH_SHORT).show();
    }

    public void fallSeason(View view) {
        Toast.makeText(this, "Fall", Toast.LENGTH_SHORT).show();
    }

    public void winterSeason(View view) {
        Toast.makeText(this, "Winter", Toast.LENGTH_SHORT).show();
    }

    public void summerSeason(View view) {
        Toast.makeText(this, "Summer", Toast.LENGTH_SHORT).show();
    }
}
