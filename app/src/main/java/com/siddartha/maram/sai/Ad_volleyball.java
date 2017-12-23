package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_volleyball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_volleyball);

        Button skipVolleybalAd =(Button)findViewById(R.id.skip_volleyball_ad);
        skipVolleybalAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingVolleballDetails= new Intent(Ad_volleyball.this,Volleyball.class);
                startActivity(openingVolleballDetails);
            }
        });

    }
}
