package com.example.tp2_moviles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class ScreenUnlockReceiver extends BroadcastReceiver {

    private static final String TAG = "ScreenUnlockReceiver";
    private static final String PHONE_URI = "tel:2664553747";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
            return;
        }

        Toast.makeText(
                context.getApplicationContext(),
                "Pantalla desbloqueada detectada",
                Toast.LENGTH_SHORT
        ).show();

        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse(PHONE_URI));
        dialIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            context.startActivity(dialIntent);
        } catch (RuntimeException e) {
            Log.w(TAG, "Ocurrio un error", e);
        }
    }
}

