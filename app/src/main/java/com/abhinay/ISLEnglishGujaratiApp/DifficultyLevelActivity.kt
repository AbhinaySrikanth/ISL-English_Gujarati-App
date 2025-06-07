package com.abhinay.ISLEnglishGujaratiApp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DifficultyLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty_activity)

        val basicCard = findViewById<CardView>(R.id.beginnerCard)
        val intermediateCard = findViewById<CardView>(R.id.intermediateCard)
        val advancedCard = findViewById<CardView>(R.id.advancedCard)

        basicCard.setOnClickListener {
            startSignsDisplayActivity("basic")
        }

        intermediateCard.setOnClickListener {
            startSignsDisplayActivity("intermediate")
        }

        advancedCard.setOnClickListener {
            startSignsDisplayActivity("advanced")
        }
    }

    private fun startSignsDisplayActivity(level: String) {
        val intent = Intent(this, SignsDisplayActivity::class.java)
        intent.putExtra("level", level)
        startActivity(intent)
    }
}
