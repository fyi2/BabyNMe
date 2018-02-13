package org.sherman.android.babynme.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import org.sherman.android.babynme.Fragments.BabyDobFragment
import org.sherman.android.babynme.Fragments.BabyNameFragment
import org.sherman.android.babynme.Fragments.MumAgeFragment

/**
 * Created by fyi2 on 2/11/18.
 */
class InitialFlowAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return BabyNameFragment()
            1 -> return BabyDobFragment()
            2 -> return MumAgeFragment()
        }
        return null!!
    }

    override fun getCount(): Int {
        return 3
    }
}