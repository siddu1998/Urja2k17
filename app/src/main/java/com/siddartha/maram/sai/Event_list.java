package com.siddartha.maram.sai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Event_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        Button volunteer=(Button)findViewById(R.id.volunteer_connecting);
        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSf1TQAOKBgfV3cnE77z86c14XAEDqkwzQRGreUKBBsBj0iRxQ/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button volunteerForDeaf=(Button)findViewById(R.id.volunteer_deaf_connecting);
        volunteerForDeaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLSf1TQAOKBgfV3cnE77z86c14XAEDqkwzQRGreUKBBsBj0iRxQ/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button registerForMagic=(Button)findViewById(R.id.register_for_magic_show);
        registerForMagic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/a/thapar.edu/forms/d/e/1FAIpQLScjFY0XRCZqby7uWrnTES8U-5noNAZZrqa67wHgxjO4Gy7LQg/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
