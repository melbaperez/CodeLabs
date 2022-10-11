package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        /*val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }*/

    }

    private fun rollDice() {
    val randomInt = (1..6).random()
    //Toast.makeText(this, "button clicked",
    //Toast.LENGTH_SHORT).show()
    val diceImage: ImageView = findViewById(R.id.dice_image)
    val drawableResource = when (randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage.setImageResource(drawableResource)
    }

    /*private fun countUp() {
    val resultText: TextView = findViewById(R.id.result_text)
    if (resultText.text.toString() == "Hello World!"){
        resultText.text = "1"
    }
    else{
        if (resultText.text.toString() != "6"){
            var resultInt = resultText.text.toString().toInt()
            resultInt++
            resultText.text = resultInt.toString()
        }
    }
    }

    private fun reset() {
    val resultText: TextView = findViewById(R.id.result_text)
    resultText.text = "0"
    }*/
    }