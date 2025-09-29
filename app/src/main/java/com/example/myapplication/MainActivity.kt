// temporary comment for revert demo

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
        val buttonChangeColor = findViewById<Button>(R.id.buttonChangeColor)
        val buttonChangeBackground = findViewById<Button>(R.id.buttonChangeBackground)

        // First button: change the text
        button.setOnClickListener {
            textView.text = "Hello from the Button!"
        }

        // Second button: change the text color
        buttonChangeColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        // Third button: change the background color
        buttonChangeBackground.setOnClickListener {
            val rootView = findViewById<android.view.View>(android.R.id.content)
            rootView.setBackgroundColor(Color.parseColor("#E3F2FD")) // light blue
        }
    }
}


