package com.f4.letparty.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.f4.letparty.adapter.ListLocationAdapter;
import com.f4.letparty.model.Location;
import com.f4.letparty.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ListView list_location_lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list_location_lv =(ListView) findViewById(R.id.list_location);
        ArrayList<Location> listLocation_al = new ArrayList<Location>();
        // TODO: get list Location
        listLocation_al.add(new Location("test location", "test address", 0f, 0f));


        ListLocationAdapter adapter = new ListLocationAdapter(
                this,
                R.layout.location_item,
                listLocation_al
        );
        list_location_lv.setAdapter(adapter);
    }

}
