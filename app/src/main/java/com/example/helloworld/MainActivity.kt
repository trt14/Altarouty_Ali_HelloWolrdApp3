package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    lateinit var myText:TextView
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var input1:TextInputEditText
    lateinit var input2:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText=findViewById(R.id.txtv)
        btn1=findViewById(R.id.btnCalc)
        btn2=findViewById(R.id.btnReset)
        input1=findViewById(R.id.num1)
        input2=findViewById(R.id.num2)

        btn1.setOnClickListener { calc(input1.inputType,input2.inputType) }


    }

    fun calc(num1:Int,num2:Int):TextView{
        var sum:Int=num1+num2
        if(sum<=10){
            Log.d("Calc", "This is Sum of $num1+$num2=$sum ,less than 10")
            myText.text="This is Sum of $num1+$num2=$sum ,less than 10"

        }else{
            Log.d("Calc", "This is Sum of $num1+$num2=$sum ,greater than 10")
            myText.text="This is Sum of $num1+$num2=$sum ,greater than 10"

        }
        return myText
    }

}