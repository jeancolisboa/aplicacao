package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ModalidadefinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modalidadefinal)

        findViewById<Button>(R.id.cancelarvaidois).setOnClickListener {
            val intent = Intent(this, TransactioncanceladadoisActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avista).setOnClickListener {
            val intent = Intent(this, DigitsenhaActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.cliente).setOnClickListener {
            val intent = Intent(this, DigitsenhaclienteActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avistaa).setOnClickListener {
            val intent = Intent(this, DigitsenhaActivity ::class.java)
            startActivity(intent)
        }
    }
}