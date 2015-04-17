package com.example.winchester.onlineelection;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class profileview extends ListActivity {
    ListView listView;
    String[] post1 = {"General secretary", "Cultural secretary", "Sports Secretary", "UG SENATOR", "Girl SENATOR"};
    private ArrayAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileview);


        tweetItemArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, post1);
        setListAdapter(tweetItemArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selection = l.getItemAtPosition(position).toString();
        if (selection.equals("General secretary")) {
            Intent intent = new Intent(this, gensec.class);
            startActivity(intent);
            // String selection = l.getItemAtPosition(position).toString();
            //Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
        }
        if (selection.equals("Cultural secretary")) {
            Intent intent = new Intent(this, cultsec.class);
            startActivity(intent);
        }

        if (selection.equals("Girl SENATOR")) {
            Intent intent = new Intent(this, girlsenate.class);
            startActivity(intent);
        }
        if(selection.equals("UG SENATOR")){
            Intent intent = new Intent(this, cultsec.class);
            startActivity(intent);

        }
        if(selection.equals("Sports Secretary")){
            Intent intent = new Intent(this, gensec.class);
            startActivity(intent);
            //
        }
    }
}



