package android.materialdesign.labs.playwithlayouts.model;

import android.content.Context;
import android.materialdesign.labs.playwithlayouts.R;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.MyViewHolder> {

    private Context context ;
    private ArrayList<Day> daysList;

    public DayAdapter(Context _context , ArrayList<Day> _daysList){
        context=_context;
        daysList=_daysList;
    }
    @NonNull
    @Override
    public DayAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DayAdapter.MyViewHolder myViewHolder, int i) {

        final Day day = daysList.get(i);
        myViewHolder.txtName.setText(day.dayName);
        myViewHolder.txtDesc.setText(day.dayDesc);
        myViewHolder.imgIcon.setImageResource(day.imageRes);
        myViewHolder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, day.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return daysList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgIcon;
        private TextView txtName;
        private TextView txtDesc;
        public ConstraintLayout constraintLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon= itemView.findViewById(R.id.imageViewFlag);
            txtName = itemView.findViewById(R.id.textViewDay);
            txtDesc = itemView.findViewById(R.id.textViewDesc);
            constraintLayout = itemView.findViewById(R.id.ConstraintLayout_item);
        }
    }
}
