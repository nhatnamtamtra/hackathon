package com.f4.letparty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        arrayFriend.add(new Friend("test 1", "test 12", "3728493274"));
        arrayFriend.add(new Friend("test 2", "test 22", "3728493274"));

        FriendListAdapter adapter = new FriendListAdapter(
                this,
                R.layout.location_item,
                arrayFriend
        );
        listFriend.setAdapter(adapter);
    }

}
