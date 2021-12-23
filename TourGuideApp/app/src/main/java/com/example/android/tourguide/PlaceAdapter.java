package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by norbi21um on 2018. 08. 13..
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int colorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Place currentPlace = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentPlace.getName());


        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentPlace.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResouceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
