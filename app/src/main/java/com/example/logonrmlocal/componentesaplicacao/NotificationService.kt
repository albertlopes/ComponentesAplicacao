package com.example.logonrmlocal.componentesaplicacao

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class NotificationService: IntentService("") {
    override fun onHandleIntent(intent: Intent?) {

        val msg =  intent?.getStringExtra("MSG")
        val msg2  = intent?.getStringExtra("MSG2")

        Log.i("ALBERT",msg + msg2)
    }
}