package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val buttonColor = findViewById<Button>(R.id.buttonColor)

        button.setOnClickListener {
            textView.text = "Hello from the Button!"
        }

        buttonColor.setOnClickListener {
            textView.setTextColor(Color.parseColor("#FF5722"))
        }
    }
}

