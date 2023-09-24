package com.example.mvapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private val textToDisplay = "Olá!"
    private val delayMillis: Long = 500 // tempo entre cada letra

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        textView = findViewById(R.id.textSplash)

        textSplashScreen()
    }

    private fun textSplashScreen() {
        val handler = Handler(Looper.getMainLooper())
        var index = 0
        val runnable = object : Runnable {
            override fun run() {
                if (index < textToDisplay.length) {
                    val currentText = textToDisplay.substring(0, index + 1)
                    textView.text = currentText
                    index++
                    handler.postDelayed(this, delayMillis)
                } else {
                    val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                    startActivity(intent)

                    finish()
                }
            }
        }
        handler.postDelayed(runnable, delayMillis)
    }
}
