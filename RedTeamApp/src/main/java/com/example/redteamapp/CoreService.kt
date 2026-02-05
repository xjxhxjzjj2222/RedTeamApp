package com.example.redteamapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class CoreService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("CoreService", "Service started")
        return START_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? = null
}
