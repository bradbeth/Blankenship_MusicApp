package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class GarthBrooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garth_brooks);


        // Find the View that shows the NoFences albums
        TextView noFences = (TextView) findViewById(R.id.noFences);

        // Set a click listener on that View
        noFences.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the NoFences albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link noFencesActivity}
                Intent noFencesIntent = new Intent(MainActivity.this, NoFencesActivity.class);

                // Start the new activity
                startActivity(noFencesIntent);
            }
        });

        // Find the View that shows the Ropin The Wind albums
        TextView ropinTheWind = (TextView) findViewById(R.id.ropinTheWind);

        // Set a click listener on that View
        ropinTheWind.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Ropin The Wind albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link noFencesActivity}
                Intent ropinTheWindIntent = new Intent(MainActivity.this, RopinTheWindActivity.class);

                // Start the new activity
                startActivity(ropinTheWindIntent);
            }
        });

        // Find the View that shows the The Chase albums
        TextView theChase = (TextView) findViewById(R.id.theChase);

        // Set a click listener on that View
        theChase.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the The Chase albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link theChaseActivity}
                Intent theChaseIntent = new Intent(MainActivity.this, TheChaseActivity.class);

                // Start the new activity
                startActivity(theChaseIntent);
            }
        });

    }
}