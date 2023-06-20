package com.technipixl.evand1.exo2

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class ConnectedActivity : Activity() {
    private val listItems = mutableListOf<String>()
    private var textViewContent: TextView? = null
    private var numberOfItems = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connected)
        //textViewContent = findViewById<LinearLayout>(R.id.textViewContent) as LinearLayout
        textViewContent = findViewById<TextView>(R.id.textViewContent) as TextView
        loadData()
        displayData()
    }

    private fun loadData() {
        listItems.clear()
        listItems.add("Item 1")
        listItems.add("Item 2")
        listItems.add("Item 3")
        listItems.add("Item 4")
        listItems.add("Item 5")
        listItems.add("Item 6")

        numberOfItems = listItems.size
        updateData()
        numberOfItems = listItems.size
    }

    private fun updateData() {
        //remove last item
        listItems.removeAt(listItems.size-1)
    }

    private fun displayData() {
        /*
        for (i in 0 until numberOfItems) {
            val textView = TextView(this)
            textView.text = listItems[i].trimIndent()
            textViewContent?.addView(textView)
        }
        */

        val stringBuilder = StringBuilder()
        for (i in 0 until numberOfItems) {
            stringBuilder.append(
                listItems[i].trimIndent()
            )
            stringBuilder.appendLine()
        }
        textViewContent?.text = stringBuilder.toString()

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.connected, menu)
        return true
    }
}