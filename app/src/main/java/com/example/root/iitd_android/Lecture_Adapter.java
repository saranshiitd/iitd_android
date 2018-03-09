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
 * Created by root on 9/3/18.
 */

public class Lecture_Adapter extends ArrayAdapter {

    List<Lecture_Element> lectureList ;
    Context con ;
    public Lecture_Adapter(Context context , int resource , List<Lecture_Element> lectureList) {
        super(context,resource);
        this.con = context ;
        this.lectureList = lectureList ;
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

        subject.setText(lectureList.get(position).getSubject());
        speaker.setText(lectureList.get(position).getSpeaker());
        description.setText(lectureList.get(position).getDescription());



        return convertView ;
    }
}
