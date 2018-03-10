package com.example.root.iitd_android;

import android.graphics.Bitmap;

/**
 * Created by root on 9/3/18.
 */

public class Event_Element {

    private String subject ;
    private String description ;
    private Integer image ;
    private String organizer ;
    private String venue ;
    private String time ;

    public Event_Element(String subject, String description, Integer image, String organizer, String venue , String time) {
        this.subject = subject;
        this.description = description;
        this.image = image;
        this.organizer = organizer ;
        this.venue = venue ;
        this.time = time ;
    }

    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public Integer getImage() {
        return image;
    }

    public String getOrganizer() {
        return organizer;
    }
}
