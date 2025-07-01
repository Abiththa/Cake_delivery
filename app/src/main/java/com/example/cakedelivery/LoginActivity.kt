package com.example.cakedelivery  // Change to your actual package name

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)  // Ensure this matches your login XML file

        val signUpTextView: TextView = findViewById(R.id.signUpTextView) // Reference to "Create New account? Sign up" TextView

        signUpTextView.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}


