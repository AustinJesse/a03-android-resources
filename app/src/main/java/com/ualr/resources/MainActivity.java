package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {
    TextView countryDescription;
    private Button learnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryDescription = (TextView) findViewById(R.id.country_description_text);
        countryDescription.setText(R.string.countryDescription);

        learnBtn = findViewById(R.id.lesson_learnt_button);

    }

    public void onLessonLearntClicked(View view) {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.root_layout), R.string.congrats_text, Snackbar.LENGTH_LONG);
        snackbar.show();





    }


}
