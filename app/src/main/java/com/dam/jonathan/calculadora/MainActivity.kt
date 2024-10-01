package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private var displayText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.TEXT)
    }

    fun numeros(view: View) {
        Log.i("Etiqueta", view.tag.toString())
        displayText += view.tag.toString()
        myTextView.text = displayText
    }
}
