package com.example.dermageibmec

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizFimActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_fim)

        val textTitulo = findViewById<TextView>(R.id.tituloResultado)
        val fotoResultado = findViewById<ImageView>(R.id.fotoResultado)
        val buttonResultado = findViewById<Button>(R.id.buttonResultado)

        var maior:Int = 0

        if(Resultado.resp1 > maior){
            maior = Resultado.resp1
            textTitulo.text = "Máscara Facial Purificante Charcoal Mask"
            fotoResultado.setImageResource(R.drawable.foto1)
            buttonResultado.setOnClickListener{
                val webpage = Uri.parse("https://www.dermage.com.br/mascara-facial-purificante-charcoal-mask/p")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)
            }
        }

        if(Resultado.resp2 > maior){
            maior = Resultado.resp2
            textTitulo.text = "Secatriz Loção Secativa"
            fotoResultado.setImageResource(R.drawable.foto2)
            buttonResultado.setOnClickListener{
                val webpage = Uri.parse("https://www.dermage.com.br/secatriz-locao-secativa/p")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)
            }
        }

        if(Resultado.resp3 > maior){
            maior = Resultado.resp3
            textTitulo.text = "Glycolique Sabonete"
            fotoResultado.setImageResource(R.drawable.foto3)
            buttonResultado.setOnClickListener{
                val webpage = Uri.parse("https://www.dermage.com.br/glycolique-sabonete-liquido-p15874/p")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)
            }
        }



        val button = findViewById<Button>(R.id.botao)
        button.setOnClickListener{
            val pagina2 = Intent(this@QuizFimActivity, QuizFimActivityFim2::class.java)
            startActivity(pagina2)
        }
    }
}