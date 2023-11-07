package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView

class TransactioncanceladadoisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactioncanceladadois)

        val imagemview3 = findViewById<ImageView>(R.id.imageView3)
        findViewById<ImageView>(R.id.imageView3).scaleX = -1f

        val atrasoEmMilissegundos =
            2000L // Ajuste o valor para a duração desejada em milissegundos (3 segundos neste exemplo).

        val countDownTimer = object : CountDownTimer(atrasoEmMilissegundos, atrasoEmMilissegundos) {
            override fun onTick(millisUntilFinished: Long) {
                // Não é usado no contador regressivo
            }

            override fun onFinish() {
                runOnUiThread {
                    // Código a ser executado após o atraso
                    val intent =
                        Intent(this@TransactioncanceladadoisActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish() // Encerra a TransactioncanceladaActivity para que o usuário não possa voltar para ela.
                }
            }
        }

        countDownTimer.start()
    }
}