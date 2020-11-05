package com.example.servicestutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startService(view: View?) {
        startService(Intent(baseContext, MyService::class.java))
    }

    fun stopService(view: View?) {
        stopService(Intent(baseContext, MyService::class.java))
    }

}
