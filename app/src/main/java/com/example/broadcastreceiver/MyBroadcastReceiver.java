package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class MyBroadcastReceiver extends BroadcastReceiver {
    private final static String TAG = "MyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Intent.ACTION_PACKAGE_ADDED)) {
            String packageName = intent.getData().getSchemeSpecificPart(); // Uri.fromParts("package", "xxx")
            Toast.makeText(context, packageName + " is installed", Toast.LENGTH_SHORT).show();
        } else if (action.equals(Intent.ACTION_PACKAGE_REMOVED)) {
            String packageName = intent.getData().getSchemeSpecificPart();
            Toast.makeText(context, packageName + " is removed", Toast.LENGTH_SHORT).show();
        }
    }
}
