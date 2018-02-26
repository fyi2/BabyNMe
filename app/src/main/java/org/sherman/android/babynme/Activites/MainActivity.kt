package org.sherman.android.babynme.Activites

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import io.realm.Realm
import org.sherman.android.babynme.Data.SHARED_PREFERENCE
import org.sherman.android.babynme.R

class MainActivity : AppCompatActivity() {
    lateinit var realm:Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val babyName:String = sharedPreferences.getString("baby_name", "Baby")
        sharedPreferences.edit().putString("baby_name", babyName).apply()
        realm = Realm.getDefaultInstance()


    }

    override fun onResume() {
        super.onResume()
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val babyName:String = sharedPreferences.getString("baby_name", "Baby")
        title = babyName+" 'n Me"

    }

    override fun onDestroy() {
        realm.close()
        super.onDestroy()
    }

    fun test(view: View){
        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
    }


    fun nextStep(view: View){
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        if(sharedPreferences.getBoolean("first_time",true)) {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
