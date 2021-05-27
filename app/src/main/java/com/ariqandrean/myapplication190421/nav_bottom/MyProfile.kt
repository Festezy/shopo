package com.ariqandrean.myapplication190421.nav_bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ariqandrean.myapplication190421.R
import com.ariqandrean.myapplication190421.databinding.FragmentMyProfileBinding
import kotlinx.android.synthetic.main.fragment_my_profile.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MyProfile.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate fragment
        val view = inflater.inflate(R.layout.fragment_my_profile, container, false)
        val tvmy = view.findViewById<TextView>(R.id.tv_myprof)

        tvmy.text = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"

        return view
    }

}