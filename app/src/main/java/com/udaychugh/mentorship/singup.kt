package com.udaychugh.mentorship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast

class singup : AppCompatActivity() {

    lateinit var studentEmail : EditText
    lateinit var studentPassword : EditText
    private lateinit var studentSignup : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)

        studentEmail=findViewById(R.id.studentemail)
        studentPassword=findViewById(R.id.studentpassword)
        studentSignup=findViewById(R.id.studentlogin)

        studentSignup.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val mail: String = studentEmail.text.toString().trim()
                val password: String = studentPassword.text.toString().trim()

                if (mail.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(applicationContext, "All Fields are Required", Toast.LENGTH_SHORT).show()
                }
                else if (mail == "udaychugh@studentship.com" && password == "udaychugh")
                {
                    val intent= Intent(this@singup, feed_section::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }

        })

    }
}