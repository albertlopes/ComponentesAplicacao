package com.example.logonrmlocal.componentesaplicacao

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService(){

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)

        Log.d("BODY",  remoteMessage?.notification?.body)
        Log.d("TITULO",  remoteMessage?.notification?.title)


    }
}