package com.example.composequotesapp.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppController:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}