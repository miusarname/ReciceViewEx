package com.example.reciceviewex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TasklistProvider.tasklist
        setContentView(R.layout.activity_main)
    }
}