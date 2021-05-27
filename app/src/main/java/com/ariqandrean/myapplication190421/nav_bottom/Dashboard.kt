package com.ariqandrean.myapplication190421.nav_bottom

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.ariqandrean.myapplication190421.R
import com.ariqandrean.myapplication190421.ram.OrderRam
import kotlinx.android.synthetic.main.fragment_dashboard.*

/**
 * A simple [Fragment] subclass.
 * Use the [Dashboard.newInstance] factory method to
 * create an instance of this fragment.
 */
class Dashboard : Fragment() {

    lateinit var context: Activity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        return view
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context = requireActivity()
//        view?.findViewById<ImageView>(R.id.imageView).setOnClickListener{
//            val intent = Intent(context, OrderRam::class.java)

//            startActivity(intent)
        }
    }

