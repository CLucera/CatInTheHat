package com.crea3d.catinthehat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button cat, thing1, thing2, thingamajigger, sally, nick, drSeuss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (Button) findViewById(R.id.button_cat);
        thing1 = (Button) findViewById(R.id.button_thing1);
        thing2 = (Button) findViewById(R.id.button_thing2);
        thingamajigger = (Button) findViewById(R.id.button_thingamajigger);
        sally = (Button) findViewById(R.id.button_sally);
        nick = (Button) findViewById(R.id.button_nick);
        drSeuss = (Button) findViewById(R.id.button_dr_seuss);

        cat.setOnClickListener(this);
        thing1.setOnClickListener(this);
        thing2.setOnClickListener(this);
        thingamajigger.setOnClickListener(this);
        sally.setOnClickListener(this);
        nick.setOnClickListener(this);
        drSeuss.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String appClicked = "";

        switch (v.getId()){
            case R.id.button_cat:
                appClicked = getString(R.string.button_cat);
                break;
            case R.id.button_thing1:
                appClicked = getString(R.string.button_thing1);
                break;
            case R.id.button_thing2:
                appClicked = getString(R.string.button_thing2);
                break;
            case R.id.button_thingamajigger:
                appClicked = getString(R.string.button_thingamajigger);
                break;
            case R.id.button_sally:
                appClicked = getString(R.string.button_sally);
                break;
            case R.id.button_nick:
                appClicked = getString(R.string.button_nick);
                break;
            case R.id.button_dr_seuss:
                appClicked = getString(R.string.button_dr_seuss);
                break;
        }

        if(!appClicked.isEmpty()){
            Toast.makeText(this, getString(R.string.toast, appClicked), Toast.LENGTH_SHORT).show();
        }
    }
}
