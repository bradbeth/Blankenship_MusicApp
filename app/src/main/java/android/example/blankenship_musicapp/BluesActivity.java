package android.example.blankenship_musicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues);


        // Find the View that shows the Robert Johnson category
        TextView robertJohnson = (TextView) findViewById(R.id.robertJohnson);

        // Set a click listener on that View
        robertJohnson.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Robert Johnson category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RobertJohnsonActivity}
                Intent roberJohnsonIntent = new Intent(MainActivity.this, RobertJohnsonActivity.class);

                // Start the new activity
                startActivity(robertJohnsonIntent);
            }
        });

        // Find the View that shows the Muddy Waters category
        TextView muddyWaters = (TextView) findViewById(R.id.muddyWaters);

        // Set a click listener on that View
        muddyWaters.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Muddy Waters category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RobertJohnsonActivity}
                Intent muddyWatersIntent = new Intent(MainActivity.this, MuddyWatersActivity.class);

                // Start the new activity
                startActivity(muddyWatersIntent);
            }
        });

        // Find the View that shows the BB King category
        TextView bbKing = (TextView) findViewById(R.id.robertJohnson);

        // Set a click listener on that View
        bbKing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the bb King category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BBKingActivity}
                Intent bbKingIntent = new Intent(MainActivity.this, BBKingActivity.class);

                // Start the new activity
                startActivity(bbKingIntent);
            }
        });

        // Find the View that shows the Johnny Lee Hooker category
        TextView johnnyLeeBooker = (TextView) findViewById(R.id.johnnyLeeHooker);

        // Set a click listener on that View
        johnnyLeeBooker.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Johnny Lee Booker category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link JohnnyLeeBookerActivity}
                Intent johnnyLeeBookerIntent = new Intent(MainActivity.this, JohnnyLeeBookerActivity.class);

                // Start the new activity
                startActivity(johnnyLeeBookerIntent);
            }
        });

}
