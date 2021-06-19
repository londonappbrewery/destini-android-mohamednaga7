package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;

    private int mStoryState = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        updateState();



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(v -> {
            if (mStoryState == 1 || mStoryState ==2) {
                mStoryState = 3;
            } else if (mStoryState == 3) {
                mStoryState = 6;
            }
            updateState();
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(v -> {
            if (mStoryState == 1) {
                mStoryState = 2;
            } else if (mStoryState == 2) {
                mStoryState = 4;
            } else if (mStoryState == 3) {
                mStoryState = 5;
            }
            updateState();
        });

    }

    private void updateState() {
        if (mStoryState == 1) {
            mStoryTextView.setText(R.string.T1_Story);
            mButtonTop.setText(R.string.T1_Ans1);
            mButtonBottom.setText(R.string.T1_Ans2);
            return;
        } else if (mStoryState == 2) {
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
            return;
        } else if (mStoryState == 3) {
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
            return;
        } else if (mStoryState == 4) {
            mStoryTextView.setText(R.string.T4_End);
        } else if (mStoryState == 5) {
            mStoryTextView.setText(R.string.T5_End);
        } else if (mStoryState == 6) {
            mStoryTextView.setText(R.string.T6_End);
        }
        mButtonTop.setVisibility(View.INVISIBLE);
        mButtonBottom.setVisibility(View.INVISIBLE);
    }
}
