package de.tu_clausthal.in.informatikwerkstatt.deinepizza;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    //private static int SPLASH_TIME_OUT = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(2500, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent homeIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(homeIntent);
            }
        }.start();
    }
}


