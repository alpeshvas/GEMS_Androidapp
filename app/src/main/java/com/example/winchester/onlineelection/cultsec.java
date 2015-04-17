package com.example.winchester.onlineelection;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class cultsec extends ListActivity {
    String[] post3 = {"Dipo", "Gaurav", "Soni", "XYZ","pqy"};
    private ArrayAdapter cultsecy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultsec);
        cultsecy = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1, post3);
        // tweetListVie = (ListView) findViewById(R.id.gense);
        setListAdapter(cultsecy);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selection = l.getItemAtPosition(position).toString();

            Intent intent = new Intent(this, common.class);
            startActivity(intent);
            Toast.makeText(this, selection, Toast.LENGTH_LONG).show();


}}
