package com.siddartha.maram.sai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ad_badmainton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_badmainton);
        Button openingBadmainton=(Button)findViewById(R.id.skip_badmainton_ad);
        openingBadmainton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opeingBadmaintonPage=new Intent(Ad_badmainton.this,Badmainton.class);
                startActivity(opeingBadmaintonPage);
            }
        });
    }
}
