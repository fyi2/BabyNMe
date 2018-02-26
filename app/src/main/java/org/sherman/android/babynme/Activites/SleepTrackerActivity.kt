package org.sherman.android.babynme.Activites

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_sleep_tracker.*
import org.sherman.android.babynme.Adapters.InitialFlowAdapter
import org.sherman.android.babynme.Adapters.SleepTimeAdapter
import org.sherman.android.babynme.R

class SleepTrackerActivity : AppCompatActivity() {
    lateinit var pager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_tracker)


        // Add in the fragmentAdapter
        val adapter = SleepTimeAdapter(supportFragmentManager)
        pager = swipe_area2 as ViewPager

        pager.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
