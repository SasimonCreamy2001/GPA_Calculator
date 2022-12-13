package com.example.gpacalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener {
            var subject1 = sub1.text.toString()
            var credit_1 = cre1.text.toString()
            var point_1 = p1.text.toString()

            var subject2 = sub2.text.toString()
            var credit_2 = cre2.text.toString()
            var point_2 = p2.text.toString()

            var subject_3 = sub3.text.toString()
            var credit_3 = cre3.text.toString()
            var point_3 = p3.text.toString()

            var subject_4 = sub4.text.toString()
            var credit_4 = cre4.text.toString()
            var point_4 = p4.text.toString()

            var subject_5 = sub5.text.toString()
            var credit_5 = cre5.text.toString()
            var point_5 = p5.text.toString()
            if (subject1 == "" || credit_1 == ""|| point_1 == ""|| subject2 == "" || credit_2 == ""|| point_2 == ""|| subject_3 == "" || credit_3 == ""|| point_3 == ""
                || subject_4 == "" || credit_4 == ""|| point_4 == ""|| subject_5 == "" || credit_5 == ""|| point_5 == "") {
                toast {
                    "Please Input All Text Box Before Press OK !!!"
                }
            } else if (credit_1.toInt() > 3 || credit_2.toInt() > 3 || credit_3.toInt() > 3 || credit_4.toInt() >3 || credit_5.toInt() > 3){
                toast {
                    "Please Input Credit < 3 !!!"
                }
            } else{
                var sumcredit = credit_1.toInt() + credit_2.toInt() + credit_3.toInt() + credit_4.toInt() + credit_5.toInt()
                total.setText("$sumcredit")
                var cxd1 = credit_1.toDouble() * point_1.toDouble()
                var cxd2 = credit_2.toDouble() * point_2.toDouble()
                var cxd3 = credit_3.toDouble() * point_3.toDouble()
                var cxd4 = credit_4.toDouble() * point_4.toDouble()
                var cxd5 = credit_5.toDouble() * point_5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd / sumcredit
                val c = "%.2f".format(grade)
                gpa.setText("$c")

            }
        }
        clear.setOnClickListener {
            sub1.setText("")
            cre1.setText("")
            p1.setText("")

            sub2.setText("")
            cre2.setText("")
            p2.setText("")

            sub3.setText("")
            cre3.setText("")
            p3.setText("")

            sub4.setText("")
            cre4.setText("")
            p4.setText("")

            sub5.setText("")
            cre5.setText("")
            p5.setText("")
        }

    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
}