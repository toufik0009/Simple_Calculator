package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btnAdd
import kotlinx.android.synthetic.main.activity_main.btnDiv
import kotlinx.android.synthetic.main.activity_main.btnMinas
import kotlinx.android.synthetic.main.activity_main.btnMul
import kotlinx.android.synthetic.main.activity_main.edtNo1
import kotlinx.android.synthetic.main.activity_main.edtNo2


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //Plus
        btnAdd.setOnClickListener{
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                val sum = no1 + no2

                var tvView :TextView = findViewById(R.id.tvView)
                tvView.text = "$sum"


            }else{
                Toast.makeText(this,"Please Fill The required Blanks",Toast.LENGTH_LONG).show();
            }
        }

        //Minas
        btnMinas.setOnClickListener{
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var sub: Int = 0

                sub = if(no1>no2){
                    no1-no2

                }else{
                    no2-no1
                }
                var tvView :TextView = findViewById(R.id.tvView)
                tvView.text = "$sub "
            }else{
                Toast.makeText(this,"Please Fill The required Blanks",Toast.LENGTH_LONG).show();
            }
        }

        //Mul
        btnMul.setOnClickListener{
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                val mul=no1 * no2
                var tvView :TextView = findViewById(R.id.tvView)
                tvView.text = "$mul"
            }else{
                Toast.makeText(this,"Please Fill The required Blanks",Toast.LENGTH_LONG).show();
            }
        }

        //Div
        btnDiv.setOnClickListener{
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                var div: Int
                div = 0
                if(no2==0){
                    Toast.makeText(this,"a Value can't by Divided by Zero",Toast.LENGTH_LONG).show();
                }else{
                    div = no1 / no2
                }

                var tvView :TextView = findViewById(R.id.tvView)
                tvView.text = "$div "
            }else{
                Toast.makeText(this,"Please Fill The required Blanks",Toast.LENGTH_LONG).show();
            }
        }
    }
}
