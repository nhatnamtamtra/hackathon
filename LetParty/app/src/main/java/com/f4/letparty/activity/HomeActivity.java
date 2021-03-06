package com.f4.letparty.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.f4.letparty.adapter.InvitationAdapter;
import com.f4.letparty.adapter.ListLocationAdapter;
import com.f4.letparty.model.*;
import com.f4.letparty.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ListView list_invitation_accepted;
    ListView list_invitation_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // TODO: Open Login
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);


        list_invitation_accepted =(ListView) findViewById(R.id.invitation_accepted_list);
        ArrayList<Invitation > arrayListAccepted = new ArrayList<Invitation>();
        // TODO: get list Location
        arrayListAccepted.add(new Invitation(1,2,3,4));


        InvitationAdapter adapter = new InvitationAdapter(
                this,
                R.layout.invitation_item,
                arrayListAccepted
        );
        list_invitation_accepted.setAdapter(adapter);

        list_invitation_new = (ListView) findViewById(R.id.invitation_new_list);
        ArrayList<Invitation> arrayListNew = new ArrayList<Invitation>();
        arrayListNew.add(new Invitation(R.drawable.coffeehouse, 3,2,1));
        arrayListNew.add(new Invitation(R.drawable.coffeehouse, 4, 3, 2));

        InvitationAdapter newAdapter = new InvitationAdapter(
                this,
                R.layout.invitation_item,
                arrayListNew
        );
        list_invitation_new.setAdapter(newAdapter);

        list_invitation_new.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent invitation = new Intent(getApplicationContext() , InvitationActivity.class);
                startActivity(invitation);
            }
        });

    }

    public void invite(View v){
        Intent pickLocation = new Intent(this, PickLocation.class);
        startActivity(pickLocation);
    }

}
