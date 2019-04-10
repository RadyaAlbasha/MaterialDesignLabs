package android.materialdesign.labs.playwithlayouts.screens.fourseasonsscreen;

import android.materialdesign.labs.playwithlayouts.screens.mainscreen.MainContract;

public class FourSeasonsPresenterImpl  implements FourSeasonsContract.FourSeasonsPresenter{
     FourSeasonsContract.FourSeasonsView activity;

    public FourSeasonsPresenterImpl(FourSeasonsContract.FourSeasonsView activity){
        this.activity = activity;
    }
}
