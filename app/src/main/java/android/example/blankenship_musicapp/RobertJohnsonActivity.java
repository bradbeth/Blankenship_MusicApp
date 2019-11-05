package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RobertJohnsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robert_johnson);


        // Find the View that shows the King of The Delta Blues Singers albums
        TextView kingOfTheDeltaBluesSingers = (TextView) findViewById(R.id.kingOfTheDeltaBluesSingers);

        // Set a click listener on that View
        kingOfTheDeltaBluesSingers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the King of The Delta Blues Singers albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link kingOfTheDeltaBluesSingersActivity}
                Intent kingOfTheDeltaBluesSingersIntent = new Intent(MainActivity.this, KingOfTheDeltaBluesSingersActivity.class);

                // Start the new activity
                startActivity(kingOfTheDeltaBluesSingersIntent);
            }
        });

        // Find the View that shows kingOfTheDeltaBluesSingersII albumsA
        TextView kingOfTheDeltaBluesSingersII = (TextView) findViewById(R.id.kingOfTheDeltaBluesSingersII);

        // Set a click listener on that View
        kingOfTheDeltaBluesSingersII.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when kingOfTheDeltaBluesSingersII albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link kingOfTheDeltaBluesSingersIIActivity}
                Intent kingOfTheDeltaBluesSingersIIIntent = new Intent(MainActivity.this, KingOfTheDeltaBluesSingersIIActivity.class);

                // Start the new activity
                startActivity(kingOfTheDeltaBluesSingersIIIntent);
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