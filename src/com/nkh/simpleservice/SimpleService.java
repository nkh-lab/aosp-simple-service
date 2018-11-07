/*
 * Copyright (C) 2018 NKH Lab
 */

package com.nkh.simpleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SimpleService extends Service {
    private static final String TAG = "SimpleService";

    /**
     * onCreate.
     */
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreated");
    }

    /**
     * onDestroy.
     */
    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");

        super.onDestroy();
    }

    /**
     * Bind process.
     *
     * @param intent Intent
     * @return IBind Interface
     */
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");

        return null;
    }

    /**
     * On start
     *
     * @param intent  Intent
     * @param flag    Flags
     * @param startId StartId
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand()");

        return START_REDELIVER_INTENT;
    }
}