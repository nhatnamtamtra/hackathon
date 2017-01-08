package com.f4.letparty.activity;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.f4.letparty.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    EditText user_tv;
    EditText pass_tv;
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        user_tv = (EditText) findViewById(R.id.login_username);
        pass_tv = (EditText) findViewById(R.id.login_password);

    }

    public void attempLogin(View v){
        // TODO: Login function
        Toast.makeText(this, user_tv.getText(), Toast.LENGTH_SHORT).show();
        if (user_tv.getText().equals("smile") && pass_tv.getText().equals("smile")){
            finish();
        }
        else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }



}

