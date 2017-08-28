package com.tutorials.hp.gridviewdataparsing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
/*
- Our SecondActivity class.
- Derives from AppCompatActivity, which is a Base class for activities that use the support library action bar features.
- Inflates ActivitySecond.xml layout using setContentView() method.
- Views shown include a GridView.
- Methods: onCreate(),receiveData().
- The purpose of this activity is to receive data from first activity and bind it to a gridview.
- The data sent from MainActivity was serialized, so we need to deserialize it.
- An intent object can do that us for easily, just by calling getSerializableExtra() method.
 */
public class SecondActivity extends AppCompatActivity {
    GridView gv;
    /*
    WHEN SECONDACTIVITY IS CREATED
     */
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
