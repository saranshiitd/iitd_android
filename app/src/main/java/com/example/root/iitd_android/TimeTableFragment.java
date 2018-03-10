package com.example.root.iitd_android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/3/18.
 */

public class TimeTableFragment extends Fragment {

    View rootView ;
    String[] days ;
    Spinner spinner ;
    ArrayAdapter<String> adapter ;
    List<TimeTableElement> timeTableElements = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.timetablelayout,container,false) ;
        days = getResources().getStringArray(R.array.days_array) ;
        spinner = rootView.getRootView().findViewById(R.id.spinnerTT) ;
        adapter =  new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,days) ;
        spinner.setAdapter(adapter);
//        spinner.setEnabled(false);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                List<TimeTableElement> ttOnDay =  new ArrayList<>() ;
                TimeTableElement.getDayTimeTable(days[i], timeTableElements,ttOnDay);
                ListView ttListView =  rootView.getRootView().findViewById(R.id.ttLIstView) ;
                ttListView.setAdapter(new TimeTableAdapter(getActivity() , R.layout.timetabletemplate , ttOnDay));
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return rootView ;
    }
}
