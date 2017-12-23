package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cricket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
        Button register=(Button)findViewById(R.id.registerCricket);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSc1SY7D8NUQ28jR7dcV6y5xop0-J8SlcKgVnwaqKImW5iigEQ/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button schedule=(Button)findViewById(R.id.schedule_cricket);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1d9PKkoON7rtxp9W9YSZbmLoqTZRodbC91CUgqA9uILM/edit?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        Button ruleBookCricket =(Button)findViewById(R.id.rule_book_cricket);
        ruleBookCricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingVolleballDetails= new Intent(Cricket.this,Rules_cricket.class);
                startActivity(openingVolleballDetails);
            }
        });
        ImageView imageView=(ImageView)findViewById(R.id.call);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "9888716342";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }

}
