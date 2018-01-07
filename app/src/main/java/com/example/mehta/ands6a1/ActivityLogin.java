package com.example.mehta.ands6a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /* Simple dummy button click function which simulates if user is valid or invalid */
    public void btnLoginClick(View view) {
        EditText txtEmail =
                (EditText) findViewById(R.id.txtEmail);

        EditText txtPassword =
                (EditText) findViewById(R.id.txtPassword);

        String strEmail = txtEmail.getText().toString();
        String strPassword = txtPassword.getText().toString();

        TextView lblLoginStatus =
                (TextView) findViewById(R.id.lblLoginStatus);

        if(strEmail.equals("sudesh@gmail.com") && strPassword.equals("abcd123")) {
            lblLoginStatus.setText("Login Success");
        }
        else{
            lblLoginStatus.setText("Login Fail. Email or Password is wrong");
        }
    }
}
