package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
        Button register=(Button)findViewById(R.id.registerFootball);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSd2le_KRz6zp3KkzFGkLq3wuZERp4JcOFD8Yje6dMdIdIZhUg/viewform";
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

        Button schedule=(Button)findViewById(R.id.schedule_football);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/11TOViJoKuBdnxKkuWktAM6cX0snSutkbiYvHsK3wYX8/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button movingToFootball =(Button)findViewById(R.id.rule_book_football);
        movingToFootball .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRulesofBadmainton= new Intent(Football.this,Rules_football.class);
                startActivity(openingRulesofBadmainton);
            }
        });
    }
}
