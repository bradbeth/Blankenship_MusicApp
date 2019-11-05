package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MuddyWatersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robert_johnson);


        // Find the View that shows the Electric Mud albums
        TextView kingOfTheDeltaBluesSingers = (TextView) findViewById(R.id.kingOfTheDeltaBluesSingers);

        // Set a click listener on that View
        kingOfTheDeltaBluesSingers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Electric Mud albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link kingOfTheDeltaBluesSingersActivity}
                Intent kingOfTheDeltaBluesSingersIntent = new Intent(MainActivity.this, KingOfTheDeltaBluesSingersActivity.class);

                // Start the new activity
                startActivity(kingOfTheDeltaBluesSingersIntent);
            }
        });

        // Find the View that shows afterTheRain albumsA
        TextView afterTheRain = (TextView) findViewById(R.id.afterTheRain);

        // Set a click listener on that View
        afterTheRain.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when afterTheRain albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link afterTheRainActivity}
                Intent afterTheRainIntent = new Intent(MainActivity.this, AfterTheRainActivity.class);

                // Start the new activity
                startActivity(afterTheRainIntent);
            }
        });

        // Find the View that shows the The Complete Recordings albums
        TextView theCompleteRecorings = (TextView) findViewById(R.id.theCompleteRecordings);

        // Set a click listener on that View
        theCompleteRecordings.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the The Complete Recordings albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TheCompleteRecordingsActivity}
                Intent theCompleteRecordingsIntent = new Intent(MainActivity.this, TheCompleteRecordingsActivity.class);

                // Start the new activity
                startActivity(theCompleteRecordingsIntent);
            }
        });

    }
}