package com.modashmo.learntoplaybass;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openInfoDialog(R.string.dialog_info);
        TextView aboutButton = (TextView) findViewById(R.id.about_text_view);
        TextView moreSongsButton = (TextView) findViewById(R.id.more_text_view);
        TextView startButton = (TextView) findViewById(R.id.start_text_view);

        // Set a click listener on aboutButton and start AboutActivity with an explicit intent
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                // Start the new activity
                startActivity(aboutIntent);
            }
        });

        // Set a click listener on moreSongsButton and start MoreSongsActivity with an explicit intent
        moreSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreSongsIntent = new Intent(MainActivity.this, MoreSongsActivity.class);
                // Start the new activity
                startActivity(moreSongsIntent);
            }
        });

        // Set a click listener on startButton and start StartActivity with an explicit intent
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, StartActivity.class);
                // Start the new activity
                startActivity(startIntent);
            }
        });

    }
    private void openInfoDialog(int message) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(R.string.app_name)
                .setMessage(message)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //  Dismiss dialog, no action required
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }
}
