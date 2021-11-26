package com.udaychugh.mentorship

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class feed_section : AppCompatActivity() {

    lateinit var tabLayout : TabLayout
    //internal lateinit var mhome : TabItem
    lateinit var mvoiceroom : TabItem
    lateinit var mdoubt : TabItem
    lateinit var mcourse : TabItem
    lateinit var mprofile : TabItem
    //lateinit var pagerAdapter: PagerAdapter

    lateinit var showhome : View
    lateinit var showvoiceroom : View
    lateinit var showcourse : View
    lateinit var showdoubt : View
    lateinit var showprofile : View



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_section)

        tabLayout=findViewById(R.id.navigation)
        //mhome=findViewById(R.id.home)
        mvoiceroom=findViewById(R.id.voiceRoom)
        mdoubt=findViewById(R.id.doubt)
        mcourse=findViewById(R.id.course)
        mprofile=findViewById(R.id.profile)


        showhome=findViewById(R.id.feedsectionincluded)
        showvoiceroom=findViewById(R.id.voiceroomincluded)
        showcourse=findViewById(R.id.coursesincluded)
        showdoubt=findViewById(R.id.askdoubtincluded)
        showprofile=findViewById(R.id.profileincluded)



       /* mhome.setOnClickListener {
            showhome.visibility = View.VISIBLE
            showvoiceroom.visibility = View.INVISIBLE
            showcourse.visibility = View.INVISIBLE
            showdoubt.visibility = View.INVISIBLE
            showprofile.visibility = View.INVISIBLE
        } */

        mvoiceroom.setOnClickListener {
            showhome.visibility = View.INVISIBLE
            showvoiceroom.visibility = View.VISIBLE
            showcourse.visibility = View.INVISIBLE
            showdoubt.visibility = View.INVISIBLE
            showprofile.visibility = View.INVISIBLE
        }

        mcourse.setOnClickListener {
            showhome.visibility = View.INVISIBLE
            showvoiceroom.visibility = View.INVISIBLE
            showcourse.visibility = View.VISIBLE
            showdoubt.visibility = View.INVISIBLE
            showprofile.visibility = View.INVISIBLE
        }

        mdoubt.setOnClickListener {
            showhome.visibility = View.INVISIBLE
            showvoiceroom.visibility = View.INVISIBLE
            showcourse.visibility = View.INVISIBLE
            showdoubt.visibility = View.VISIBLE
            showprofile.visibility = View.INVISIBLE
        }

        mprofile.setOnClickListener {
            showhome.visibility = View.INVISIBLE
            showvoiceroom.visibility = View.INVISIBLE
            showcourse.visibility = View.INVISIBLE
            showdoubt.visibility = View.INVISIBLE
            showprofile.visibility = View.VISIBLE
        }









    }
}