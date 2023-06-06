package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class Quiz4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_4)

        val escolhaCurta: RadioButton = findViewById(R.id.radioCurta)
        if(escolhaCurta.isChecked){
            Resultado.resp4 = 1
        }

        val radioPratica: RadioButton = findViewById(R.id.radioPratica)
        if(radioPratica.isChecked){
            Resultado.resp4 = 2
        }

        val escolhaDepende: RadioButton = findViewById(R.id.radioDepende)
        if(escolhaDepende.isChecked){
            Resultado.resp4 = 3
        }

        val escolhaLonga: RadioButton = findViewById(R.id.radioLonga)
        if(escolhaLonga.isChecked){
            Resultado.resp4 = 4
        }

        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val botaoVoltar: Button = findViewById(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}