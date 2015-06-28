package com.example.ventus.airplanechecklist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AirplaneList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airplane_list);

        AdapterView.OnItemClickListener myAirplaneClick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView debugging_text_view = (TextView) findViewById(R.id.debugging);
                TextView item_text_view  = (TextView) view;
//                debugging_text_view.setText(item_text_view.getText());
                if (item_text_view.getText().equals("LS3")) {
                    debugging_text_view.setText("yes, in LS3");
                    launch_ls3();
                }
                if (item_text_view.getText().equals("Cessna C150")) {
                    launch_c150();
                }
                if (item_text_view.getText().equals("Cessna C172")) {
                    launch_c172();
                }
            }

        };

        ListView airplane_list_view = (ListView) findViewById(R.id.airplane_list);
        airplane_list_view.setOnItemClickListener(myAirplaneClick);
    }

    void launch_ls3() {
        Intent intent_ls3 = new Intent(this, HomePageLS3.class);
        startActivity(intent_ls3);
    }

    void launch_c150() {
        Intent intent_c150 = new Intent(this, HomePageC150.class);
        startActivity(intent_c150);
    }

    void launch_c172() {
        Intent intent_c172 = new Intent(this, HomePageC172.class);
        startActivity(intent_c172);
    }

}
