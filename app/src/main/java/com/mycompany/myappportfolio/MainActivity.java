package com.mycompany.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
