package com.udaychugh.mentorship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity2 : AppCompatActivity() {

    lateinit var gotomentorLogin : RelativeLayout
    lateinit var gotostudentLogin : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        gotomentorLogin=findViewById(R.id.loginasmentor)
        gotostudentLogin=findViewById(R.id.loginasstudent)

        gotomentorLogin.setOnClickListener {
            val intent = Intent(this@MainActivity2, login::class.java)
            startActivity(intent)
            finish()
        }

        gotostudentLogin.setOnClickListener {
            val intent = Intent(this@MainActivity2, singup::class.java)
            startActivity(intent)
            finish()
        }

    }
}