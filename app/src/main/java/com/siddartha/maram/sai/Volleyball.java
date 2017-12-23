package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Volleyball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball);


        Button register=(Button)findViewById(R.id.registerVolleyball);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLScNU3H9MPucycP7xYfZFdafVZx_-Nj6dtdnlyKpQvgAmdFs8A/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ImageView imageView=(ImageView)findViewById(R.id.call);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "+34666777888";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        Button movingToVVrules =(Button)findViewById(R.id.rule_book_volleyball);
        movingToVVrules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRulesofTT= new Intent(Volleyball.this,Rules_Volleyball.class);
                startActivity(openingRulesofTT);
            }
        });

    }
}
