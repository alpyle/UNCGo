package com.example.shayfahnators.uncgo;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {
GoogleMap mainMap;
   final BuildingHash buildingLocations=new BuildingHash();
   ListView listView;
    ArrayList loadedContacts;
    List<String> tasks;
    ArrayAdapter<String> adapter;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(new custom_list(this, buildingLocations.getKeys()));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String name=buildingLocations.getKeys().get(position);
                System.out.println("name:" +name);
                latLong destination= buildingLocations.getBuildingCoords(name);

                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + destination.getLat() + "," + destination.getLon() + "&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);



        ArrayList<String> yo = buildingLocations.getKeys();

        for(int i=0; i < yo.size(); i++){
            System.out.println(yo.get(i));
        }


       listView = (ListView) findViewById(R.id.list_view);
       ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(new custom_list(this, yo));
        return true;




    }
public void onClickSubmit(View v)
{
   latLong destination= buildingLocations.getBuildingCoords("McNutt Building");
    Uri gmmIntentUri = Uri.parse("google.navigation:q=" + destination.getLat() + "," + destination.getLon() + "&mode=w");
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
    mapIntent.setPackage("com.google.android.apps.maps");
    startActivity(mapIntent);
    //Intent intent=new Intent(this, MapsActivity.class);
    //startActivity(intent);
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
