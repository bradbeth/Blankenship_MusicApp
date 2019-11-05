package android.example.blankenship_musicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RNRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rnr);

        // Find the View that shows the Motley Crue artist
        TextView motleyCrue = (TextView) findViewById(R.id.motleyCrue);

        // Set a click listener on that View
        motleyCrue.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Motley Crue artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link motleyCrueActivity}
                Intent roberJohnsonIntent = new Intent(MainActivity.this, MotleyCrueActivity.class);

                // Start the new activity
                startActivity(motleyCrueIntent);
            }
        });

        // Find the View that shows the Bob Seger artist
        TextView bobSeger = (TextView) findViewById(R.id.bobSeger);

        // Set a click listener on that View
        bobSeger.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Bob Seger artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link motleyCrueActivity}
                Intent bobSegerIntent = new Intent(MainActivity.this, BobSegerActivity.class);

                // Start the new activity
                startActivity(bobSegerIntent);
            }
        });

        // Find the View that shows the Guns N Roses artist
        TextView gunsNRoses = (TextView) findViewById(R.id.motleyCrue);

        // Set a click listener on that View
        gunsNRoses.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Guns N Roses artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link gunsNRosesActivity}
                Intent gunsNRosesIntent = new Intent(MainActivity.this, GunsNRosesActivity.class);

                // Start the new activity
                startActivity(gunsNRosesIntent);
            }
        });

        // Find the View that shows the Metallica artist
        TextView metallica = (TextView) findViewById(R.id.metallica);

        // Set a click listener on that View
        metallica.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Metallica artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link metallicaActivity}
                Intent metallicaIntent = new Intent(MainActivity.this, MetallicaActivity.class);

                // Start the new activity
                startActivity(metallicaIntent);
            }
        });
    }
}
