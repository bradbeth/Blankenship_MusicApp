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


                // Create a list of album
                ArrayList<Album> album = new ArrayList<Album>();
                album.add(new Album("Red"));
                album.add(new Album("Blue"));
                album.add(new Album("Green"));

                // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
                // adapter knows how to create list items for each item in the list.
                WordAdaptor adapter = new WordAdaptor(this, album);

                // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
                // There should be a {@link ListView} with the view ID called list, which is declared in the
                // word_list.xml layout file.
                ListView listView = findViewById(R.id.list);

                // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
                // {@link ListView} will display list items for each {@link Word} in the list.
                listView.setAdapter(adapter);
            }
        }
