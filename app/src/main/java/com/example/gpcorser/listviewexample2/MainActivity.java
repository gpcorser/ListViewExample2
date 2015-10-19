package com.example.gpcorser.listviewexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //created a collection of strings
        String [] favoriteTVShows = {"Zippy", "Zappy","Wild West","Gunsmoke","Cannon Fodder"};
        String [] favoriteTVActors = {"Smith", "Jones","Aaron","Williams","Zippy"};

        MyAdapter theAdapter = new MyAdapter(this, favoriteTVShows, favoriteTVActors);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id) {
                        String tvShowPicked = " You selected " +
                                String.valueOf(AdapterView.getItemAtPosition(position));
                        // Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
                        TextView textView2 = (TextView) view.findViewById(R.id.textView2);
                        if(textView2.getVisibility()==View.VISIBLE)
                            textView2.setVisibility(View.GONE);
                        else
                            textView2.setVisibility(View.VISIBLE);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
