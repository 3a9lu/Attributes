package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: EditText = findViewById(R.id.EditText) // Получение текста

        val buttonBlackText : Button = findViewById(R.id.button_black) // Изменение цвета текста  на чёрный
        buttonBlackText.setOnClickListener {
            text.setTextColor(Color.BLACK)
        }
        val buttonRedText : Button = findViewById(R.id.button_red)  // Изменение цвета текста  на красный
        buttonRedText.setOnClickListener {
            text.setTextColor(Color.RED)
        }
        val button8SP : Button = findViewById(R.id.button_8sp)  // Изменение размера текста  на 8
        button8SP.setOnClickListener {
            text.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }
        val button24SP : Button = findViewById(R.id.button_24sp) // Изменение размера текста  на 24
        button24SP.setOnClickListener {
            text.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
        val buttonWhiteBackground : Button = findViewById(R.id.button_white) // Изменение цвета фона на белый
        buttonWhiteBackground.setOnClickListener {
            text.setBackgroundColor(Color.WHITE)
        }
        val buttonYellowBackground : Button = findViewById(R.id.button_yellow)  // Изменение цвета фона на жёлтый
        buttonYellowBackground.setOnClickListener {
            text.setBackgroundColor(Color.YELLOW)
        }
    }
}
