package com.example.android.museumquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creating a global variable to catch correct answers
     */


    /**
     * This method is called when the submit button is clicked.
     */
    public void submit(View view) {

        /**
         * Creating a local variable to catch correct answers (local because global wouldnt work correct
         */

        int correctAnswer = 0;

        /**
         * Check if first question is correct
         */

        EditText nameTown = (EditText) findViewById(R.id.name_town);
        if (nameTown.getText().toString().equals("Paris")) {
            correctAnswer = correctAnswer + 1;
        }

        /**
         * Check if second question is correct
         */


        RadioButton correctYear = (RadioButton) findViewById(R.id.correct_year);
        boolean correct_year = correctYear.isChecked();
        if (correct_year) {
            correctAnswer = correctAnswer + 1;
        }

        /**
         * Check if third question is correct
         */


        RadioButton correctName = (RadioButton) findViewById(R.id.correct_name);
        boolean correct_name = correctName.isChecked();
        if (correct_name) {
            correctAnswer = correctAnswer + 1;
        }

        /**
         * Check if forth question is correct
         */


        CheckBox correctMoma = (CheckBox) findViewById(R.id.correct_moma);
        boolean correct_moma = correctMoma.isChecked();
        if (correct_moma) {
            correctAnswer = correctAnswer + 1;
        }

        /**
         * Check if fifth question is correct
         */

        CheckBox correctGogh = (CheckBox) findViewById(R.id.correct_van_gogh);
        boolean correct_van_gogh = correctGogh.isChecked();
        if (correct_van_gogh) {
            correctAnswer = correctAnswer + 1;
        }

        /**
         * Making a toast message about results
         */


        if (correctAnswer == 5)

            Toast.makeText(this, "Congratulations you answered correct on all questions and scored " + correctAnswer + " points!", Toast.LENGTH_LONG).show();

        else

            Toast.makeText(this, "Something was incorrect, you scored " + correctAnswer + " point(s) out of 5!", Toast.LENGTH_LONG).show();

    }


}