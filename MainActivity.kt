package com.example.contador

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador:Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnIncrementar = findViewById<Button>(R.id.buttonIncrementar)
        val btnDecrementar = findViewById<Button>(R.id.buttonDecrementar)
        val editarTextView = findViewById<TextView>(R.id.Numero)

        // Decrementar
        btnDecrementar.setOnClickListener{
            if (contador==0) {  contador }
            else{
                contador--
                editarTextView.setText(contador.toString())
            }
        }
        // Incrementar
        btnIncrementar.setOnClickListener{
            contador++
            editarTextView.setText(contador.toString())
        }
    }
}