package android.materialdesign.labs.playwithlayouts.screens.dayslistscreen;

import android.materialdesign.labs.playwithlayouts.model.Day;
import android.materialdesign.labs.playwithlayouts.model.DayAdapter;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public interface DaysListContract {
    interface DaysListView {
        void showData(DayAdapter adapter);
    }

    interface DaysListPresenter {
        ArrayList<Day> getData(ArrayList<Day>Days);
        void setData(ArrayList<Day> days);
    }
}
