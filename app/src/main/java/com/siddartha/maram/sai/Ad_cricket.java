package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_cricket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_cricket);

        Button skipCricketaAd =(Button)findViewById(R.id.skip_cricket_ad);
        skipCricketaAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingCricketDetails= new Intent(Ad_cricket.this,Cricket.class);
                startActivity(openingCricketDetails);
            }
        });

    }
}
