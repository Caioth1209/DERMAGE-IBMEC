package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton

class Quiz2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_2)

        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {

            val botao1: RadioButton = findViewById(R.id.antidade)
            val botao2: RadioButton = findViewById(R.id.clareador)
            val botao3: RadioButton = findViewById(R.id.protetor)
            val botao4: RadioButton = findViewById(R.id.sabonete)
            val botao5: RadioButton = findViewById(R.id.hidratante)
            val botao6: RadioButton = findViewById(R.id.mascaras)
            val botao7: RadioButton = findViewById(R.id.antiacne)
            val botao8: RadioButton = findViewById(R.id.creme)
            val botao9: RadioButton = findViewById(R.id.vitaminac)
            val botao10: RadioButton = findViewById(R.id.tonico)
            val botao11: RadioButton = findViewById(R.id.outros)
            val botao12: RadioButton = findViewById(R.id.nada)

            if(botao1.isChecked){
                Resultado.resp1 += 1
            }
            if(botao2.isChecked){
                Resultado.resp2 += 1
            }
            if(botao3.isChecked){
                Resultado.resp3 += 1
            }
            if(botao4.isChecked){
                Resultado.resp1 += 1
            }
            if(botao5.isChecked){
                Resultado.resp2 += 1
            }
            if(botao6.isChecked){
                Resultado.resp3 += 1
            }
            if(botao7.isChecked){
                Resultado.resp1 += 1
            }
            if(botao8.isChecked){
                Resultado.resp2 += 1
            }
            if(botao9.isChecked){
                Resultado.resp3 += 1
            }
            if(botao10.isChecked){
                Resultado.resp1 += 1
            }
            if(botao11.isChecked){
                Resultado.resp2 += 1
            }
            if(botao12.isChecked){
                Resultado.resp3 += 1
            }
            val intent = Intent(this, Quiz3Activity::class.java)
            startActivity(intent)
        }

        val botaoVoltar: Button = findViewById(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, Quiz1Activity::class.java)
            startActivity(intent)
        }

    }
}