package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecuperarSenhaTelefoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha_telefone)

        val btnVoltar: Button = findViewById(R.id.btn_voltar2)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnTelefone: Button = findViewById(R.id.btn_email2)
        btnTelefone.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaTelefoneActivity::class.java)
            startActivity(intent)
        }
    }
}