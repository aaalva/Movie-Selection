package com.example.android.movieselection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ChoiceSelected extends AppCompatActivity {

    // Initializes variables for later use in code. 
    TextView tmovie;
    TextView choose_again;

    // Initializes strings that will be used later in code. 
    String stone;
    String sttwo;
    String stthree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_selected);
        
        // This line of code allows the code to link with the ID found in associated XML file. 
        choose_again= findViewById(R.id.choose_again);

        // This allows the code to link with TextView ID in associated XML file.   
        tmovie = findViewById(R.id.movie_chosen);


        // These following lines of code pull from the string values stored in the MainActivity Java file.  
        stone = getIntent().getExtras().getString("Value One");

        sttwo = getIntent().getExtras().getString("Value Two");

        stthree = getIntent().getExtras().getString("Value Three");
    }


    // This function activates the actions that allow for the movie to be chosen at random. 
    public void movieChosen(View v) {
        
        // A random number generator (from 1 to 3) is established to replicate the random selection of a movie title. 
        Random s = new Random();
        int numb = s.nextInt(4);

        // These following conditional statements assign a numerical value to each movie title that was stored as a string. 
        // First movie title. 
        if (numb == 1) {
            tmovie.setText(stone);
        }
        
        // Second movie title.
        if (numb == 2) {
            tmovie.setText(sttwo);
        }

        // Third movie title. 
        if (numb == 3) {
            tmovie.setText(stthree);   
        }

    }

    // This function allows the application to return to the MainActivity page once the "Choose Again"
    // button is clicked. 
    public void chooseAgain (View v){
        Intent intent = new Intent(ChoiceSelected.this, MainActivity.class);
        startActivity(intent);
    }
}
