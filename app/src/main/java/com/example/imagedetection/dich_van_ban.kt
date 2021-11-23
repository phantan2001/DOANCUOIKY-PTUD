package com.example.imagedetection

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class dich_van_ban : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dich_van_ban)

        val home = findViewById<ImageButton>(R.id.home)

        home.setOnClickListener {
            startActivity(Intent(this@dich_van_ban, MainActivity::class.java))
        }
    }
}