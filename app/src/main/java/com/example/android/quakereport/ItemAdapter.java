package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items){
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        Item currentItem = getItem(position);
        if(listview == null){
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Item item = getItem(position);

        TextView mag = (TextView) listview.findViewById(R.id.mag);
        TextView place = (TextView) listview.findViewById(R.id.place);
        TextView date = (TextView) listview.findViewById(R.id.date);
        TextView time = (TextView) listview.findViewById(R.id.time);
        mag.setText(item.getmMag());
        place.setText(item.getmPlace());
        date.setText(item.getmDate());
        time.setText(item.getmTime());
        return listview;
    }
}
