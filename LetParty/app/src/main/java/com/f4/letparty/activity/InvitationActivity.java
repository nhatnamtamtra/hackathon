package com.f4.letparty.activity;

import com.f4.letparty.FaceTrackerActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.f4.letparty.R;

public class InvitationActivity extends AppCompatActivity {
    Double happiness_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);
    }

    public void response(View v){
        Intent camera = new Intent(this, FaceTrackerActivity.class);
        startActivityForResult(camera,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            //Bundle result = data.getExtras();

            happiness_val = data.getDoubleExtra("happiness",0.0);
            if (happiness_val > 0.5){
                Toast.makeText(this, "Accepted", Toast.LENGTH_SHORT).show();
            }
            else Toast.makeText(this, "Decline", Toast.LENGTH_SHORT).show();

        }
    }
}
