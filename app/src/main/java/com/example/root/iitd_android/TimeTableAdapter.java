package com.example.root.iitd_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 10/3/18.
 */

public class TimeTableAdapter extends ArrayAdapter {
    List<TimeTableElement> timeTableElements ;
    Context con ;

    public TimeTableAdapter(Context context , int resource , List<TimeTableElement> timeTableElements) {

        super(context,resource);
        this.con = context ;
        this.timeTableElements = timeTableElements ;

    }

    @Override
    public int getCount() {
        return timeTableElements.size() ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
        if (convertView == null) {convertView = inflater.inflate(R.layout.timetabletemplate,null,true) ;}
        TextView subject = convertView.findViewById(R.id.ttSubject) ;
        TextView time = convertView.findViewById(R.id.ttTime) ;
        TextView venue = convertView.findViewById(R.id.ttVenue) ;
        subject.setText(timeTableElements.get(position).getSubject());
        time.setText(timeTableElements.get(position).getTime());
        venue.setText(timeTableElements.get(position).getRoomNo());
        return convertView ;
     }
}
