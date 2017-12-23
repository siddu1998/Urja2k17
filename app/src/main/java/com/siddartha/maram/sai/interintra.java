package com.siddartha.maram.sai;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class interintra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interintra);
        ImageView interclk=(ImageView)findViewById(R.id.inter);
        interclk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openinginter= new Intent(interintra.this,MainActivity.class);
                startActivity(openinginter);
            }
        });
        ImageView intraclk=(ImageView)findViewById(R.id.intra);
        intraclk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingintra= new Intent(interintra.this,Big_day.class);
                startActivity(openingintra);
            }
        });
        ImageView moveToRpSingh=(ImageView)findViewById(R.id.rp_singh_clickable);
        moveToRpSingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRpSingh=new Intent(interintra.this,Rp_singh.class);
                startActivity(openingRpSingh);
            }
        });
        ImageView moveToDeepaMalik=(ImageView)findViewById(R.id.deepa_malik_clickable);
        moveToDeepaMalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingDeepaMalik=new Intent(interintra.this,Deepa_malik.class);
                startActivity(openingDeepaMalik);
            }
        });
        TextView about_us_display=(TextView)findViewById(R.id.about_us_id);
        about_us_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move_to_about_us_page=new Intent(interintra.this,Main2Activity.class);
                startActivity(move_to_about_us_page);
            }
        });

        ImageView youtube=(ImageView)findViewById(R.id.youtube_click);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/channel/UCU-P5umU6ZbkK5X-iAaGegA";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }});
        ImageView fb=(ImageView)findViewById(R.id.fb_click);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/urjafest/?fref=ts";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }});
        ImageView insta=(ImageView)findViewById(R.id.instagram_click);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/urjaofficial2k17/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }});


    }


}
