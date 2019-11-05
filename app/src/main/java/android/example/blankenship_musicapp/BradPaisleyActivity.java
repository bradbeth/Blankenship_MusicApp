package android.example.blankenship_musicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BradPaisleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brad_paisley);


        // Find the View that shows the Mud On The Tires albums
        TextView mudOnTheTires = (TextView) findViewById(R.id.mudOnTheTires);

        // Set a click listener on that View
        mudOnTheTires.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the mud On The Tires albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link mudOnTheTiresActivity}
                Intent mudOnTheTiresIntent = new Intent(MainActivity.this, MudOnTheTiresActivity.class);

                // Start the new activity
                startActivity(mudOnTheTiresIntent);
            }
        });

        // Find the View that shows the 5th Gear albums
        TextView VthGear = (TextView) findViewById(R.id.VthGear);

        // Set a click listener on that View
        VthGear.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the 5th Gear albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link VthGearActivity}
                Intent VthGearIntent = new Intent(MainActivity.this, VthGearActivity.class);

                // Start the new activity
                startActivity(VthGearIntent);
            }
        });

        // Find the View that shows the Who Needs Pictures albums
        TextView whoNeedsPictures = (TextView) findViewById(R.id.whoNeedsPictures);

        // Set a click listener on that View
        whoNeedsPictures.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Who Needs Pictures albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link whoNeedsPicturesActivity}
                Intent whoNeedsPicturesIntent = new Intent(MainActivity.this, WhoNeedsPicturesActivity.class);

                // Start the new activity
                startActivity(whoNeedsPicturesIntent);
            }
        });

    }
}