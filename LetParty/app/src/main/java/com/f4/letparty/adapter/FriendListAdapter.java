package com.f4.letparty.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.f4.letparty.activity.FriendListActivity;
import com.f4.letparty.model.Friend;
import com.f4.letparty.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by OKATA on 1/7/2017.
 */
public class FriendListAdapter extends ArrayAdapter<Friend> {
    private static Context mContext;
    public FriendListAdapter(Context context, int resource) {
        super(context, resource);
    }

    public FriendListAdapter(Context context, int resource, List<Friend> objects) {
        super(context, resource, objects);
        mContext = context;
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
            ImageView imgDirect = (ImageView) v.findViewById(R.id.imgProfilePicture);
            TextView username = (TextView) v.findViewById(R.id.username);
            int id = mContext.getResources().getIdentifier(friend.getImgDirect(), "drawable", mContext.getPackageName());
            Drawable drawable = mContext.getResources().getDrawable(id);
            imgDirect.setBackground(drawable);
            username.setText(friend.getName());
            // TODO: set image for location
        }

        return v;
        //return super.getView(position, convertView, parent);
    }
}
