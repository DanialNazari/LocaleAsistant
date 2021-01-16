package com.danialnazari.localasistantsampleapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danialnazari.localeassistant.LocaleUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleUtils.updateBaseContextLocale("en",context = newBase))
    }
}