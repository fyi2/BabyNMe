package org.sherman.android.babynme.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import org.sherman.android.babynme.Fragments.*

/**
 * Created by fyi2 on 2/14/18.
 */
class SleepTimeAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return BabySleepTimeFragment()
            1 -> return BabyDurationFragment()
            2 -> return MumAgeFragment()
        }
        return null!!
    }

    override fun getCount(): Int {
        return 3
    }
}