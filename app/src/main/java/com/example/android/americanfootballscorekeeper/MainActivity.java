package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases score for Team A by 6
     */
    public void addSixForTeamA (View v) {
        scoreForTeamA += 6;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases score for Team A by 3
     */
    public void addThreeForTeamA (View v) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases score for Team A by 2
     */
    public void addTwoForTeamA (View v) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases score for Team A by 1
     */
    public void addOneForTeamA (View v) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases score for Team B by 6
     */
    public void addSixForTeamB (View v) {
        scoreForTeamB += 6;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increases score for Team B by 3
     */
    public void addThreeForTeamB (View v) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increases score for Team B by 2
     */
    public void addTwoForTeamB (View v) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increases score for Team B by 1
     */
    public void addOneForTeamB (View v) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Sets scores to zero for Team A and B
     */
    public void setToZero (View v) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

}
