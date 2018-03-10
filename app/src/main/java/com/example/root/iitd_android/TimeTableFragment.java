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
    ListView listView ;
    View rootView ;
    String[] days ;
    Spinner spinner ;
    ArrayAdapter<String> adapter ;
    List<TimeTableElement> timeTableElements = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.timetablelayout,container,false) ;
        listView = rootView.findViewById(R.id.ttLIstView) ;
        if (listView.getHeaderViewsCount() == 0 ) {
            listView.addHeaderView(getLayoutInflater().inflate(R.layout.timetabletemplate, null));
        }
        days = getResources().getStringArray(R.array.days_array) ;
        spinner = rootView.findViewById(R.id.spinnerTT) ;
        adapter =  new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,days) ;
        spinner.setAdapter(adapter);
//        spinner.setEnabled(false);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getData(days[i]);
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return rootView ;
    }

    private void getData(String day){
//        listView.addHeaderView(getLayoutInflater().inflate(R.layout.timetabletemplate,null));
        listView.setAdapter(new TimeTableAdapter(getActivity(),R.layout.timetabletemplate,day));
    }


}
