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
 * Created by OKATA on 1/7/2017.
 */
public class FriendListAdapter extends ArrayAdapter<Friend> {
    public FriendListAdapter(Context context, int resource) {
        super(context, resource);
    }

    public FriendListAdapter(Context context, int resource, List<Friend> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.content_friend_info, null);
        }
        Friend friend = getItem(position);
        if (friend != null){
            TextView imgDirect = (TextView) v.findViewById(R.id.imgProfilePicture);
            TextView username = (TextView) v.findViewById(R.id.username);
            imgDirect.setText(friend.getImgDirect());
            username.setText(friend.getName());
            // TODO: set image for location
        }

        return v;
        //return super.getView(position, convertView, parent);
    }
}
