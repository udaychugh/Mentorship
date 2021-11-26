package com.udaychugh.mentorship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast

class login : AppCompatActivity() {

    lateinit var mentorEmail : EditText
    lateinit var mentorPassword : EditText
    private lateinit var mentorSignup : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mentorEmail=findViewById(R.id.mentoremail)
        mentorPassword=findViewById(R.id.mentorpassword)
        mentorSignup=findViewById(R.id.mentorlogin)

        mentorSignup.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val mail: String = mentorEmail.text.toString().trim()
                val password: String = mentorPassword.text.toString().trim()

                if (mail.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(applicationContext, "All Fields are Required", Toast.LENGTH_SHORT).show()
                }
                else if (mail == "udaychugh@mentorship.com" && password == "udaychugh")
                {
                    val intent = Intent(this@login, feed_section::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }

        })
    }
}