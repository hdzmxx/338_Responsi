package com.example.a338_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val data: Bundle? = intent.extras

        etnama.text = data?.get("first name").toString()
        etnama2.text = data?.get("last name").toString()
        etemail.text = data?.get("email").toString()
        etpassword.text = data?.get("password").toString()

        kembali.setOnClickListener(){
            onBackPressed()
        }
    }
}