package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        /*val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)*/

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,boxSixText,
                boxSevenText, boxEightText, boxNineText,boxTenText
                /*redButton, greenButton, yellowButton*/
            )


        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_seven_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_eight_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_nine_text -> view.setBackgroundColor(Color.RED)
            R.id.box_ten_text -> view.setBackgroundColor(Color.CYAN)

            /*// Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)*/

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    /*private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.flor1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.flor2)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.flor3)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.flor4)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.flor5)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }*/


}