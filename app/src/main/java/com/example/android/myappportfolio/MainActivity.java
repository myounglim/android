package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void makeToast(View view){
        int buttonId = view.getId();
        Toast stayTuned = null;
        switch(buttonId) {
            case R.id.project1_spotify:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.spotify_app) + " app!", Toast.LENGTH_SHORT);
                break;
            case R.id.project2_scores:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.scores_app) + "!", Toast.LENGTH_SHORT);
                break;
            case R.id.project3_library:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.library_app) + "!" , Toast.LENGTH_SHORT);
                break;
            case R.id.project4_build:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.buildbigger_app) + " app!" , Toast.LENGTH_SHORT);
                break;
            case R.id.project5_xyz:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.xyz_app) + " app!" , Toast.LENGTH_SHORT);
                break;
            case R.id.project6_capstone:
                stayTuned = Toast.makeText(this, getString(R.string.stay_tuned) + " " + getString(R.string.capstone_app) + "!" , Toast.LENGTH_SHORT);
                break;
        }
        if(stayTuned != null)
            stayTuned.show();

    }
}
