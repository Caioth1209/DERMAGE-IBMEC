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

        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, QuizFimActivity::class.java)
            startActivity(intent)
        }

        val botaoVoltar: Button = findViewById(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, Quiz3Activity::class.java)
            startActivity(intent)
        }
    }
}