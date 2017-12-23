package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_lan_gaming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_lan_gaming);

        Button skipLanGamingAd =(Button)findViewById(R.id.skip_lanGaming_ad);
        skipLanGamingAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingLanGamingDetails= new Intent(Ad_lan_gaming.this,Lan_gaming.class);
                startActivity(openingLanGamingDetails);
            }
        });


    }
}
