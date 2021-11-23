package com.example.imagedetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class nhan_dien_do_vat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nhan_dien_do_vat)

        val home = findViewById<ImageButton>(R.id.home)

        home.setOnClickListener {
            startActivity(Intent(this@nhan_dien_do_vat, MainActivity::class.java))
        }
    }
}