package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

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
        mag.setText(item.getmMag());
        place.setText(item.getmPlace());
        date.setText(item.getmDate());
        return listview;
    }
}
