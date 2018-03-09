package com.example.root.iitd_android;

import android.graphics.Bitmap;

/**
 * Created by root on 9/3/18.
 */

public class Event_Element {

    String subject ;
    String description ;
    Bitmap image ;
    String organizer ;

    public Event_Element(String subject, String description, Bitmap image, String organizer) {
        this.subject = subject;
        this.description = description;
        this.image = image;
        this.organizer = organizer ;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getOrganizer() {
        return organizer;
    }
}
