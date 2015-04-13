package com.example.shayfahnators.uncgo;

import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends Activity {
GoogleMap mainMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);



        String[] currentLoc={
                "Current Location",
                "Aycock Auditorium",
                "Brown Building",
                "Bryan School of Business & Economics",
                "Carmichael Building",
                "Curry Building",
                "Dining Hall",
                "Eberhart Building",
                "Elliott University Center",
                "Ferguson Building",
                "Financial Aid Office",
                "Forney Building",
                "Foust Building",
                "Gatewood Studio Arts Center",
                "Gove Student Health Center",
                "Graham Building",
                "Jackson Library",
                "Mary Channing Coleman Building",
                "McIver Building",
                "McIver St. Parking Deck",
                "McNutt Building",
                "Moore Building",
                "Moore Humanities & Research Administration",
                "Mossman Building",
                "Music Building",
                "Oakland Ave. Parking Deck",
                "Petty Science Building",
                "School of Education",
                "Sink Building",
                "Stone Building",
                "Student Recreation Center",
                "Sullivan Science Building",
                "Taylor Theatre",
                "Visitor Center",
                "Walker Ave. Parking Deck",
                "Weatherspoon Art Museum"

        };
        String[] dest={
                "Aycock Auditorium",
                "Brown Building",
                "Bryan School of Business & Economics",
                "Carmichael Building",
                "Curry Building",
                "Dining Hall",
                "Eberhart Building",
                "Elliott University Center",
                "Ferguson Building",
                "Financial Aid Office",
                "Forney Building",
                "Foust Building",
                "Gatewood Studio Arts Center",
                "Gove Student Health Center",
                "Graham Building",
                "Jackson Library",
                "Mary Channing Coleman Building",
                "McIver Building",
                "McIver St. Parking Deck",
                "McNutt Building",
                "Moore Building",
                "Moore Humanities & Research Administration",
                "Mossman Building",
                "Music Building",
                "Oakland Ave. Parking Deck",
                "Petty Science Building",
                "School of Education",
                "Sink Building",
                "Stone Building",
                "Student Recreation Center",
                "Sullivan Science Building",
                "Taylor Theatre",
                "Visitor Center",
                "Walker Ave. Parking Deck",
                "Weatherspoon Art Museum"

        };
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        dest);
        Spinner spinner =
                (Spinner)  findViewById(R.id.destination);
        spinner.setAdapter(stringArrayAdapter);


        ArrayAdapter<String> stringArrayAdapter1=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        currentLoc);
        Spinner spinner1 =
                (Spinner)  findViewById(R.id.currentL);
        spinner1.setAdapter(stringArrayAdapter1);

        return true;




    }
public void onClickSubmit(View v)
{
    Intent intent=new Intent(this, MapsActivity.class);

   startActivity(intent);
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
