package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var image1 :ImageView
    lateinit var image2 :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonpress = findViewById<Button>(R.id.press_btn)
        image1=findViewById(R.id.imagev)
        image2=findViewById(R.id.imagevv)

        buttonpress.setOnClickListener {
            callme()
        }

    }

    private fun callme(){
        val randomno=(1..6).random()
        val randomno2=(1..6).random()

        val image=when(randomno){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6

            else -> R.drawable.dice_empty
        }
        val image3=when(randomno2){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6

            else -> R.drawable.dice_empty
        }
        image1.setImageResource(image)
        image2.setImageResource(image3)


    }
}