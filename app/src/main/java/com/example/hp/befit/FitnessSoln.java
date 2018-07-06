package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FitnessSoln extends AppCompatActivity {
    Button bp,sr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_soln);
        bp=(Button)findViewById(R.id.bodyp);
        sr=(Button)findViewById(R.id.stressr);
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibp=new Intent(FitnessSoln.this,bodyproblems.class);
                startActivity(ibp);
            }
        });
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isr=new Intent(FitnessSoln.this,stressrelief.class);
                startActivity(isr);
            }
        });
    }
}
