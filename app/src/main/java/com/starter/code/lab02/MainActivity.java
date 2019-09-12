package com.starter.code.lab02;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //   res/layout/activity_main.xml
        username = findViewById(R.id.username);
        phone = findViewById(R.id.phone);
    }

    public void doSomething(View view){
        String user = username.getText().toString();
        String number = phone.getText().toString();

        Toast.makeText(MainActivity.this, user + " : " + number, Toast.LENGTH_LONG).show();


        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        // add data to intent and pass it to next screen
        intent.putExtra("data", user + " : " + number);

        startActivity(intent);

    }

}
