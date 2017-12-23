package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Athletic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletic);
        Button register=(Button)findViewById(R.id.registerAthletics);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSczoLx6wMitEqGvAxCS1LOVX8N3tHTG3t_TzCTEZhWtpR0cwg/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button schedule=(Button)findViewById(R.id.schedule_athletics);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/0BxvLD3F8qAMJZ09VeEp4YmhmaGUxanRIUW14TWZaMFhjcENJ/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView imageView=(ImageView)findViewById(R.id.call);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "9872399779";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });


        Button movingToAthleticRules =(Button)findViewById(R.id.rule_book_athletics);
        movingToAthleticRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRulesofBadmainton= new Intent(Athletic.this,Rules_athletics.class);
                startActivity(openingRulesofBadmainton);
            }
        });

    }
}
