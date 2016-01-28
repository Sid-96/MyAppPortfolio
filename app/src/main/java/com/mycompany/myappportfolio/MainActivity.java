package com.mycompany.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = "This button will launch my";
        if(v.getId()==R.id.button1)
            Toast.makeText(this,msg+"Spotify Streamer app",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button2)
            Toast.makeText(this,msg+"Scores app",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button3)
            Toast.makeText(this,msg+"Library app",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button4)
            Toast.makeText(this,msg+"Build It Bigger app",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button5)
            Toast.makeText(this,msg+"XYZ reader app",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button6)
            Toast.makeText(this,msg+"Capstone app",Toast.LENGTH_SHORT).show();
    }
}
