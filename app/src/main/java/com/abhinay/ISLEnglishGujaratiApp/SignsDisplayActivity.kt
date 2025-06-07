package com.abhinay.ISLEnglishGujaratiApp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SignsDisplayActivity : AppCompatActivity(), SignAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var signAdapter: SignAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_grid)

        recyclerView = findViewById(R.id.signGrid)
        recyclerView.layoutManager = GridLayoutManager(this, 3)  // 3 columns grid

        val level = intent.getStringExtra("level") ?: "basic"
        findViewById<TextView>(R.id.levelTitle).text = level.capitalize() + " Level"

        // Load signs data based on level
        val signList = getSignsForLevel(level)

        signAdapter = SignAdapter(signList, this)
        recyclerView.adapter = signAdapter
    }

    private fun getSignsForLevel(level: String): List<Sign> {
        // TODO: Replace with real data source or static data
        // For example purposes, we return some dummy signs with name and drawable resource
        return when (level) {
            "basic" -> listOf(
                Sign("A", R.drawable.sign_a, "A", "અ"),
                Sign("B", R.drawable.sign_b, "B", "બ"),
                // add more basic signs
            )
            "intermediate" -> listOf(
                Sign("C", R.drawable.sign_c, "C", "ક"),
                // more intermediate signs
            )
            "advanced" -> listOf(
                Sign("D", R.drawable.sign_d, "D", "ડ"),
                // more advanced signs
            )
            else -> emptyList()
        }
    }

    override fun onItemClick(sign: Sign) {
        // Open detail activity on sign click
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("signName", sign.name)
        intent.putExtra("signImageRes", sign.imageRes)
        intent.putExtra("englishText", sign.englishText)
        intent.putExtra("gujaratiText", sign.gujaratiText)
        startActivity(intent)
    }
}
