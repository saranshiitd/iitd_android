package com.example.root.iitd_android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by root on 9/3/18.
 */

public class Notification_activity extends Fragment {

    private  ListView listView ;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notification_layout,container,false) ;
        listView = rootView.findViewById(R.id.notification_listview) ;
        getData();
        return rootView ;
    }

    private void getData(){
        listView.setAdapter(new Notification_Adapter(getActivity(),R.layout.template_notifications));
    }
}
