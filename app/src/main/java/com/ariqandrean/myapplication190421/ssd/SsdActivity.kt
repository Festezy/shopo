package com.ariqandrean.myapplication190421.ssd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ariqandrean.myapplication190421.R

class SsdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ssd)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}