package com.f4.letparty;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nhatn on 1/7/2017.
 */

public class ListLocationAdapter extends ArrayAdapter<Location> {
    public ListLocationAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ListLocationAdapter(Context context, int resource, List<Location> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.location_item, null);
        }
        Location location = getItem(position);
        if (location != null){
            TextView name = (TextView) v.findViewById(R.id.location_name);
            TextView address = (TextView) v.findViewById(R.id.location_address);
            name.setText(location.getName());
            address.setText(location.getAddress());
            // TODO: set image for location
        }

        return v;
        //return super.getView(position, convertView, parent);
    }
}
