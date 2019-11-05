package android.example.blankenship_musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Blues category
        TextView blues = (TextView) findViewById(R.id.blues);

        // Set a click listener on that View
        blues.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the blues category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BluesActivity}
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);

                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the country category
        TextView country = (TextView) findViewById(R.id.country);

        // Set a click listener on that View
        country.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the country category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the rnr category
        TextView rnr = (TextView) findViewById(R.id.rnr);

        // Set a click listener on that View
        rnr.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the rnr category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RNRActivity}
                Intent rnrIntent = new Intent(MainActivity.this, RNRActivity.class);

                // Start the new activity
                startActivity(rnrIntent);
            }
        });

    }
}
