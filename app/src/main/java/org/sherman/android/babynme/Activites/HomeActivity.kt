package org.sherman.android.babynme.Activites

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import org.sherman.android.babynme.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onResume() {
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val babyName:String = sharedPreferences.getString("baby_name", "Baby")
        title = babyName+" 'n Me"

        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            (R.id.menu_settings)-> {
                loadSettings()
            }
            else -> {
                loadSettings()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun loadSettings(){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}
