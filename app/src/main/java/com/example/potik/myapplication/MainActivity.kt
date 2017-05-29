package com.example.potik.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val strTouched = "You hit me !!!"
    val strResetWord = "Hello World!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.text_view_1) as TextView
        textView.setOnClickListener {
            textView.setText(myFunc(textView.text as String))
            Toast.makeText(applicationContext, textView.text, Toast.LENGTH_SHORT).show()
        }

        val btn_reset = findViewById(R.id.button_1) as Button
        btn_reset.setOnClickListener {
            textView.setText(strResetWord)
        }
    }

    fun myFunc(str: String) : String {
        if (str == strTouched) {
            return strResetWord
        } else {
            return strTouched
        }
    }
}
