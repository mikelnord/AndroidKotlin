package com.gb.androidkotlin.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    private lateinit var textName: TextView
    private lateinit var textAge: TextView
    private val arrayOfString = listOf("one", "two", "three", "four", "five")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val piter = MyDataClass("Piter", 32)

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        
        textName = findViewById(R.id.textView)
        textAge = findViewById(R.id.textView2)
        textName.text = Santa.pit.name
        textAge.text = Santa.pit.age.toString()

        button.setOnClickListener {
            textAge.text = piter.age.toString()
            textName.text = piter.name
        }
        button2.setOnClickListener {
            Santa.pit = piter
            textAge.text = Santa.pit.age.toString()
            textName.text = Santa.pit.name
        }
        button3.setOnClickListener {
            for(str in arrayOfString){
                println(str)
            }
            println("---------------------")
            for(i in 0..4){
                println(arrayOfString[i])
            }
            println("---------------------")
            for(i in 4 downTo 0){
                println(arrayOfString[i])
            }
            println("---------------------")
            for(i in 0 until arrayOfString.size){
                println(arrayOfString[i])
            }
        }
    }
}