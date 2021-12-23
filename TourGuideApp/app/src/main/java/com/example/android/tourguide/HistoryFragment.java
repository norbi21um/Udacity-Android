package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.history_name_1), getString(R.string.hidtory_address_1), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_2), getString(R.string.hidtory_address_2), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_3), getString(R.string.hidtory_address_3), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_4), getString(R.string.hidtory_address_4), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_5), getString(R.string.hidtory_address_5), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_1), getString(R.string.hidtory_address_1), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_2), getString(R.string.hidtory_address_2), R.drawable.historylogo));
        places.add(new Place(getString(R.string.history_name_3), getString(R.string.hidtory_address_3), R.drawable.historylogo));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_history);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
