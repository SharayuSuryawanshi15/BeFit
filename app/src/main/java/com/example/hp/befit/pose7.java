package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pose7 extends AppCompatActivity {
    ImageButton po7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose7);
        po7=(ImageButton)findViewById(R.id.p7);
        po7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(pose7.this,pose8.class);
                startActivity(i);
            }
        });
    }
}
