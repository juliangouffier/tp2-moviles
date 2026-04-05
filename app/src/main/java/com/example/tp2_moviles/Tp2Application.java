package com.example.tp2_moviles;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;

import androidx.core.content.ContextCompat;

public class Tp2Application extends Application {

    private final ScreenUnlockReceiver screenUnlockReceiver = new ScreenUnlockReceiver();

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter filter = new IntentFilter(Intent.ACTION_USER_PRESENT);
        ContextCompat.registerReceiver(
                this,
                screenUnlockReceiver,
                filter,
                ContextCompat.RECEIVER_EXPORTED
        );
    }
}
