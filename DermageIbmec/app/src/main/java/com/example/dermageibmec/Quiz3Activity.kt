package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity


class Quiz3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_3)

        val voltar: Button = findViewById(R.id.botaoVoltar)
        val avancar: Button = findViewById(R.id.botaoAvancar)
        voltar.setOnClickListener{
            val intent = Intent(this, Quiz2Activity::class.java)
            startActivity(intent)
        }
        avancar.setOnClickListener{
            val botao1: RadioButton = findViewById(R.id.radioButton)
            val botao2: RadioButton = findViewById(R.id.radioButton2)
            val botao3: RadioButton = findViewById(R.id.radioButton3)
            val botao4: RadioButton = findViewById(R.id.radioButton4)
            val botao5: RadioButton = findViewById(R.id.radioButton5)
            val botao6: RadioButton = findViewById(R.id.radioButton6)
            val botao7: RadioButton = findViewById(R.id.radioButton7)
            val botao8: RadioButton = findViewById(R.id.radioButton8)

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

            val intent = Intent(this, Quiz4Activity::class.java)
            startActivity(intent)
        }

    }
}