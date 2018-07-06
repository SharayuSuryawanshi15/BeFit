package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Real_Plan extends AppCompatActivity {

    Button ap,bex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real__plan);

        ap = (Button)findViewById(R.id.advplan);
        bex=(Button)findViewById(R.id.basicex);

        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iap= new Intent(Real_Plan.this,advanceplan.class);
                startActivity(iap);
            }
        });

        bex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibe = new Intent(Real_Plan.this,basicexinfo.class);
                startActivity(ibe);
            }
        });




    }
}
