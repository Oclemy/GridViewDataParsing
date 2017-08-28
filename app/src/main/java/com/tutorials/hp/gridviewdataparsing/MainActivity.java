package com.tutorials.hp.gridviewdataparsing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
/*
- Our MainActivity class.
- Derives from AppCompatActivity which is a Base class for activities that use the support library action bar features.
- Methods: onCreate(),populateData(),getData(),sendData()
- Inflated From content_main.xml using the setContentView() method.
- The views we use are Gridview and FloatingActionButton.
- Reference Gridview and FloatingActionButton from our layout specification using findViewById().
- First we populate our GridView with data.
- When FloatingActionButton is clicked, we send our serialized collection to secondactivity via intent object.
 */
public class MainActivity extends AppCompatActivity {
    GridView gv;
    ArrayList spacecrafts=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gv= (GridView) findViewById(R.id.firstGV);
        populateData();
        gv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spacecrafts));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
               sendData();
            }
        });
    }

    private void populateData()
    {
        spacecrafts.add("Casini");
        spacecrafts.add("Enterprise");
        spacecrafts.add("Spitzer");
        spacecrafts.add("Huygens");
        spacecrafts.add("WMAP");
        spacecrafts.add("Juno");
        spacecrafts.add("Kepler");
        spacecrafts.add("Apollo 15");
        spacecrafts.add("Challenger");
        spacecrafts.add("Discovery");
    }
    /*
    FILL DATA
     */
    private SpacecraftsCollection getData()
    {



        SpacecraftsCollection spacecraftsCollection=new SpacecraftsCollection();
        spacecraftsCollection.setSpacecrafts(spacecrafts);

        return spacecraftsCollection;
    }
    /*
    SEND DATA TO SECOND ACTIVITY
     */
    private void sendData()
    {
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("SPACECRAFTS",this.getData());
        startActivity(i);
    }

}
