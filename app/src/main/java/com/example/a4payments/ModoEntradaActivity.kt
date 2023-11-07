package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class ModoEntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_entrada)



        findViewById<TextView>(R.id.cancelarvaidois).setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }


        val atrasoEmMilissegundos = 4000L // Ajuste o valor para a duração desejada em milissegundos (3 segundos neste exemplo).

        val countDownTimer = object : CountDownTimer(atrasoEmMilissegundos, atrasoEmMilissegundos) {
            override fun onTick(millisUntilFinished: Long) {
                // Não é usado no contador regressivo
            }

            override fun onFinish() {
                runOnUiThread {
                    // Código a ser executado após o atraso
                    val intent = Intent(this@ModoEntradaActivity, ModalidadefinalActivity::class.java)
                    startActivity(intent)
                    finish() // Encerra a TransactioncanceladaActivity para que o usuário não possa voltar para ela.
                }
            }
        }

        countDownTimer.start()
    }
}