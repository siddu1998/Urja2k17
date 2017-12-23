package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView moveToCricketAd=(ImageView)findViewById(R.id.sachin);
                moveToCricketAd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent openingCricketAd= new Intent(MainActivity.this,Ad_cricket.class);
                        startActivity(openingCricketAd);
                    }
                });
ImageView moveToFootballAd=(ImageView)findViewById(R.id.messi);
        moveToFootballAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingFootballAdd=new Intent(MainActivity.this,Ad_football.class);
                startActivity(openingFootballAdd);
            }
        });

    ImageView moveToAthleticAd=(ImageView)findViewById(R.id.bolt);
        moveToAthleticAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingAthleticAd=new Intent(MainActivity.this,Ad_athletic.class);
                startActivity(openingAthleticAd);
            }
        });


    ImageView moveToBadmaintonAd=(ImageView)findViewById(R.id.saina);
        moveToBadmaintonAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingBadmaintonAd=new Intent(MainActivity.this,Ad_badmainton.class);
                startActivity(openingBadmaintonAd);
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
        TextView about_us_display=(TextView)findViewById(R.id.about_us_id);
        about_us_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move_to_about_us_page=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(move_to_about_us_page);
            }
        });

        ImageView moveToBasketball=(ImageView)findViewById(R.id.jordan);
        moveToBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingBasketballAdd=new Intent(MainActivity.this,Ad_Basketball.class);
                startActivity(openingBasketballAdd);
            }
        });

        ImageView moveToTableTennis=(ImageView)findViewById(R.id.tableTennis);
        moveToTableTennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingTableTennisAd=new Intent(MainActivity.this,Ad_tableTennis.class);
                startActivity(openingTableTennisAd);
            }
        });



        ImageView moveToLanGamingAd=(ImageView)findViewById(R.id.lan_gaming);
        moveToLanGamingAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingLanGamingAd=new Intent(MainActivity.this,Ad_lan_gaming.class);
                startActivity(openingLanGamingAd);
            }
        });

        ImageView moveToEventPage=(ImageView)findViewById(R.id.events_page_id);
        moveToEventPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingEventsPage=new Intent(MainActivity.this,Event_list.class);
                startActivity(openingEventsPage);
            }
        });



        ImageView moveToWorkshop=(ImageView)findViewById(R.id.workshop_page_id);
        moveToWorkshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingWorkShop=new Intent(MainActivity.this,Workshop.class);
                startActivity(openingWorkShop);
            }
        });



    }
}
