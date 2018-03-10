package com.example.root.iitd_android;

import java.util.List;

/**
 * Created by root on 10/3/18.
 */

public class TimeTableElement {
    private String subject ;
    private String day ;
    private String time ;
    private String roomNo ;

    public TimeTableElement(String subject, String day, String time, String roomNo) {
        this.subject = subject;
        this.day = day;
        this.time = time;
        this.roomNo = roomNo ;
    }

    public String getSubject() {
        return subject;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public static void getDayTimeTable(String day, List<TimeTableElement> timeTable, List<TimeTableElement> todaysTimeTable) {
        for (TimeTableElement timeTableElement: timeTable
             ) {
            if (timeTableElement.getDay().equals(day) ) todaysTimeTable.add(timeTableElement) ;
        }
    }
}
