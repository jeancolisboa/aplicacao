package com.example.a4payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class RemovacartaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_removacartao)

        val atrasoEmMilissegundos = 3000L // Ajuste o valor para a duração desejada em milissegundos (3 segundos neste exemplo).

        val countDownTimer = object : CountDownTimer(atrasoEmMilissegundos, atrasoEmMilissegundos) {
            override fun onTick(millisUntilFinished: Long) {
                // Não é usado no contador regressivo
            }

            override fun onFinish() {
                runOnUiThread {
                    // Código a ser executado após o atraso
                    val intent = Intent(this@RemovacartaoActivity, ViaclienteActivity::class.java)
                    startActivity(intent)
                    finish() // Encerra a TransactioncanceladaActivity para que o usuário não possa voltar para ela.
                }
            }
        }

        countDownTimer.start()
    }
}