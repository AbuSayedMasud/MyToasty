package com.practice.mytosty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice.mytoasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toasty().simpleToast(this,"hello")
    }
}