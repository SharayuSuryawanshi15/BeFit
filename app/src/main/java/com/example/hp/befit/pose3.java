package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pose3 extends AppCompatActivity {
    ImageButton po3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose3);
        po3= (ImageButton)findViewById(R.id.p3);
        po3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pose3.this,pose4.class);
                startActivity(i);
            }
        });

    }
}
