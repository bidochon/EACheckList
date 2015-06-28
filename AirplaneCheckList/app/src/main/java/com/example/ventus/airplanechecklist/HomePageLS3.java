package com.example.ventus.airplanechecklist;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class HomePageLS3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_ls3);
    }

    public void clicked_button(View view) {
        view.setBackgroundColor(Color.parseColor("#FF0AEA0D"));
    }

    public void clicked_resetall(View view) {
        View button1 = (View) findViewById(R.id.button1);
        button1.setBackgroundColor(Color.parseColor("#ffff0f19"));
        View button2 = (View) findViewById(R.id.button2);
        button2.setBackgroundColor(Color.parseColor("#ffff0f19"));
        View button3 = (View) findViewById(R.id.button3);
        button3.setBackgroundColor(Color.parseColor("#ffff0f19"));
        View button4 = (View) findViewById(R.id.button4);
        button4.setBackgroundColor(Color.parseColor("#ffff0f19"));
        View button5 = (View) findViewById(R.id.button5);
        button5.setBackgroundColor(Color.parseColor("#ffff0f19"));

    }


}
