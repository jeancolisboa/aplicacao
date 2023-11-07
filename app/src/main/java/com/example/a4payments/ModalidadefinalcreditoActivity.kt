package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ModalidadefinalcreditoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modalidadefinalcredito)

        findViewById<Button>(R.id.cancelarvaidois).setOnClickListener {
            val intent = Intent(this, TransactioncanceladadoisActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avista).setOnClickListener {
            val intent = Intent(this, SenhacreditoavistaestabelecimentoActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.cliente).setOnClickListener {
            val intent = Intent(this, SenhacreditoavistaclienteActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avistaestabelecimento).setOnClickListener {
            val intent = Intent(this, SenhaparceladoestabelecimentoActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avistaaestabelecimento).setOnClickListener {
            val intent = Intent(this, SenhacreditoavistaestabelecimentoActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.avistaacliente).setOnClickListener {
            val intent = Intent(this, SenhaparceladoestabelecimentoActivity ::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.clientedois).setOnClickListener {
            val intent = Intent(this, SenhaparceladoclienteActivity ::class.java)
            startActivity(intent)
        }

    }
}