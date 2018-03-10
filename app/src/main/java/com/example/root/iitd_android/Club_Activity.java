package com.example.root.iitd_android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by root on 9/3/18.
 */

public class Club_Activity extends Fragment {

    private ListView listView ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.club_layout,container,false) ;
        listView = rootView.findViewById(R.id.clubLinstView);
        getData();
        return rootView ;

    }

    private void getData() {

        listView.setAdapter(new Event_Adapter(getActivity(),R.layout.club_template));
    }
}
