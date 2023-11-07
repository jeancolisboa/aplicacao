package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ModalidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modalidade)

        findViewById<TextView>(R.id.cancelarvaidois).setOnClickListener {
            val intent = Intent(this, TransactioncanceladaActivity :: class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.credito).setOnClickListener {
            val intent = Intent(this, ModoEntradadoisActivity :: class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.creditodois).setOnClickListener {
            val intent = Intent(this, ModoEntradadoisActivity :: class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.debito).setOnClickListener {
            val intent = Intent(this, ModoEntradaActivity :: class.java)
            startActivity(intent)
        }
    }
}