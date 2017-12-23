package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Big_day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_day);
        //cricket,chess,tennis,badmainton,volleyball,tabletennis,footbal,athletics,basketball
        ImageView register=(ImageView) findViewById(R.id.cricket_icon_for_big_day);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1pVi4hAwV5MezClC6DKufV7Z6UK6dunh6DpMvheOwTfg/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport2=(ImageView) findViewById(R.id.football_icon_for_big_day);
        register_sport2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/17-9chCCON63jREh48O_WzTWtRHq-9U38n-u9cVnZnNI/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ImageView register_sport3=(ImageView) findViewById(R.id.athletics_big_day_icon);
        register_sport3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1L36XdcnvYBcQSRTRd3_WxY97xcqrVvafme5oaleSG1k/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport4=(ImageView) findViewById(R.id.tennis_big_icon);
        register_sport4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1xmeBB45J3FRhqm10cfWriBHaJ8rpUjkz0hP70LlnPAI/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport5=(ImageView) findViewById(R.id.badmainton_big_day_icon);
        register_sport5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1ttb-fo9VS8t8YpkKbcZ1r3n08lyVmSvpS60ZW82cNt8/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport6=(ImageView) findViewById(R.id.basket_ball_big_day_icon);
        register_sport6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1FUs7m3aQa_Iuy6Ko5al1mXluC-oQqBwJDwsqL8crXkE/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport7=(ImageView) findViewById(R.id.tableTennis_big_day_icon);
        register_sport7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1KYw9-diLfQJpPjUaUh7yqHUVW9Xw_Q3Es5QCnw3qf64/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport8=(ImageView) findViewById(R.id.volleyball_big_day_icon);
        register_sport8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1KYw9-diLfQJpPjUaUh7yqHUVW9Xw_Q3Es5QCnw3qf64/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView register_sport9=(ImageView) findViewById(R.id.chess_big_day_icon);
        register_sport9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/12YrEorOek_3oejG6VG-0x5eXb6ve3kMOYNNQJ1FotFY/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView big_day_rules=(TextView)findViewById(R.id.rule_book_big_day);
        big_day_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move_to_big_rules=new Intent(Big_day.this,Rule_big.class);
                startActivity(move_to_big_rules);
            }
        });


    }
}
