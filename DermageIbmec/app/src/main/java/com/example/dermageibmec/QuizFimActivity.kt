package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizFimActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_fim)
        val button = findViewById<Button>(R.id.botao)
        button.setOnClickListener{
            val pagina2 = Intent(this@QuizFimActivity, QuizFimActivityFim2::class.java)
            startActivity(pagina2)
        }
    }
}