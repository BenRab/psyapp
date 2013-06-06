package com.example.psyapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;


public class Uhrzeiten extends Activity implements OnClickListener{
    TextView Vorname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uhrzeiten);

        Vorname = (TextView) findViewById(R.id.Vorname);
        Intent i = getIntent();

        String vname = i.getStringExtra("Vorname");
        Log.e("Uhrzeit", vname + ".");
        Vorname.setText(vname);

        Vorname.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        Vorname.setBackgroundColor(0x00000000);
        if (Vorname.getText()=="asd")
            Vorname.setText("123123");
        else
            Vorname.setText("asd");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
