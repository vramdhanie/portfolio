package com.vincentramdhanie.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        //setSupportActionBar(toolbar);
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

    /**
     * Executes the Spotify Button Event
     * @param view
     */
    public void runSpotify(View view){
        Toast.makeText(this, "This button will launch my Spotify App!", Toast.LENGTH_LONG).show();
    }

    /**
     * Event handler for the Scores button
     * @param view
     */
    public void runScores(View view){
        Toast.makeText(this, "This button will launch my Football Scores App!", Toast.LENGTH_LONG).show();
    }

    /**
     * Event handler for the Build it Bigger button
     * @param view
     */
    public void runBigger(View view){
        Toast.makeText(this, "This button will launch my Build It Bigger App!", Toast.LENGTH_LONG).show();
    }

    /**
     * Event handler for the XYZ button
     * @param view
     */
    public void runXYZ(View view){
        Toast.makeText(this, "This button will launch my XYZ App!", Toast.LENGTH_LONG).show();
    }

    /**
     * Event handler for the Cpstone button
     * @param view
     */
    public void runCapstone(View view){
        Toast.makeText(this, "This button will launch my Capstone App!", Toast.LENGTH_LONG).show();
    }

    /**
     * Event handler for the Library button
     * @param view
     */
    public void runLibrary(View view){
        Toast.makeText(this, "This button will launch my Library App!", Toast.LENGTH_LONG).show();
    }
}
