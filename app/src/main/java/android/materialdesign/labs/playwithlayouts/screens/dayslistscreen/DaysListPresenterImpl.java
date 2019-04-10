package android.materialdesign.labs.playwithlayouts.screens.dayslistscreen;


import android.content.Context;
import android.materialdesign.labs.playwithlayouts.R;
import android.materialdesign.labs.playwithlayouts.model.Day;
import android.materialdesign.labs.playwithlayouts.model.DayAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaysListPresenterImpl implements  DaysListContract. DaysListPresenter {

    DaysListContract. DaysListView activity;
    DayAdapter dayAdapter;

    public DaysListPresenterImpl( DaysListContract. DaysListView activity){
        this.activity = activity;
    }

    @Override
    public ArrayList<Day> getData(ArrayList<Day> days) {
        days = new ArrayList<Day>();
        days.add(new Day("Saturday", "Today is Saturday", R.drawable.one));
        days.add(new Day("Sunday", "Today is Sunday", R.drawable.two));
        days.add(new Day("Monday", "Today is Monday", R.drawable.three));
        days.add(new Day("Tuesday", "Today is Tuesday", R.drawable.four));
        days.add(new Day("Wednesday", "Today is Wednesday", R.drawable.five));
        days.add(new Day("Thursday", "Today is Thursday", R.drawable.six));
        days.add(new Day("Friday", "Today is Friday", R.drawable.seven));
        return days;
    }

    @Override
    public void setData(ArrayList<Day> days) {
        dayAdapter = new DayAdapter((Context) activity,days);
        activity.showData(dayAdapter);
    }
}
