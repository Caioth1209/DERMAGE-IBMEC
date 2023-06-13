package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class QuizFimActivityFim2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_fim2)
        var cont = 0
        val radiobutao = findViewById<RadioButton>(R.id.radioButton)
        val button = findViewById<Button>(R.id.buttonFinalizar)
        radiobutao.setOnClickListener{
            button.setOnClickListener {
                val pagina2 = Intent(this, MainActivity::class.java)
                startActivity(pagina2)
            }
        }
    }
}