package com.example.root.iitd_android;

/**
 * Created by root on 9/3/18.
 */

public class Lecture_Element {

    String subject ;
    String speaker ;
    String description ;

    public Lecture_Element(String subject, String speaker, String description) {
        this.subject = subject;
        this.speaker = speaker;
        this.description = description;
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
