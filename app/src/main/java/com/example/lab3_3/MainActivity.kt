package com.example.lab3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bt0(view: View){
        setText("0")
    }


    //button11.setOnClickListener { setText("0") }
    //button4.setOnClickListener { setText("4") }
    fun bt4(view: View){
        setText("4")
    }
    //button5.setOnClickListener { setText("5") }
    fun bt5(view: View){
        setText("5")
    }
    //button6.setOnClickListener { setText("6") }
    fun bt6(view: View){
        setText("6")
    }
    //button7.setOnClickListener { setText("7") }
    fun bt7(view: View){
        setText("7")
    }
    //button8.setOnClickListener { setText("8") }
    fun bt8(view: View){
        setText("8")
    }
    //button9.setOnClickListener { setText("9") }
    fun bt9(view: View){
        setText("9")
    }
    //button2.setOnClickListener { setText("2") }
    fun bt2(view: View){
        setText("2")
    }
    //button3.setOnClickListener { setText("3") }
    fun bt3(view: View){
        setText("3")
    }
    //button.setOnClickListener { setText("1") }
    fun bt(view: View){
        setText("1")
    }
    //button_delenie.setOnClickListener { setText("/") }
    fun button_delenie1(view: View){
        setText("/")
    }
    //button_minus.setOnClickListener { setText("-") }
    fun button_minus1(view: View){
        setText("-")
    }
    //button_plus.setOnClickListener { setText("+") }
    fun button_plus1(view: View){
        setText("+")
    }
    //button_umnoj.setOnClickListener { setText("*") }
    fun button_umnoj1(view: View){
        setText("*")
    }
    fun but_float(view: View) {
        setText(".")
    }




    fun button_clear1(view: View){
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text = ""
    }


    fun bt_ravno1(view: View) {
    try {
        val textView = findViewById<View>(R.id.textView) as TextView
        val ex = ExpressionBuilder(textView.text.toString()).build()
        var result = ex.evaluate()
        val for_drobn = result.toLong()
        if (result == for_drobn.toDouble())
            textView.text = for_drobn.toString()
        else
            textView.text = result.toString()

    }catch (e:Exception) {
        Log.d("Ошика", "сообщение: ${e.message}")
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text = "Деление на ноль не легитимно!"
    }
    }

    fun smena_znaka(view: View) {
        val textView = findViewById<View>(R.id.textView) as TextView
        val ex = ExpressionBuilder(textView.text.toString()).build()
        var result = ex.evaluate()
        val for_drobn = result.toLong()
        if (result == for_drobn.toDouble()){
            var for_drob = for_drobn * -1
            textView.text = for_drob.toString()}
        else{
            var resul = result * -1
            textView.text = resul.toString()}


    }
//    fun riga (textView: String) {
//        val textView1 = findViewById<View>(R.id.textView) as TextView
//
//    }


    fun setText(str:String){
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.append(str)

//        var str = textView.toString()
//        val target = ','
//        val textView1 = str.replace(target, '.')
//        textView.text = textView1
    }

//
//    fun main() {
//        val textView = findViewById<View>(R.id.textView) as TextView
//        var str = textView.toString()
//        val target = '|'
//
//        str = str.replace(target, ',')
//        println(str)    // A,B,C,D,E
//    }



//    var calkulate = "ф"
//    fun butt1(str: String) {
//        var cult_1 = "1"
//        //var calkulate =  "$calkulate $cult_1"
//        val sb = StringBuilder()
//        sb.append(calkulate).append(cult_1)
//        val calkulate = sb.toString()
//        val textView = findViewById<View>(R.id.textView) as TextView
//        textView.text = calkulate
//    }
//
//    fun butt2(str: String) {
//        var cult_2 = "2"
//        val sb = StringBuilder()
//        sb.append(calkulate).append(cult_2)
//        val calkulate = sb.toString()
//        val textView = findViewById<View>(R.id.textView) as TextView
//        textView.text = calkulate
//    }
//
//    fun butt3(str: String) {
//        var cult_3 = "3"
//        val sb = StringBuilder()
//        sb.append(calkulate).append(cult_3)
//        val calkulate = sb.toString()
//        val textView = findViewById<View>(R.id.textView) as TextView
//        textView.text = calkulate
//    }
}