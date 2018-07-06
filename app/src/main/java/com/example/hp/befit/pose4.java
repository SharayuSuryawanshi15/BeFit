package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pose4 extends AppCompatActivity {

    ImageButton po4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose4);
        po4= (ImageButton)findViewById(R.id.p4);
        po4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(pose4.this,pose5.class);
                startActivity(i);
            }
        });


    }
}
