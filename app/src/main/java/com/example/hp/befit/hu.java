package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hu extends AppCompatActivity {
    ImageButton ibhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hu);
        ibhu=(ImageButton)findViewById(R.id.hu);
        ibhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(hu.this,pose3.class);
                startActivity(i);
            }
        });
    }
}
