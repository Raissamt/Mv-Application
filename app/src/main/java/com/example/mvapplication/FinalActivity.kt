package com.example.mvapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val toolbar = findViewById<Toolbar>(R.id.toolbarPage)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val textFinal = findViewById<TextView>(R.id.textFinal)
        val textFromIntent = intent.getStringExtra("text")

        if (textFromIntent != null) {
            textFinal.text = textFromIntent

            val confirmButton = findViewById<Button>(R.id.confirmBtn)
            //val backButton = findViewById<Button>(R.id.backButton)

            confirmButton.setOnClickListener {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setMessage("Texto enviado!")
                alertDialog.setPositiveButton("OK") { _, _ ->
                }
                alertDialog.show()
            }

            //backButton.setOnClickListener {
                //finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                //finish()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}