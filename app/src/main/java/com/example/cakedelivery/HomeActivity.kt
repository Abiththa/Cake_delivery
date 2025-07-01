package com.example.cakedelivery

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent = Intent(this, CakedetailsActivity::class.java)
            startActivity(intent)
        }

        val btnimage = findViewById<ImageView>(R.id.btnimage)
        btnimage.setOnClickListener {
            val intent = Intent(this, CakedetailsActivity::class.java)
            startActivity(intent)
        }

        val imageView13 = findViewById<ImageView>(R.id.btnprofile)
        imageView13.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val settingsIcon: ImageView = findViewById(R.id.imageView12)

        settingsIcon.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }



    }
}