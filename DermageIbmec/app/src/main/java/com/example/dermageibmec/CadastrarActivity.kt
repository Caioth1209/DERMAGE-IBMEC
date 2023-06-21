package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CadastrarActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val voltarMain: Button = findViewById(R.id.btnVoltarCadastrar)
        voltarMain.setOnClickListener {
            val senha:EditText = findViewById(R.id.senha)
            val senhaConf:EditText = findViewById(R.id.senhaConf)
            if(senha.text.toString() == senhaConf.text.toString()){
                val nome:EditText = findViewById(R.id.nomeSalvar)
                Resultado.nomeSalvo = nome.text.toString()
                val email:EditText = findViewById(R.id.emailSalvar)
                Resultado.emailSalvo = email.text.toString()
                val telefone:EditText = findViewById(R.id.telefoneSalvar)
                Resultado.telefoneSalvo = telefone.text.toString()
                Resultado.senhaSalvo = senhaConf.text.toString()

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}