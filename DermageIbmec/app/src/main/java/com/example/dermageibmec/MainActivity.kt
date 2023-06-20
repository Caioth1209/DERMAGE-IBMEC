package com.example.dermageibmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome: EditText = findViewById(R.id.caixa_nome)
        val senha: EditText = findViewById(R.id.caixa_senha)
        val btnEntrar: Button = findViewById(R.id.entrar)

        btnEntrar.setOnClickListener {
            val nomeSalvo = Resultado.nomeSalvo
            val nomeDigitado = nome.text.toString()
            val senhaSalvo = Resultado.senhaSalvo
            val senhaDigitado = senha.text.toString()
            if(nomeDigitado == nomeSalvo && senhaDigitado == senhaSalvo){
                val intent = Intent(this, Quiz3Activity::class.java)
                startActivity(intent)
            }
        }

        val btnGoogle: ImageButton = findViewById(R.id.btnGoogle)
        val btnFace: ImageButton = findViewById(R.id.btnFacebook)

        btnGoogle.setOnClickListener {
            val intent = Intent(this, Quiz3Activity::class.java)
            startActivity(intent)
        }
        btnFace.setOnClickListener {
            val intent = Intent(this, Quiz3Activity::class.java)
            startActivity(intent)
        }

        val btnCadastar: Button = findViewById(R.id.cadastrar)
        btnCadastar.setOnClickListener {
            val intent = Intent(this, CadastrarActivity::class.java)
            startActivity(intent)
        }

        val btnEsqueceu: Button = findViewById(R.id.esqueceuSenha)
        btnEsqueceu.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaEmailActivity::class.java)
            startActivity(intent)
        }
    }
}