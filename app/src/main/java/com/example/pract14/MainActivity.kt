package com.example.pract14

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var  trueButton: Button
    private lateinit var  falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.button)
        falseButton = findViewById(R.id.button2)

        trueButton.setOnClickListener{
            Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_SHORT).show()
        }
        falseButton.setOnClickListener{
            val toast = Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

    }
}