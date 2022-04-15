package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    val log = Logger.getLogger(MainActivity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log.info("onCreate")
        btnToSecondActivity.setOnClickListener {
            val m_intent = Intent(this@MainActivity,
                secondActivity::class.java)
            startActivity(m_intent)
        }

    }
    override fun onPause() {
        super.onPause()
        log.info("onPause")
    }
    override fun onRestart() {
        super.onRestart()
        log.info("onRestart")
    }
    override fun onResume() {
        super.onResume()
        log.info("onResume")
    }
}