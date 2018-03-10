package com.example.root.iitd_android;

/**
 * Created by root on 9/3/18.
 */

public class Lecture_Element {

    private String subject ;
    private String speaker ;
    private String description ;
    private String venue ;
    private String time ;

    public Lecture_Element(String subject, String speaker, String description, String venue,  String time) {
        this.subject = subject;
        this.speaker = speaker;
        this.description = description;
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

    public String getSpeaker() {
        return speaker;
    }

    public String getDescription() {
        return description;
    }

}
