package com.example.root.iitd_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 9/3/18.
 */

public class Event_Adapter extends ArrayAdapter {
    Context con ;
    List<Event_Element> eventList ;

    public Event_Adapter(Context context , int resource , List<Event_Element> eventList) {
        super(context,resource);
        this.con = context ;
        this.eventList = eventList ;
    }

    @Override
    public int getCount() {
        return eventList.size() ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null  ) {convertView = inflater.inflate(R.layout.club_template , null , true ) ;

        }

        TextView subject = (TextView) convertView.findViewById(R.id.club_temp_subject) ;
        TextView organizer = (TextView) convertView.findViewById(R.id.club_temp_organizer) ;
        TextView  description = (TextView) convertView.findViewById(R.id.club_temp_subject) ;
        ImageView imageView = (ImageView) convertView.findViewById(R.id.club_temp_image) ;

        subject.setText(eventList.get(position).getSubject());
        organizer.setText(eventList.get(position).getOrganizer());
        description.setText(eventList.get(position).getDescription());
        imageView.setImageBitmap(eventList.get(position).getImage());

        return convertView ;
    }
}
