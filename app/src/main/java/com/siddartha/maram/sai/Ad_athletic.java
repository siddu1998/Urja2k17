package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_athletic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_athletic);
        Button skipAthleticAd =(Button)findViewById(R.id.skip_athletic_ad);
        skipAthleticAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingAthleticDetails= new Intent(Ad_athletic.this,Athletic.class);
                startActivity(openingAthleticDetails);
            }
        });



    }
}
