package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class    bodyproblems extends AppCompatActivity {

    ImageButton kp,bp,sp,ap;






































































        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyproblems);
        kp = (ImageButton)findViewById(R.id.kneep);
        bp = (ImageButton)findViewById(R.id.backp);
        sp = (ImageButton)findViewById(R.id.shoulderp);
        ap = (ImageButton)findViewById(R.id.armp);

        kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikp = new Intent(bodyproblems.this,kneepain.class);
                startActivity(ikp);
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibp = new Intent(bodyproblems.this,backpain.class);
                startActivity(ibp);
            }
        });

        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isp = new Intent(bodyproblems.this,shoulderpain.class);
                startActivity(isp);
            }
        });

        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iap= new Intent(bodyproblems.this,armpain.class);
                startActivity(iap);
            }
        });



    }
}
