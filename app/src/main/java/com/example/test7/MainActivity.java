package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //creating references
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating objects
        b1 = findViewById(R.id.b1);
        //setting listener for start button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating object of myAsyncClass passing the object of this class
                myAsyncClass mac = new myAsyncClass(MainActivity.this);
                //executing mac
                mac.execute();
            }
        });
    }
}