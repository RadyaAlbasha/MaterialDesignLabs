package android.materialdesign.labs.playwithlayouts.screens.swipetabsscreen.seasonsscreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.materialdesign.labs.playwithlayouts.R;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeasonsFragment extends Fragment {


    ImageView imageView;
    public SeasonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_seasons, container, false);
        imageView = view.findViewById(R.id.imageViewSeason);
        String season = getArguments().getString("Season");
        if(season.equals("Fragment :"+1))
        {
            imageView.setImageResource(R.drawable.summer2);
        }
        else if(season.equals("Fragment :"+2))
            imageView.setImageResource(R.drawable.winter);
        else if(season.equals("Fragment :"+3))
            imageView.setImageResource(R.drawable.fall2);
        else if(season.equals("Fragment :"+4))
            imageView.setImageResource(R.drawable.spring);
        return view;
    }


}
