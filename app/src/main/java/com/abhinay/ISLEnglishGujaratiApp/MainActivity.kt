package com.abhinay.ISLEnglishGujaratiApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val getStartedButton = findViewById<Button>(R.id.getStartedBtn)
        val aboutButton = findViewById<Button>(R.id.aboutBtn)

        getStartedButton.setOnClickListener {
            val intent = Intent(this, DifficultyLevelActivity::class.java)
            startActivity(intent)
        }

        aboutButton.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
