package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
const val KEY_DICE2 = "dice_image2_key"
const val KEY_DICE1 = "dice_image1_key"

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    private var diceImageId = R.drawable.empty_dice
    private var diceImageId2 = R.drawable.empty_dice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        if (savedInstanceState != null) {
            diceImageId = savedInstanceState.getInt(KEY_DICE1, 0)
            diceImageId2 = savedInstanceState.getInt(KEY_DICE2, 0)
        }
        diceImage.setImageResource(diceImageId)
        diceImage2.setImageResource(diceImageId2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        /*val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }*/
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        diceImageId = getRandomDiceImage()
        diceImageId2 = getRandomDiceImage()
        diceImage.setImageResource(diceImageId)
        diceImage2.setImageResource(diceImageId2)
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun reset() {
        diceImageId = R.drawable.empty_dice
        diceImageId2 = R.drawable.empty_dice
        diceImage.setImageResource(diceImageId)
        diceImage2.setImageResource(diceImageId2)
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
    }*/
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_DICE1, diceImageId)
        outState.putInt(KEY_DICE2, diceImageId2)

    }
    }
