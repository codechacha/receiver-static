package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class MyCustomBroadcastReceiver extends BroadcastReceiver {
    private final static String TAG = "MyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals("com.example.broadcastreceiver.message")) {
            Toast.makeText(context, "Receive broadcast : " + action, Toast.LENGTH_SHORT).show();
        }
    }
}
