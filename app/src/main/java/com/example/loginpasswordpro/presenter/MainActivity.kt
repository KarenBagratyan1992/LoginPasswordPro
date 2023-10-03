package com.example.loginpasswordpro.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpasswordpro.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportFragmentManager.beginTransaction().add(R.id.fragment_container,LoginFragment()).commit()
    }
}