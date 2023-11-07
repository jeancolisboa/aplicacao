package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DigitvalorActivity : AppCompatActivity() {

    //denomina a variavel valor
    private lateinit var valor: TextView
    private var valorInicialSubstituido = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digitvalor)


        findViewById<Button>(R.id.cancelarvai).setOnClickListener {

                val intent = Intent(this, TransactioncanceladaActivity::class.java)
                startActivity(intent)

        }

        findViewById<Button>(R.id.proximo).setOnClickListener {

            val intent = Intent(this, ModalidadeActivity::class.java)
            startActivity(intent)

        }

        // chama o textview da activity
        valor = findViewById(R.id.valor)

        findViewById<TextView>(R.id.zero).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "0"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("0")
            }
        }

        findViewById<TextView>(R.id.virgula).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = ","
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2(",")
            }
        }
        findViewById<TextView>(R.id.um).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "1"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("1")
            }
        }
        findViewById<TextView>(R.id.dois).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "2"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("2")
            }
        }
        findViewById<TextView>(R.id.tres).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "3"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("3")
            }
        }
        findViewById<TextView>(R.id.quatro).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "4"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("4")
            }
        }
        findViewById<TextView>(R.id.cinco).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "5"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("5")
            }
        }
        findViewById<TextView>(R.id.seis).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "6"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("6")
            }
        }
        findViewById<TextView>(R.id.sete).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "7"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("7")
            }
        }
        findViewById<TextView>(R.id.oito).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "8"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("8")
            }
        }
        findViewById<TextView>(R.id.nove).setOnClickListener {
            if (!valorInicialSubstituido) {
                valor.text = "9"
                valorInicialSubstituido = true
            } else {
                acrescentarExpressao2("9")
            }
        }

        findViewById<TextView>(R.id.apagar).setOnClickListener {
            val textoAtual = valor.text.toString()
            if (textoAtual.isNotEmpty()) {
                valor.text = textoAtual.substring(0, textoAtual.length - 1)
            }
        }
    }
    //funcao para substituir o texto inical do valor
    private fun substituirTextoInicial(valorBotao: String) {
        valor.text = valorBotao
        valorInicialSubstituido = true
    }
    //acrescentar o caractere no valor
    private fun acrescentarExpressao2(string: String) {
        valor.text = valor.text.toString() + string
    }
}
