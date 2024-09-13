package com.example.learnkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setNumber()
        btnLeft.setOnClickListener{
            var leftNum = btnLeft.text.toString().toInt();
            var rightNum = btnRight.text.toString().toInt();
            if(leftNum > rightNum)
            {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
                theBackground.setBackgroundColor(Color.GREEN)
            }
            else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                theBackground.setBackgroundColor(Color.RED)
            }
            setNumber()
        }

        btnRight.setOnClickListener{
            var leftNum = btnLeft.text.toString().toInt();
            var rightNum = btnRight.text.toString().toInt();
            if(leftNum < rightNum)
            {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
                theBackground.setBackgroundColor(Color.GREEN)
            }
            else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT ).show()
                theBackground.setBackgroundColor(Color.RED)
            }
            setNumber()
        }
    }

    private fun setNumber() {
        var a = Random.nextInt(0,10);
        var b = Random.nextInt(0,10)
        while(a==b){
            b = Random.nextInt(0, 10)
        }
        btnLeft.text = a.toString();
        btnRight.text = b.toString();
        println(a)
    }
}