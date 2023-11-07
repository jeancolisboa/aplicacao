package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViaclienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viacliente)

        findViewById<Button>(R.id.negativo).setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.positivo).setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

    }
}