package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SuryaNamaskar extends AppCompatActivity {
    ImageButton ib1;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surya_namaskar);
        ib1=(ImageButton)findViewById(R.id.s1);
        tv1=(TextView)findViewById(R.id.text1);
        tv2=(TextView)findViewById(R.id.next1);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SuryaNamaskar.this,hu.class);
                startActivity(i);
            }
        });
    }
}
