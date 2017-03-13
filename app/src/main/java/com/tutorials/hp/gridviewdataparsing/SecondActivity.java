package com.tutorials.hp.gridviewdataparsing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class SecondActivity extends AppCompatActivity {

    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gv= (GridView) findViewById(R.id.secondGV);

        receiveData();
    }

    /*
    RECEIVE DATA FROM FIRST ACTIVITY
     */
    private void receiveData()
    {
        Intent i=this.getIntent();
        SpacecraftsCollection spacecraftsCollection= (SpacecraftsCollection) i.getSerializableExtra("SPACECRAFTS");

        gv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,spacecraftsCollection.getSpacecrafts()));
    }
}
