package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tennis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);
        Button register=(Button)findViewById(R.id.registerTennis);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSfVTAcEjQwvwT6mghR2BrLgdLQI8wZ1dAUJOayH5brc4tDJZw/viewform";
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
        Button movingToTennis =(Button)findViewById(R.id.rule_book_tennis);
        movingToTennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openingRulesofBadmainton= new Intent(Tennis.this,Rules_tennis.class);
                startActivity(openingRulesofBadmainton);
            }
        });
    }
}
