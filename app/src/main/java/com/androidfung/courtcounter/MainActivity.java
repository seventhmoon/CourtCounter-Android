package com.androidfung.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    private TextView textViewScoreA, textViewScoreB;
    private TextView textViewPlusOneA, textViewPlusTwoA, textViewPlusThreeA;
    private TextView textViewPlusOneB, textViewPlusTwoB, textViewPlusThreeB;
    private TextView textViewReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewScoreA = (TextView) findViewById(R.id.textViewScoreA);
        textViewScoreB = (TextView) findViewById(R.id.textViewScoreB);
        textViewPlusOneA = (TextView) findViewById(R.id.textViewPlusOneA);
        textViewPlusOneB = (TextView) findViewById(R.id.textViewPlusOneB);
        textViewPlusTwoA = (TextView) findViewById(R.id.textViewPlusTwoA);
        textViewPlusTwoB = (TextView) findViewById(R.id.textViewPlusTwoB);
        textViewPlusThreeA = (TextView) findViewById(R.id.textViewPlusThreeA);
        textViewPlusThreeB = (TextView) findViewById(R.id.textViewPlusThreeB);
        textViewReset = (TextView) findViewById(R.id.textViewReset);

        textViewReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
                updateScore();
            }
        });

        textViewPlusOneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                updateScore();
            }
        });

        textViewPlusOneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB +=1;
                updateScore();
            }
        });

        textViewPlusTwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                updateScore();
            }
        });

        textViewPlusTwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                updateScore();
            }
        });

        textViewPlusThreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA+=3;
                updateScore();
            }
        });

        textViewPlusThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB+= 3;
                updateScore();
            }
        });

    }


    //Reset the two variable containing the score
    private void resetScore(){
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    //update the score to the display
    private void updateScore(){
        textViewScoreA.setText(String.valueOf(scoreTeamA));
        textViewScoreB.setText(String.valueOf(scoreTeamB));
    }
}
