package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int ScoreForTeamB = 0;

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

    public void addSixForTeamA (View v) {
        scoreForTeamA += 6;
        displayForTeamA(scoreForTeamA);
    }

    public void addThreeForTeamA (View v) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoForTeamA (View v) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    public void addOneForTeamA (View v) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }


}
