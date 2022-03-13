package com.example.jogoforca03kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvLayout: TextView
    private lateinit var tvDica:TextView
    private lateinit var banco: Banco
    private lateinit var jogo: JogoForca03
s
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.banco = Banco()
        this.jogo = JogoForca03(this.banco.palavra(),this.banco.dica())

        this.tvLayout = findViewById(R.id.tvLayout)
        this.tvDica = findViewById(R.id.tvDica)

        this.tvLayout.text = this.jogo.getPalavra()
        this.tvDica.text= this.jogo.getDica()


    }
}