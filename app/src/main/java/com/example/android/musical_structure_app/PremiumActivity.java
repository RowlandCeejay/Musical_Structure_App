package com.example.android.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class PremiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // I set the content of the activity to use the activity_main.xml layout file here.
        setContentView(R.layout.activity_premium);
        // Here finds the View that shows the home screen category.
        Button songs = (Button) findViewById(R.id.songs_button);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here is a new intent that opens the {@link MainActivity}
                Intent songsIntent = new Intent(PremiumActivity.this, MainActivity.class);
                startActivity(songsIntent);
            }
        });
        // Here finds the View that shows the player screen category.
        Button player = (Button) findViewById(R.id.player_button);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here is a new intent that opens the {@link PlayerActivity}
                Intent playerIntent = new Intent(PremiumActivity.this, PlayerActivity.class);
                startActivity(playerIntent);
            }
        });
        // Here finds the View that shows the search screen category.
        Button search = (Button) findViewById(R.id.search_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here is a new intent that opens the {@link SearchActivity}
                Intent searchIntent = new Intent(PremiumActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        // Here finds the View that shows the premium screen category.
        Button premium = (Button) findViewById(R.id.premium_button);
        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here is a new intent that opens the {@link PremiumActivity}
                Intent premiumIntent = new Intent(PremiumActivity.this, PremiumActivity.class);
                startActivity(premiumIntent);
            }
        });


    }
}
