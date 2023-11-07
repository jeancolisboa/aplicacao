package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DigitsenhaActivity : AppCompatActivity() {

    //denomina a variavel senha
    private lateinit var senha: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digitsenha)

        findViewById<TextView>(R.id.cancelarvaitres).setOnClickListener {
            val intent = Intent(this, TransactioncanceladadoisActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.ok).setOnClickListener {
            val intent = Intent(this, ProcessandotransactionActivity::class.java)
            startActivity(intent)
        }

        // chama o textview da activity
        senha = findViewById(R.id.senhaa)

        findViewById<TextView>(R.id.zerogod).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.um).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.dois).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.tres).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.quatro).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.cinco).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.seis).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.setee).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.oito).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }
        findViewById<TextView>(R.id.nove).setOnClickListener {
            acrescentarExpressao2(
                string = "*",
                limpar_dados3 = false
            )
        }


        findViewById<ImageView>(R.id.deletee).setOnClickListener {
            val string = senha.text.toString()

            if (string.isNotBlank()) {
                senha.text = string.substring(0, string.length - 1)
            }
        }



    }


    //acrescentar o caractere no valor
    private fun acrescentarExpressao2(string: String, limpar_dados3: Boolean) {
        if (limpar_dados3) {
            senha.text = string
        } else {
            senha.append(string)
        }
    }

}