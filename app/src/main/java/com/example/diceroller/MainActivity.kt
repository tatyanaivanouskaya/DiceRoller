package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val imageView: ImageView = findViewById(R.id.imageView)
        val imageView2: ImageView = findViewById(R.id.imageView2)

        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when(diceRoll2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        /**/
        /**/
        imageView.setImageResource(drawableResource)
        imageView.contentDescription = diceRoll.toString()
        imageView2.setImageResource(drawableResource2)
        imageView2.contentDescription = diceRoll2.toString()


    }
}