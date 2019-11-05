package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class KennyChesneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenny_chesney);


        // Find the View that shows the Road and the Radio albums
        TextView roadAndTheRadio = (TextView) findViewById(R.id.roadAndTheRadio);

        // Set a click listener on that View
        roadAndTheRadio.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Road and the Radio albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link roadAndTheRadioActivity}
                Intent roadAndTheRadioIntent = new Intent(MainActivity.this, RoadAndTheRadioActivity.class);

                // Start the new activity
                startActivity(roadAndTheRadioIntent);
            }
        });

        // Find the View that shows the Me and You albums
        TextView meAndYou = (TextView) findViewById(R.id.meAndYou);

        // Set a click listener on that View
        meAndYou.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Me and You albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link meAndYouActivity}
                Intent meAndYouIntent = new Intent(MainActivity.this, meAndYouActivity.class);

                // Start the new activity
                startActivity(meAndYouIntent);
            }
        });

        // Find the View that shows the When The Sun Goes Down albums
        TextView whenTheSunGoesDown = (TextView) findViewById(R.id.whenTheSunGoesDown);

        // Set a click listener on that View
        whenTheSunGoesDown.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the When The Sun Goes Down albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link whenTheSunGoesDownActivity}
                Intent whenTheSunGoesDownIntent = new Intent(MainActivity.this, whenTheSunGoesDownActivity.class);

                // Start the new activity
                startActivity(whenTheSunGoesDownIntent);
            }
        });

    }
}