package com.example.assign6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val M = Toast.makeText(applicationContext,"Some field is blank.", Toast.LENGTH_LONG)
        val C = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
        var CRED:Double
        var GRADE:Double
        var GPA:Double

        bcalOK.setOnClickListener(){
            if (this.subject1.text.toString() == "" || this.subject2.text.toString() == "" || this.subject3.text.toString() == "" || this.subject4.text.toString() == ""
                    || this.subject5.text.toString() == "" || this.credit1.text.toString() == "" || this.credit2.text.toString() == "" || this.credit3.text.toString() == "" ||
                    this.credit4.text.toString() == "" || this.credit5.text.toString() == "" || this.grade1.text.toString() == "" || this.grade2.text.toString() == "" ||
                    this.grade3.text.toString() == "" || this.grade4.text.toString() == "" || this.grade5.text.toString() == ""){
                M.show()
            }else{
                val cre1 = credit1.getText().toString().toDouble()
                val cre2 = credit2.getText().toString().toDouble()
                val cre3 = credit3.getText().toString().toDouble()
                val cre4 = credit4.getText().toString().toDouble()
                val cre5 = credit5.getText().toString().toDouble()
                val gra1 = grade1.getText().toString().toDouble()
                val gra2 = grade2.getText().toString().toDouble()
                val gra3 = grade3.getText().toString().toDouble()
                val gra4 = grade4.getText().toString().toDouble()
                val gra5 = grade5.getText().toString().toDouble()
                CRED = cre1 + cre2 + cre3 + cre4 + cre5
                GRADE = (gra1 * cre1) + (gra2 * cre2) + (gra3 * cre3) + (gra4 * cre4) + (gra5 * cre5)
                GPA = GRADE / CRED
                val gpa2dec = String.format("%.2f", GPA) ;
                credit.setText("$CRED")
                scg.setText("$gpa2dec")
            }
        }

        CL.setOnClickListener(){
            subject1.setText(null)
            subject2.setText(null)
            subject3.setText(null)
            subject4.setText(null)
            subject5.setText(null)
            credit1.setText(null)
            credit2.setText(null)
            credit3.setText(null)
            credit4.setText(null)
            credit5.setText(null)
            grade1.setText(null)
            grade2.setText(null)
            grade3.setText(null)
            grade4.setText(null)
            grade5.setText(null)
            credit.setText(null)
            scg.setText(null)
            C.show()
        }

    }

}