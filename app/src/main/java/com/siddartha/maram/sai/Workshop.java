package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Workshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        Button registrationForSelfDefenseWorkshop=(Button)findViewById(R.id.register_for_self_defence);
        registrationForSelfDefenseWorkshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSe8r5xDmY3O37zT0vZjEH_07WdfSGcjZmqK6ZXmS88jZLRVaA/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button registrationForCardio=(Button)findViewById(R.id.register_for_cardio_excersice);
        registrationForCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSe8r5xDmY3O37zT0vZjEH_07WdfSGcjZmqK6ZXmS88jZLRVaA/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
