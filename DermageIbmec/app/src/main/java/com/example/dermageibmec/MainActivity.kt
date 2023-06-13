package com.example.dermageibmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome: EditText = findViewById(R.id.caixa_nome)
        val senha: EditText = findViewById(R.id.caixa_senha)
        val btnEntrar: Button = findViewById(R.id.entrar)

        btnEntrar.setOnClickListener {
            if(nome.equals("admin") && senha.equals("adm123")){
                val intent = Intent(this, Quiz1Activity::class.java)
                startActivity(intent)
            }
        }
    }
}