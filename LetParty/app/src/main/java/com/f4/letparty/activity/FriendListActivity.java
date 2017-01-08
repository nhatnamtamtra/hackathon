package com.f4.letparty.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.f4.letparty.model.Friend;
import com.f4.letparty.adapter.FriendListAdapter;
import com.f4.letparty.R;

import java.util.ArrayList;

public class FriendListActivity extends AppCompatActivity {
    ListView listFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);

        listFriend =(ListView) findViewById(R.id.listView);
        ArrayList<Friend> arrayFriend = new ArrayList<Friend>();
        // TODO: get list Location
        arrayFriend.add(new Friend("Nhatnam Doan", "nhatnam", "3728493274"));
        arrayFriend.add(new Friend("Bui Ba Phuc", "buibaphuc", "3728493274"));
        arrayFriend.add(new Friend("Minh Chuong", "minhchuong", "3728493274"));
        arrayFriend.add(new Friend("Viet Bao", "vietbao", "3728493274"));

        FriendListAdapter adapter = new FriendListAdapter(
                this,
                R.layout.location_item,
                arrayFriend
        );
        listFriend.setAdapter(adapter);
    }

}
