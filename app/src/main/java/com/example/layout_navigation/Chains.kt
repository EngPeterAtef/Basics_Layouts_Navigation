package com.example.layout_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.layout_navigation.databinding.ActivityChainsBinding

class Chains : AppCompatActivity() {
    private lateinit var binding: ActivityChainsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityChainsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Chains"
        //        get button by ID
//        val button = findViewById<Button>(R.id.button
        val button = binding.button
//        set onClickListener to go to frame layout
        button.setOnClickListener {
            navigateTo(this, FrameLayoutActivity::class.java)
        }
//        get button2 by ID
//        val button2 = findViewById<Button>(R.id.button2)
        val button2 = binding.button2
//        get group by ID
//        val group = findViewById<Group>(R.id.group)
//        set onClickListener to go show the group
        val group = binding.group
        button2.setOnClickListener {
            if (group.visibility == View.VISIBLE) {
                group.visibility = View.GONE
                button2.text = "Show"
            } else {
                group.visibility = View.VISIBLE
                button2.text = "Hide"

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
