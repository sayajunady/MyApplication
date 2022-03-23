package com.sayajunady.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSatu: Button = findViewById(R.id.btn_1)
        btnSatu.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}