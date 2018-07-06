package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonthPlan extends AppCompatActivity {

    Button vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_plan);

        vp = (Button)findViewById(R.id.viewplan);

        vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MonthPlan.this,Real_Plan.class);
                startActivity(i);
            }
        });
    }
}
