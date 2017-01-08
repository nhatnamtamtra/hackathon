package com.f4.letparty.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.f4.letparty.R;

import com.f4.letparty.activity.*;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LocationContent} interface
 * to handle interaction events.
 * Use the {@link LocationContent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocationContent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    Button invite_btn;
    public LocationContent() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LocationContent newInstance(String param1, String param2) {
        LocationContent fragment = new LocationContent();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_location_content, container, false);
        invite_btn = (Button) v.findViewById(R.id.location_content_invite_btn);
        invite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent friendListIntent = new Intent(getContext(), FriendListActivity.class);
                    startActivity(friendListIntent);
                }
                catch (Exception e){
                    Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }

}
