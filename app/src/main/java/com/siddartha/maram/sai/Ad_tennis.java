package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_tennis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_tennis);

        Button skipTennisAd=(Button)findViewById(R.id.skip_tennis_ad);
        skipTennisAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingTennis=new Intent(Ad_tennis.this,Tennis.class);
                startActivity(openingTennis);
            }
        });
    }
}
