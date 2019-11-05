package android.example.blankenship_musicapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AlanJacksonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alan_jackson);


        // Find the View that shows the High Mileage albums
        TextView highMileage = (TextView) findViewById(R.id.highMileage);

        // Set a click listener on that View
        highMileage.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the High Mileage albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link highMileageActivity}
                Intent highMileageIntent = new Intent(MainActivity.this, HighMileageActivity.class);

                // Start the new activity
                startActivity(highMileageIntent);
            }
        });

        // Find the View that shows Drive albumsA
        TextView drive = (TextView) findViewById(R.id.drive);

        // Set a click listener on that View
        drive.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when Drive albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link driveActivity}
                Intent driveIntent = new Intent(MainActivity.this, DriveActivity.class);

                // Start the new activity
                startActivity(driveIntent);
            }
        });

        // Find the View that shows the Good Time albums
        TextView goodTime = (TextView) findViewById(R.id.highMileage);

        // Set a click listener on that View
        goodTime.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Good Time albums is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link goodTimeActivity}
                Intent goodTimeIntent = new Intent(MainActivity.this, goodTimeActivity.class);

                // Start the new activity
                startActivity(goodTimeIntent);
            }
        });

    }
}