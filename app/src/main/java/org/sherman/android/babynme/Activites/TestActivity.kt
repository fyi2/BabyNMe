package org.sherman.android.babynme.Activites

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import org.sherman.android.babynme.R

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        title = "Test Activities"
    }

    fun home(view: View){
        finish()
    }

    fun resetSharedPreferences(view: View){
        val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        sharedPreferences.edit().clear().apply()
    }
}
