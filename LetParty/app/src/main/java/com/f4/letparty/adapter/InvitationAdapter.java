package com.f4.letparty.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.f4.letparty.R;
import com.f4.letparty.model.*;

import java.util.List;

/**
 * Created by nhatn on 1/8/2017.
 */

public class InvitationAdapter extends ArrayAdapter<Invitation>{
    public InvitationAdapter(Context context, int resource) {
        super(context, resource);
    }

    public InvitationAdapter(Context context, int resource, List<Invitation> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.invitation_item, null);
        }
        Invitation invitation = getItem(position);
        if (invitation != null){
            TextView name = (TextView) v.findViewById(R.id.invitation_host);
            TextView address = (TextView) v.findViewById(R.id.invitation_location);
            TextView time = (TextView) v.findViewById(R.id.invitation_time);
            name.setText(invitation.getHost());
            address.setText(invitation.getLocation());

            // TODO: set image and time for location
        }

        return v;
    }

}
