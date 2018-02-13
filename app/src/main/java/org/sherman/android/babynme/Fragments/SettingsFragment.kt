package org.sherman.android.babynme.Fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.preference.EditTextPreference
import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat
import android.util.Log
import org.sherman.android.babynme.Data.DEBUG
import org.sherman.android.babynme.R


/**
 * Created by fyi2 on 2/10/18.
 */
class SettingsFragment: PreferenceFragmentCompat(), SharedPreferences.OnSharedPreferenceChangeListener {
    val mContext = context

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.pref_baby)
        val sharedPreferences: SharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(activity.applicationContext)
        onSharedPreferenceChanged(sharedPreferences, "baby_name")
        onSharedPreferenceChanged(sharedPreferences, "baby_dob")
        onSharedPreferenceChanged(sharedPreferences, "mum_age")

    }

    override fun onResume() {
        super.onResume()
        preferenceScreen.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
        //activity.getSharedPreferences(context.packageName, Context.MODE_PRIVATE).registerOnSharedPreferenceChangeListener(this)
    }

    override fun onPause() {
        super.onPause()
        preferenceScreen.sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
        //activity.getSharedPreferences(context.packageName,Context.MODE_PRIVATE).unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(p0: SharedPreferences?, key: String?) {
        Log.d(DEBUG, "Ospc called")

        val pref: Preference = findPreference(key)
        val etp: EditTextPreference = pref as EditTextPreference
        pref.setSummary(etp.text)

    }

}