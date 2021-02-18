package com.example.myapplication

import android.content.ContentValues.TAG
import android.util.Log

class question1 {
    var x : String = "hello World"
    fun printX(){
        println(x)
    }
    val obj = question1()

    init {
        obj.printX()
        Log.d(TAG, "hello: ")
    }
}
