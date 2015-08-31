package com.jcb.enunciate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jcb.enunciate.R;


public class EnSplashActivity extends Activity {

    private final int SPLASH_TIME = 1500;
    private Handler mHandler = null;

    private Runnable SplashRunnable = new Runnable() {
        @Override
        public void run() {
            callTeamActivity();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_splash);

        initialiseValues();
    }

    /**
     * Initialising handles used for starting next activity
     */
    private void initialiseValues() {

        mHandler = new Handler();

        continueLaunch(true);
    }

    private void continueLaunch(boolean isDelayed) {

        if (isDelayed) {
            mHandler.postDelayed(SplashRunnable, SPLASH_TIME);
        } else {
            mHandler.post(SplashRunnable);
        }
    }

    /**
     * Calling next activity
     */
    private void callTeamActivity() {

        Intent launchIntent = new Intent(EnSplashActivity.this, EnMainActivity.class);
        startActivity(launchIntent);
        finish();
    }

}
