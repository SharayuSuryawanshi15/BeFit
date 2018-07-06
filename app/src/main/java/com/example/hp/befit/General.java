package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class General extends AppCompatActivity {
    Button bns;
    Button bnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        bns=(Button)findViewById(R.id.sn);
        bnd=(Button)findViewById(R.id.dy);

        bns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(General.this,SuryaNamaskar.class);
                startActivity(i);
            }
        });

        bnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daily = new Intent(General.this,daily_1.class);
                startActivity(daily);
            }
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent i1= new Intent(General.this,Second.class);
        startActivity(i1);

    }

}
