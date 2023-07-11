package com.example.layout_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        supportActionBar?.title = "Constraint Layout"
//        get btn5
        val btn5 = findViewById<Button>(R.id.btn5)
//        on click go to frame layout
        btn5.setOnClickListener {
            navigateTo(this, FrameLayoutActivity::class.java)
        }
//        get btn6
        val btn6 = findViewById<Button>(R.id.btn6)
//        on click go to relative layout
        btn6.setOnClickListener {
            navigateTo(this, RelativeLayoutActivity::class.java)
        }
//        get btn7
        val btn7 = findViewById<Button>(R.id.btn7)
//        on click go to send mail to peter.atef2000@gmail.com
        btn7.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, "peter.atef2000@gmail.com")
            intent.putExtra(Intent.EXTRA_TEXT, "I hope this mail finds you well.")

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }

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