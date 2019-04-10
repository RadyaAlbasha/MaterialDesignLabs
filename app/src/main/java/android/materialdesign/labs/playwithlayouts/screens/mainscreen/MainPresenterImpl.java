package android.materialdesign.labs.playwithlayouts.screens.mainscreen;

public class MainPresenterImpl implements MainContract.MainPresenter {

    MainContract.MainView activity;

    public MainPresenterImpl(MainContract.MainView activity){
        this.activity = activity;
    }

}
