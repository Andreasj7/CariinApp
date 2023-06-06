package com.example.cariin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var logoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoutButton = findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            // Perform logout logic here
            // Example: Clear user session and navigate to the login screen
            clearUserSession()
            navigateToLoginScreen()
        }
    }

    private fun clearUserSession() {
        // Clear any user session or authentication data
    }

    private fun navigateToLoginScreen() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish() // Optional: Close the current activity if needed
    }
}