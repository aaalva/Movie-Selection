package com.example.android.movieselection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     
    // Intializes variables. 
    TextView first_selection;
    TextView second_selection;
    TextView third_selection;
    String stone;
    String sttwo;
    String stthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // The following three lines of code allow the java code to pull from the IDs of each TextView in associated 
        // XML file. 
        first_selection = findViewById(R.id.first_selection);
        second_selection = findViewById(R.id.second_selection);
        third_selection = findViewById(R.id.third_selection);
    }

    // This function initates the actions performed once user interacts with the "Submit" button.  
    public void submitChoices (View v){
    
        // This allows the application to transition from activity to the other. 
        Intent intent = new Intent(MainActivity.this, ChoiceSelected.class);
        
        // The following lines of code store the string values typed by user. T
        // These will be recalled in the next activity. 
        stone = first_selection.getText().toString();
        intent.putExtra("Value One", stone);

        sttwo = second_selection.getText().toString();
        intent.putExtra("Value Two",sttwo);

        stthree = third_selection.getText().toString();
        intent.putExtra("Value Three", stthree);

        startActivity(intent);
    }
}
