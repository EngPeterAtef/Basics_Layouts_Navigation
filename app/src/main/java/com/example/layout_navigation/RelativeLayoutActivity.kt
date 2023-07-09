package com.example.layout_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        supportActionBar?.title = "Relative Layout"
//        get btn3 by ID
        val goToConstraintLayoutBtn = findViewById<Button>(R.id.btn3)
//        on click on goToConstraintLayoutBtn go to ConstraintLayoutActivity
        goToConstraintLayoutBtn.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
//        get btn4 by ID
        val goToLinearLayout = findViewById<Button>(R.id.btn4)
//        on click on goToLinearLayout go to LinearLayoutActivity
        goToLinearLayout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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