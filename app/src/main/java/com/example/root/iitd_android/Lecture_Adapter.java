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
 * Created by root on 9/3/18.
 */

public class Lecture_Adapter extends ArrayAdapter {

    List<Lecture_Element> lectureList ;
    Context con ;
    public Lecture_Adapter(Context context , int resource ) {
        super(context,resource);
        this.con = context ;
//        this.lectureList = lectureList ;
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.seminar_subject))) ;
        ArrayList<String> speakers = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.seminar_speaker))) ;
        ArrayList<String> venues = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.seminar_venue))) ;
        ArrayList<String> time = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.seminar_time))) ;
        ArrayList<String> descriptions = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.seminar_description))) ;
        ArrayList<Lecture_Element> lectures = new ArrayList<>() ;
        for (int i=0;i< speakers.size(); i++){
            lectures.add(new Lecture_Element(subjects.get(i),speakers.get(i),descriptions.get(i),venues.get(i),time.get(i))) ;
        }
        this.lectureList = lectures ;
    }

    @Override
    public int getCount() {
        return lectureList.size() ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null  ) {convertView = inflater.inflate(R.layout.lecture_template , null , true ) ;

        }

        TextView subject = convertView.findViewById(R.id.Lecture_topic) ;
        TextView speaker = convertView.findViewById(R.id.lecture_speaker) ;
        TextView description = convertView.findViewById(R.id.lecture_text) ;
        TextView venue = convertView.findViewById(R.id.lecture_venue) ;
        TextView time = convertView.findViewById(R.id.lectureTIme) ;

        subject.setText(lectureList.get(position).getSubject());
        speaker.setText(lectureList.get(position).getSpeaker());
        description.setText(lectureList.get(position).getDescription());
        venue.setText(lectureList.get(position).getVenue());
        time.setText(lectureList.get(position).getTime());


        return convertView ;
    }
}
