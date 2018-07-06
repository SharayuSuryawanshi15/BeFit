package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daily_1 extends AppCompatActivity {
    Button ba,ch,dh,go,ma,pa,sh,si,tr,va;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_1);
        ba= (Button)findViewById(R.id.bal);
        ch= (Button)findViewById(R.id.chak);
        dh= (Button)findViewById(R.id.dhanu);
        go= (Button)findViewById(R.id.gomu);
        ma= (Button)findViewById(R.id.mat);
        pa= (Button)findViewById(R.id.pas);
        sh= (Button)findViewById(R.id.shal);
        si= (Button)findViewById(R.id.sir);
        tr=(Button)findViewById(R.id.tri);
        va=(Button)findViewById(R.id.vaj);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib = new Intent(daily_1.this, balasana.class);
                startActivity(ib);
            }
        });
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ic=new Intent(daily_1.this,chakrasana.class);
                startActivity(ic);
            }
        });

        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent id = new Intent(daily_1.this,dhanurasana.class);
                startActivity(id);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig = new Intent(daily_1.this,gomukhasana.class);
                startActivity(ig);
            }
        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im = new Intent(daily_1.this,matsyasana.class);
                startActivity(im);
            }
        });
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(daily_1.this,paschimottanasana.class);
                startActivity(ip);
            }
        });
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ish= new Intent (daily_1.this,shalabhasana.class);
                startActivity(ish);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isi= new Intent(daily_1.this,sirsasana.class);
                startActivity(isi);
            }
        });
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(daily_1.this,trikonasana.class);
                startActivity(it);
            }
        });
        va.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iv=new Intent(daily_1.this,vajarasana.class);
                startActivity(iv);
            }
        });
    }
}
