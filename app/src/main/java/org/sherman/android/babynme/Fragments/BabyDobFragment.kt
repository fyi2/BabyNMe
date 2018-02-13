package org.sherman.android.babynme.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.sherman.android.babynme.R


/**
 * A simple [Fragment] subclass.
 */
class BabyDobFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_baby_dob, container, false)
    }

}// Required empty public constructor
