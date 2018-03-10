package com.example.root.iitd_android;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 9/3/18.
 */

public class Event_Adapter extends ArrayAdapter {
    Context con ;
    List<Event_Element> eventList ;

    public Event_Adapter(Context context , int resource ) {
        super(context,resource);
        this.con = context ;
//        this.eventList = eventList ;


//        Bitmap bitmap1 = BitmapFactory.decodeFile("/home/batman/iitd_android/app/src/main/res/drawable-v24/image1.jpg") ;
//        Bitmap bitmap2 = BitmapFactory.decodeFile("/home/batman/iitd_android/app/src/main/res/drawable-v24/image2.jpg") ;
//        Bitmap bitmap3 = BitmapFactory.decodeFile("/home/batman/iitd_android/app/src/main/res/drawable-v24/image5.jpg") ;
//        Bitmap bitmap4 = BitmapFactory.decodeFile("/home/batman/iitd_android/app/src/main/res/drawable-v24/image4.jpg") ;
//

//        Bitmap bitmap5 = BitmapFactory.decodeFile("/home/batman/iitd_android/app/src/main/res/drawable-v24/image3.jpg") ;
        ArrayList<Bitmap> imageList = new ArrayList<>() ;
//        imageList.add(bitmap1);
//        imageList.add(bitmap2);
//        imageList.add(bitmap3);
//        imageList.add(bitmap4);

        Integer image1 = R.drawable.image1 ;
        Integer image2 = R.drawable.image2 ;
        Integer image3 = R.drawable.image5 ;
        Integer image4 = R.drawable.image4 ;
        ArrayList<Integer> imageList2;
        imageList2 = new ArrayList<>();
        imageList2.add(image1);
        imageList2.add(image2);
        imageList2.add(image3);
        imageList2.add(image4);

//        String[] subjects = getResources().getStringArray(R.array.event_subjects) ;
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.event_subjects))) ;
        ArrayList<String> organizers =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.event_organizer)));
        ArrayList<String> descriptions =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.event_description)));
        ArrayList<String> venues =  new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.venue)));
        ArrayList<String> times = new ArrayList<>(Arrays.asList(con.getResources().getStringArray(R.array.event_time))) ;

        ArrayList<Event_Element> events = new ArrayList<>() ;

        for (int i = 0 ; i < 4 ; i++) {
            events.add(new Event_Element(subjects.get(i),descriptions.get(i),imageList2.get(i),organizers.get(i),venues.get(i),times.get(i))) ;
        }
        this.eventList = events ;

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
        TextView  description = (TextView) convertView.findViewById(R.id.club_temp_text) ;
        ImageView imageView = (ImageView) convertView.findViewById(R.id.club_temp_image) ;
        TextView venue = (TextView) convertView.findViewById(R.id.event_venue) ;
        TextView time = (TextView) convertView.findViewById(R.id.event_time) ;

        subject.setText(eventList.get(position).getSubject());
        organizer.setText(eventList.get(position).getOrganizer());
        description.setText(eventList.get(position).getDescription());
//        imageView.setImage(eventList.get(position).getImage());
        imageView.setImageDrawable(con.getResources().getDrawable(eventList.get(position).getImage()));
        venue.setText(eventList.get(position).getVenue());
        time.setText(eventList.get(position).getTime());

        return convertView ;
    }
}
