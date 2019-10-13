package br.com.romagnoli.meowshop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showMainActivity();
            }
        }, 1500);
    }

    private void showMainActivity() {
        Intent intent = new Intent(this, BottomNavigationActivity.class);
        startActivity(intent);
        finish();
    }
}
