package com.f4.letparty.activity;

import com.f4.letparty.FaceTrackerActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.f4.letparty.R;

public class InvitationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);
    }

    public void response(View v){
        Intent camera = new Intent(this, FaceTrackerActivity.class);
        startActivity(camera);
    }
}
