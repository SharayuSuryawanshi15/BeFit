package com.example.hp.befit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class advanceplan extends AppCompatActivity {

    Button ae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanceplan);

        ae= (Button)findViewById(R.id.advex);
        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iae = new Intent(advanceplan.this,advanceexinfo.class);
                startActivity(iae);
            }
        });
    }
}
