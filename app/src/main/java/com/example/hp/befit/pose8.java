package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pose8 extends AppCompatActivity {
    ImageButton po8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose8);
        po8=(ImageButton)findViewById(R.id.p8);
        po8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(pose8.this,pose9.class);
                startActivity(i);
            }
        });
    }
}
