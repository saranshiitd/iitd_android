package com.example.root.iitd_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by root on 9/3/18.
 */

public class Notification_Adapter extends ArrayAdapter {
    private List<Notification_Element> list ;
    Context con ;
    public Notification_Adapter(Context context, int resource , List<Notification_Element> notificationList) {
        super(context,resource);
        this.con = context ;
        this.list = notificationList ;
    }

    @Override
    public int getCount() {
        return list.size() ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null  ) {convertView = inflater.inflate(R.layout.template_notifications , null , true ) ;

            }
        TextView subject = (TextView) convertView.findViewById(R.id.notification_subject) ;
        TextView textView = (TextView) convertView.findViewById(R.id.notification_text) ;

        subject.setText(list.get(position).getSubject());
        textView.setText(list.get(position).getText());
        return convertView ;
    }
}
