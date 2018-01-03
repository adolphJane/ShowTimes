package com.magicalrice.showtimes.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.magicalrice.showtimes.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test(3,5)
    }

    fun test(a:Int,b:Int){
        val max = if (a > b) a else b

        Log.e("Max", max.toString())
    }

    class Customer constructor()
}
