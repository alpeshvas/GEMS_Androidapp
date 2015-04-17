package com.example.winchester.onlineelection;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class gensec extends ListActivity {
    ListView listView ;
    String[] post3 = {"Alpesh", "Saikat", "prarabdha", "XYZ","pqy"};
    private ArrayAdapter tweetItemArra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gensec);
       tweetItemArra = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1, post3);
       // tweetListVie = (ListView) findViewById(R.id.gense);
        setListAdapter(tweetItemArra);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selection = l.getItemAtPosition(position).toString();
        if (selection.equals("Alpesh")) {
            Intent intent = new Intent(this, view1.class);
            startActivity(intent);
            Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
        }
        else if (selection.equals("Saikat")) {
            Intent intent = new Intent(this, view2.class);
            startActivity(intent);
            Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
        }

        else{
            Intent intent = new Intent(this, common.class);
            startActivity(intent);
            Toast.makeText(this, selection, Toast.LENGTH_LONG).show();

        }

    }
}
