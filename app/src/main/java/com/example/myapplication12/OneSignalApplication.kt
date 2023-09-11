package com.example.myapplication12

import android.app.Application
import com.onesignal.OneSignal

class OneSignalApplication: Application() {

    val ONESIGNAL_APP_ID = "717cfab0-5a1f-4640-94ba-bfa457a4ddc8"

    override fun onCreate() {
        super.onCreate()

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

    }

}