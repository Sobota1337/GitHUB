package com.example.github

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        findViewById<Button>(R.id.nr1).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "1"
        }
        findViewById<Button>(R.id.nr2).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "2"
        }

        findViewById<Button>(R.id.nr3).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "3"
        }
        findViewById<Button>(R.id.nr4).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "4"
        }
        findViewById<Button>(R.id.nr5).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "5"
        }
        findViewById<Button>(R.id.nr6).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "6"
        }
        findViewById<Button>(R.id.nr7).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "7"
        }
        findViewById<Button>(R.id.nr8).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "8"
        }
        findViewById<Button>(R.id.nr9).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text = "9"
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }


    }
}

