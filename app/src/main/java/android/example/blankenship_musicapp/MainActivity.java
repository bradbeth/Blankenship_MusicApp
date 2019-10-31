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
    }

    public void cmusic (View view)  {
        Intent numbersIntent = new Intent(MainActivity.this, CountryActivity.class);
        startActivity(numbersIntent);
    }

    public void rmusic (View view)  {
        Intent numbersIntent = new Intent(MainActivity.this, RNRActivity.class);
        startActivity(numbersIntent);
    }

    public void bmusic (View view)  {
        Intent numbersIntent = new Intent(MainActivity.this, BluesActivity.class);
        startActivity(numbersIntent);
    }
}
