package com.example.priya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreA=0;
    int ScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeA(View v){
        ScoreA=ScoreA+3;
        displayScoreA(ScoreA);
    }
    public void addTwoA(View v){
        ScoreA=ScoreA+2;
        displayScoreA(ScoreA);
    }
    public void addOneA(View v){
        ScoreA=ScoreA+1;
        displayScoreA(ScoreA);
    }

    public void displayScoreA(int score){
        TextView ScoreView=(TextView)findViewById(R.id.teamA_Score);
        ScoreView.setText(String.valueOf(score));
    }

    public void addThreeB(View v){
        ScoreB=ScoreB+3;
        displayScoreB(ScoreB);
    }
    public void addTwoB(View v){
        ScoreB=ScoreB+2;
        displayScoreB(ScoreB);
    }
    public void addOneB(View v){
        ScoreB=ScoreB+1;
        displayScoreB(ScoreB);
    }

    public void displayScoreB(int score){
        TextView ScoreView=(TextView)findViewById(R.id.teamB_Score);
        ScoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        ScoreA=0;
        ScoreB=0;
        displayScoreA(ScoreA);
        displayScoreB(ScoreB);
    }
}
