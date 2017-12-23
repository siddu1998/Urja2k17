package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Badmainton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badmainton);
        Button openingBadmaintonRegistration=(Button)findViewById(R.id.registerBadmainton);
        openingBadmaintonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSefDt1f3RGAELmd_ejBwnLweRXlU2znr_z_7ItFh9-Wb9G_lQ/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button schedule=(Button)findViewById(R.id.schedule_badmainton);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1S8mimlQG86xbaMMZS5fhe2r7ureWyW6-EUdggcJZ3qw/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ImageView imageView=(ImageView)findViewById(R.id.call);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "8196938524";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        Button movingTobadmintonRules =(Button)findViewById(R.id.rule_book_badmainton);
        movingTobadmintonRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRulesofBadmainton= new Intent(Badmainton.this,Rules_badmainton.class);
                startActivity(openingRulesofBadmainton);
            }
        });


    }

}
