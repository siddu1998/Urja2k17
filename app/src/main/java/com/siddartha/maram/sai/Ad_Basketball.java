package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_Basketball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__basketball);

        Button skipBasketballAd =(Button)findViewById(R.id.skip_basketball_ad);
        skipBasketballAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingBasketballDetails= new Intent(Ad_Basketball.this,Basketball.class);
                startActivity(openingBasketballDetails);
            }
        });
    }
}
