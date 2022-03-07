package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Signup_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public  void SetVal(View view){
        TextView setname = findViewById(R.id.Textname);
        TextView setf_name = findViewById(R.id.Textf_name);
        TextView set_password = findViewById(R.id.Textage);
        EditText editTextName = findViewById(R.id.editTextname);
        EditText editTextF_Name = findViewById(R.id.editTextemail);
        EditText editText_password = findViewById(R.id.editTextage);
        setname.setText("Your Name is: " +editTextName.getText().toString());
        setf_name.setText("Your email is: " +editTextF_Name.getText().toString());
        set_password.setText("Your Password is: " +editText_password.getText().toString());
    }
    public void OpenSignup(View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}