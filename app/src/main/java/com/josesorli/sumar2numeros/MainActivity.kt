package com.josesorli.sumar2numeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText = findViewById(R.id.editTextNumber)
        val num2:EditText = findViewById(R.id.editTextNumber2)
        val boton1: Button = findViewById(R.id.button)
        val boton2: Button = findViewById(R.id.button2)
        val boton3: Button = findViewById(R.id.button3)

        val res1:TextView = findViewById(R.id.textView)

        boton1.setOnClickListener {
            //val resultado = (num1.text.toString().toInt()) + (num2.text.toString().toInt())
            //res1.text = resultado.toString()

            res1.text = ((num1.text.toString().toInt()) + (num2.text.toString().toInt())).toString()

        }
        boton2.setOnClickListener {
            //val resultado = (num1.text.toString().toInt()) + (num2.text.toString().toInt())
            //res1.text = resultado.toString()

            res1.text = ((num1.text.toString().toInt()) - (num2.text.toString().toInt())).toString()

        }
        boton3.setOnClickListener {
            //val resultado = (num1.text.toString().toInt()) + (num2.text.toString().toInt())
            //res1.text = resultado.toString()

            res1.text = ((num1.text.toString().toInt()) * (num2.text.toString().toInt())).toString()

        }

    }
}