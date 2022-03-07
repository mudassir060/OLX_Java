package com.example.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void SetVal(View view){
    TextView setf_name = findViewById(R.id.Textf_name);
    TextView set_password = findViewById(R.id.Textage);
    EditText editTextF_Name = findViewById(R.id.editTextemail);
    EditText editText_password = findViewById(R.id.editTextage);
        setf_name.setText("Your Father Name is: " +editTextF_Name.getText().toString());
        set_password.setText("Your Password is: " +editText_password.getText().toString());
    }
    public void OpenSignup(View view){
        Intent  intent =new Intent(this,Signup_activity.class);
        startActivity(intent);
    }
    public void SignIn(View view){
//        EditText editTextF_Name = findViewById(R.id.editTextemail);
//        EditText editText_password = findViewById(R.id.editTextage);
//        if (editTextF_Name.getText().toString() == "xyz@gmail.com"||editText_password.getText().toString() == "qwerty"){
//            Intent  intent =new Intent(this,Signup_activity.class);
//            startActivity(intent);
//        }else {
            Intent  intent =new Intent(this,BottomNavigationActivity.class);
            startActivity(intent);
//        }
    }
}
