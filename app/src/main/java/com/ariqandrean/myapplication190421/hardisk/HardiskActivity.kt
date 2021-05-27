package com.ariqandrean.myapplication190421.hardisk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ariqandrean.myapplication190421.R

class HardiskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hardisk)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}