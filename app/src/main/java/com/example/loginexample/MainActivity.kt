package com.example.loginexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        // Get references to UI elements

        val emailInput = findViewById<EditText>(R.id.emailInput)

        val passwordInput = findViewById<EditText>(R.id.passwordInput)

        val loginButton = findViewById<Button>(R.id.loginButton)



        // Set up the login button click listener

        loginButton.setOnClickListener {

            // Create an Intent to go to HomeActivity

            val intent = Intent(this, HomeActivity::class.java)

            // Optional: Pass data to the home screen

            intent.putExtra("userEmail", emailInput.text.toString())

            startActivity(intent)

        }

    }

}