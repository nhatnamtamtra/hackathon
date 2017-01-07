package com.f4.letparty;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LocationContent.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LocationContent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocationContent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

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
        return inflater.inflate(R.layout.fragment_location_content, container, false);
    }

}
