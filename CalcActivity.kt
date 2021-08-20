package com.example.intentcalcwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        btn_menu.setOnClickListener {
            val menuLink = Intent(this, MainActivity::class.java)
            startActivity(menuLink)
        }

        btn_add.setOnClickListener {
            val num1 = input_num1.text.toString()
            val num2 = input_num2.text.toString()

            if(num1.isEmpty() or  num2.isEmpty()){
                answer.text= "Fill in the details"
            } else{
                var answ = num1.toDouble() + num2.toDouble()
                answer.text = answ.toString()
            }
        }

        btn_minus.setOnClickListener {
            val num1 = input_num1.text.toString()
            val num2 = input_num2.text.toString()

            if(num1.isEmpty() or  num2.isEmpty()){
                answer.text = "Fill in the details"
            }else{
                var answ = num1.toDouble() - num2.toDouble()
                answer.text = answ.toString()
            }
        }
        btn_divide.setOnClickListener {
            val num1 = input_num1.text.toString()
            val num2 = input_num2.text.toString()

            if(num1.isEmpty() or  num2.isEmpty()){
                answer.text = "Fill in the details."
            }else{
                var answ = num1.toDouble() / num2.toDouble()
                answer.text = answ.toString()
            }
        }
        btn_multiply.setOnClickListener {
            val num1 = input_num1.text.toString()
            val num2 = input_num2.text.toString()

            if(num1.isEmpty() or  num2.isEmpty()){
                answer.text = "Fill in the details"
            }else{
                var answ = num1.toDouble() * num2.toDouble()
                answer.text = answ.toString()
            }
        }
        btn_mod.setOnClickListener {
            var num1 = input_num1.text.toString()
            var num2 = input_num2.text.toString()

            if(num1.isEmpty() or  num2.isEmpty()){
                answer.text = "Fill in the details"
            }else{
                var answ = num1.toDouble() % num2.toDouble()
                answer.text = answ.toString()
            }
        }
        btn_clr.setOnClickListener {
            var num1 = input_num1.text.toString()
            var num2 = input_num2.text.toString()

            var answ = num1.toDouble() % num2.toDouble()
            answer.text = answ.toString()
            answer.text = answ.toString()

            if (answer.text.isNotEmpty()){
                answer.text = " "
            }
        }
    }
}