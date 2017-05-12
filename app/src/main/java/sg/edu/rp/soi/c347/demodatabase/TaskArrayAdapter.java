package sg.edu.rp.soi.c347.demodatabase;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> tasks;
    private Context context;
    private TextView textViewID, textViewDesc,textViewDate;

    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        tasks = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row, parent, false);

        textViewID = (TextView) row.findViewById(R.id.tvID);
        textViewDesc = (TextView)row.findViewById(R.id.tvDesc);
        textViewDate = (TextView)row.findViewById(R.id.tvDate);
        Task currentModule = tasks.get(position);

        textViewID.setText(currentModule.getId() + "");
        textViewDesc.setText(currentModule.getDescription());
        textViewDate.setText(currentModule.getDate());

        return row;
    }
}
