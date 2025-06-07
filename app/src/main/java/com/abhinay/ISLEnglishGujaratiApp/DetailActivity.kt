package com.abhinay.ISLEnglishGujaratiApp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val signImageView = findViewById<ImageView>(R.id.signImageView)
        val englishTextView = findViewById<TextView>(R.id.englishTextView)
        val gujaratiTextView = findViewById<TextView>(R.id.gujaratiTextView)

        // Retrieve data from intent
        val imageRes = intent.getIntExtra("signImageRes", 0)
        val englishText = intent.getStringExtra("englishText") ?: "English Text"
        val gujaratiText = intent.getStringExtra("gujaratiText") ?: "Gujarati Text"

        if (imageRes != 0) {
            signImageView.setImageResource(imageRes)
        } else {
            // fallback image or handle error
            signImageView.setImageResource(R.drawable.hand) // your default image
        }

        englishTextView.text = englishText
        gujaratiTextView.text = gujaratiText
    }
}
