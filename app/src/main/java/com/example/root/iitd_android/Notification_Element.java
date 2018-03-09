package com.example.root.iitd_android;

/**
 * Created by root on 9/3/18.
 */

public class Notification_Element {
    String subject ;
    String text ;

    public Notification_Element(String subject, String text) {
        this.subject = subject;
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
