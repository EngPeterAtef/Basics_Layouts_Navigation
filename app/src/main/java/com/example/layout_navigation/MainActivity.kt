package com.example.layout_navigation

import android.content.ClipData.newIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Linear Layout"

//    get btn1 by ID
        val goToRelativeLayoutBtn = findViewById<Button>(R.id.btn1)
// on click on goToRelativeLayoutBtn go to RelativeLayoutActivity
        goToRelativeLayoutBtn.setOnClickListener {
            val intent = Intent(this, RelativeLayoutActivity::class.java)
//            intent.putExtra(NOTE_ID, note.id)
            startActivity(intent)
        }
// get btn2 by ID
        val goToCalculator = findViewById<Button>(R.id.btn2)
//        on click open the calculator app
        goToCalculator.setOnClickListener {
            val intent = Intent()
            intent.setClassName("com.example.calculator", "com.example.calculator.MainActivity")
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.side_menu, menu)
//        get item with id linearlayout
//        val linearLayout = menu.findItem(R.id.linearlayout)
////        on click go to linear layout activity
//        linearLayout.setOnMenuItemClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            finish()
//            startActivity(intent)
//            true
//        }
////        get item with id Constraintlayout
//        val constraintLayout = menu.findItem(R.id.Constraintlayout)
////        on click go to constraint layout activity
//        constraintLayout.setOnMenuItemClickListener {
//            val intent = Intent(this, ConstraintLayoutActivity::class.java)
//            finish()
//            startActivity(intent)
//            true
//        }
////        get item with id FrameLayout
//        val frameLayout = menu.findItem(R.id.Framelayout)
////        on click go to frame layout activity
//        frameLayout.setOnMenuItemClickListener {
//            val intent = Intent(this, FrameLayoutActivity::class.java)
//            finish()
//            startActivity(intent)
//            true
//        }
////        get item with id Relative layout
//        val relativeLayout = menu.findItem(R.id.Relativelayout)
////        on click go to relative layout activity
//        relativeLayout.setOnMenuItemClickListener {
//            val intent = Intent(this, RelativeLayoutActivity::class.java)
//            finish()
//            startActivity(intent)
//            true
//        }
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return onSelectItemMenu(this, item)
    }
}