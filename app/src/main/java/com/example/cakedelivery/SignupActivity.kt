package com.example.cakedelivery

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signupButton = findViewById<Button>(R.id.btnSignup)

        signupButton.setOnClickListener {
            Log.d("SignupActivity", "Sign Up button clicked!")
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Optional: Closes SignupActivity to prevent going back to it
        }
    }
}
