package com.example.a338_responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {
    val id:Int = 10
    val language:String = "kotlin"

    private lateinit var edNama: EditText
    private lateinit var nama: String
    private lateinit var edNama2: EditText
    private lateinit var nama2: String
    private lateinit var edEmail: EditText
    private lateinit var email: String
    private lateinit var edPassword: EditText
    private lateinit var password: String


    private lateinit var btnregister: Button
    private lateinit var register: String
    private lateinit var btnLogin: Button
    private lateinit var Login: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edNama = findViewById(R.id.nama)
        edNama2 = findViewById(R.id.nama2)
        edEmail = findViewById(R.id.inputEmail)
        edPassword = findViewById(R.id.inputPassword)
        btnregister = findViewById(R.id.btnregister)
        btnLogin = findViewById(R.id.btnLogin)

        btnregister.setOnClickListener {
            nama = edNama.getText().toString()
            nama2 = edNama2.getText().toString()
            email = edEmail.getText().toString()
            password = edPassword.getText().toString()

            val intent = Intent(this, Register::class.java)

            intent.putExtra("first name", nama)
            intent.putExtra("last name", nama2)
            intent.putExtra("email", email)
            intent.putExtra("password", password)

            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language_value", language)
        }
        }
}