package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);


        // Find the View that shows the Garth Brooks artist
        TextView garthBrooks = (TextView) findViewById(R.id.garthBrooks);

        // Set a click listener on that View
        garthBrooks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Garth Brooks artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link garthBrooksActivity}
                Intent garthBrooksIntent = new Intent(MainActivity.this, GarthBrooksActivity.class);

                // Start the new activity
                startActivity(garthBrooksIntent);
            }
        });

        // Find the View that shows the Brad Paisley artist
        TextView bradPaisley = (TextView) findViewById(R.id.bradPaisley);

        // Set a click listener on that View
        bradPaisley.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Brad Paisley artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link bradPaisleyActivity}
                Intent bradPaisleyIntent = new Intent(MainActivity.this, BradPaisleyActivity.class);

                // Start the new activity
                startActivity(bradPaisleyIntent);
            }
        });

        // Find the View that shows the Alan Jackson artist
        TextView alanJackson = (TextView) findViewById(R.id.garthBrooks);

        // Set a click listener on that View
        alanJackson.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Alan Jackson artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link alanJacksonActivity}
                Intent alanJacksonIntent = new Intent(MainActivity.this, AlanJacksonActivity.class);

                // Start the new activity
                startActivity(alanJacksonIntent);
            }
        });

        // Find the View that shows the Johnny Lee Hooker artist
        TextView kennyChesney = (TextView) findViewById(R.id.kennyChesney);

        // Set a click listener on that View
        kennyChesney.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Kenny Chesney artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link kennyChesneyActivity}
                Intent kennyChesneyIntent = new Intent(MainActivity.this, KennyChesneyActivity.class);

                // Start the new activity
                startActivity(kennyChesneyIntent);
            }
        });
    }