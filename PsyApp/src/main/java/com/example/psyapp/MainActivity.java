package com.example.psyapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;


public class MainActivity extends Activity {
    EditText inputVorname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputVorname = (EditText) findViewById(R.id.editText);
        Button weiterButton = (Button) findViewById(R.id.button);

        //Clicklistener
        weiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(getApplicationContext(), Uhrzeiten.class);

                //Daten in Intent schreiben
                nextScreen.putExtra("Vorname", inputVorname.getText().toString());

                Log.e("n", inputVorname.getText().toString());
                startActivity(nextScreen);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
