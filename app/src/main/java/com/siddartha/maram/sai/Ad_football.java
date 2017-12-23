package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_football);

        Button skipFootballad=(Button)findViewById(R.id.skip_football_id);
        skipFootballad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingFootballDetails=new Intent(Ad_football.this,Football.class);
                startActivity(openingFootballDetails);
            }
        });

    }
}
