package com.example.unibites;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

// Use @SuppressLint just for this simple splash screen to avoid Handler warnings
@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 2000; // Delay in milliseconds (e.g., 2 seconds)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Links this code to the layout file

        // Use a Handler to delay the navigation to the next screen
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // This code will run after the delay

                // Create an Intent to start the LoginActivity
                // We will create LoginActivity in the next phase
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);

                // Finish the SplashActivity so the user can't go back to it
                finish();
            }
        }, SPLASH_DELAY); // The delay time
    }
}