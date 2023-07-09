package com.example.layout_navigation

import android.content.Intent
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun onSelectItemMenu(currActivity: AppCompatActivity, item: MenuItem): Boolean {
    Toast.makeText(currActivity, item.title, Toast.LENGTH_LONG).show()
    when (item.itemId) {
        R.id.linearlayout -> {
            val intent = Intent(currActivity, MainActivity::class.java)
//                close the current activity
            currActivity.finish()
            currActivity.startActivity(intent)

        }
        R.id.Constraintlayout -> {
            val intent = Intent(currActivity, ConstraintLayoutActivity::class.java)
            currActivity.finish()
            currActivity.startActivity(intent)
        }
        R.id.Framelayout -> {
            val intent = Intent(currActivity, FrameLayoutActivity::class.java)
            currActivity.finish()
            currActivity.startActivity(intent)
        }
        R.id.Relativelayout -> {
            val intent = Intent(currActivity, RelativeLayoutActivity::class.java)
            currActivity.finish()
            currActivity.startActivity(intent)
        }
        R.id.Chains -> {
            val intent = Intent(currActivity, Chains::class.java)
            currActivity.finish()
            currActivity.startActivity(intent)
        }

    }
    return true
}

fun navigateTo(currActivity: AppCompatActivity, destActivity: Class<*>) {
    val intent = Intent(currActivity, destActivity)
    currActivity.finish()
    currActivity.startActivity(intent)
}