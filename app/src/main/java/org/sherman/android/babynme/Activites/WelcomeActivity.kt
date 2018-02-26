package org.sherman.android.babynme.Activites

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v4.view.ViewPager
import android.view.View
import kotlinx.android.synthetic.main.activity_welcome.*
import kotlinx.android.synthetic.main.fragment_baby_dob.*
import kotlinx.android.synthetic.main.fragment_baby_name.*
import kotlinx.android.synthetic.main.fragment_mum_age.*
import org.sherman.android.babynme.Adapters.InitialFlowAdapter
import org.sherman.android.babynme.R

class WelcomeActivity : AppCompatActivity() {
    lateinit var pager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        // Add in the fragmentAdapter
        val adapter = InitialFlowAdapter(supportFragmentManager)
        pager = swipe_area as ViewPager

        pager.adapter = adapter
        adapter.notifyDataSetChanged()
    }
    fun loadDob(view: View){
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        sharedPreferences.edit().putBoolean("first_time",false).apply()
        val babyName:String = etBabyName.text.toString()
        sharedPreferences.edit().putString("baby_name", babyName).apply()

        pager.setCurrentItem(1,true)
    }
    fun loadAge(view: View){
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val babyDob:String = etBabyDob.text.toString()
        sharedPreferences.edit().putString("baby_dob", babyDob).apply()

        pager.setCurrentItem(2,true)
    }

    fun homeScreen(view: View){
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val mumAge = etMumAge.text.toString()
        sharedPreferences.edit().putString("mum_age", mumAge).apply()

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
