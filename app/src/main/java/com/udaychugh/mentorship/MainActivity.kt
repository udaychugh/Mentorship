package com.udaychugh.mentorship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )//set flag ends here

        val isFirstRun: Boolean = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true)



        Handler().postDelayed({
            if (isFirstRun){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
            else {
                val intent = Intent(this, feed_section::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000) // intent function ends here


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).apply()


    }
}