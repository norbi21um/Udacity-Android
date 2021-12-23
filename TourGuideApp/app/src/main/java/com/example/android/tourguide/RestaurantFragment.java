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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.restaurant_name_1), getString(R.string.restaurant_address_1), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_2), getString(R.string.restaurant_address_2), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_3), getString(R.string.restaurant_address_3), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_4), getString(R.string.restaurant_address_4), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_5), getString(R.string.restaurant_address_5), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_1), getString(R.string.restaurant_address_1), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_2), getString(R.string.restaurant_address_2), R.drawable.restaurantlogo));
        places.add(new Place(getString(R.string.restaurant_name_3), getString(R.string.restaurant_address_3), R.drawable.restaurantlogo));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
