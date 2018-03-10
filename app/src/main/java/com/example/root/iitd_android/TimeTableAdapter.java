package com.example.root.iitd_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 10/3/18.
 */

public class TimeTableAdapter extends ArrayAdapter {
    List<TimeTableElement> timeTableElements ;
    List<TimeTableElement> todayTT ;
    Context con ;

    public TimeTableAdapter(Context context , int resource , String day) {

        super(context,resource);
        this.con = context ;
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.subjects))) ;
//        ArrayList<String> organizers =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.event_organizer)));
        ArrayList<String> days =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.days)));
        ArrayList<String> venues =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.class_venue)));
        ArrayList<String> times = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.times))) ;
        ArrayList<TimeTableElement> allTT = new ArrayList<>() ;
        for (int i=0;i<subjects.size();i+=1){
            allTT.add(new TimeTableElement(subjects.get(i),days.get(i),times.get(i),venues.get(i)));
        }
        this.timeTableElements = allTT ;
        this.todayTT = new ArrayList<>() ;
        TimeTableElement.getDayTimeTable(day,timeTableElements,todayTT);
    }

    @Override
    public int getCount() {
        return todayTT.size() ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
        if (convertView == null) {convertView = inflater.inflate(R.layout.timetabletemplate,null,true) ;}
        TextView subject = convertView.findViewById(R.id.ttSubject) ;
        TextView time = convertView.findViewById(R.id.ttTime) ;
        TextView venue = convertView.findViewById(R.id.ttVenue) ;
        subject.setText(todayTT.get(position).getSubject());
        time.setText(todayTT.get(position).getTime());
        venue.setText(todayTT.get(position).getRoomNo());
        return convertView ;
     }
}
