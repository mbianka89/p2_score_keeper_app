package com.example.android.courtcounter2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    int scoreHomeTeam = 0;
    int scoreGuestTeam = 0;
    int servesHomeTeam = 0;
    int servesGuestTeam = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // FIXME:
        //        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        // FIXME:
        //      if (id == R.id.action_settings) {
        //          return true;
        //      }
        return super.onOptionsItemSelected(item);
    }
    /**
     * Increase the score for Home Team by 1 point.
     */
    public void addOneForHomeTeam(View v) {
        scoreHomeTeam += 1;
        displayForHomeTeam(scoreHomeTeam);
    }
    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreHomeTeam);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the number of serves for Home Team by 1.
     */
    public void ServesHomeTeam(View v) {
        servesHomeTeam += 1;
        displayServesOfHomeTeam(servesHomeTeam);
    }
    /**
     * Displays the number of serves for Home Team.
     */
    public void displayServesOfHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberOfServesHome);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the number of serves for Guest Team.
     */
    public void displayServesOfGuestTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numberOfServesGuest);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the number of serves for Guest Team by 1.
     */
    public void ServesGuestTeam(View v) {
        servesGuestTeam += 1;
        displayServesOfGuestTeam(servesGuestTeam);
    }
    /**
     * Increase the score for Guest Team by 1 point.
     */
    public void addOneForGuestTeam(View v) {
        scoreGuestTeam += 1;
        displayForGuestTeam(scoreGuestTeam);
    }
    /**
     * Displays the given score for Guest Team.
     */
    public void displayForGuestTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreGuestTeam);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Resets the score.
     */
    public void resetScore(View v) {
        scoreHomeTeam = 0;
        scoreGuestTeam = 0;
        servesGuestTeam = 0;
        servesHomeTeam = 0;
        displayForHomeTeam(scoreHomeTeam);
        displayForGuestTeam(scoreGuestTeam);
        displayServesOfHomeTeam(servesHomeTeam);
        displayServesOfGuestTeam(servesGuestTeam);
    }
}