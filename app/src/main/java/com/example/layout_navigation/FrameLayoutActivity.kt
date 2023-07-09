package com.example.layout_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
        supportActionBar?.title = "Frame Layout"
//        get btn1
        val btn1 = findViewById<android.widget.Button>(R.id.btn1)
//        on click go to constraint layout
        btn1.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
//        get btn2
        val btn2 = findViewById<android.widget.Button>(R.id.btn2)
//        on click go to chains
        btn2.setOnClickListener {
            val intent = Intent(this, Chains::class.java)
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.side_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return onSelectItemMenu(this, item)
    }
}