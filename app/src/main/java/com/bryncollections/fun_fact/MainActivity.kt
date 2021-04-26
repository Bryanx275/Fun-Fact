package com.bryncollections.fun_fact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // counts for number of button clicks
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View) {
        // increment count
        count++
        // Locate textview and update the label
        val textview = findViewById(R.id.textView) as TextView
        textview.text = "You clicked $count times"

    }
}