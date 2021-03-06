package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var box_one_text:TextView
    lateinit var box_two_text:TextView
    lateinit var box_three_text:TextView
    lateinit var box_four_text:TextView
    lateinit var box_five_text:TextView
    lateinit var constraint_layout:ConstraintLayout
    lateinit var red_button: Button
    lateinit var yellow_button: Button
    lateinit var green_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        box_one_text = findViewById<TextView>(R.id.box_one_text)
        box_two_text = findViewById<TextView>(R.id.box_two_text)
        box_three_text = findViewById<TextView>(R.id.box_three_text)
        box_four_text = findViewById<TextView>(R.id.box_four_text)
        box_five_text = findViewById<TextView>(R.id.box_five_text)
        constraint_layout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        red_button = findViewById<Button>(R.id.red_button)
        yellow_button = findViewById<Button>(R.id.yellow_button)
        green_button = findViewById<Button>(R.id.button_green)
        setListeners()
    }

    private fun setListeners(){

        val clickableViews : List<View> =
            listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,constraint_layout,red_button,yellow_button,green_button)
        for (item in clickableViews){
            item.setOnClickListener{
                makeColoured(it)
            }
        }
    }

    private fun makeColoured(view : View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }
}