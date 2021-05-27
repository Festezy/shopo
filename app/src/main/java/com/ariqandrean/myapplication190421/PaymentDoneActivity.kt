package com.ariqandrean.myapplication190421

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ariqandrean.myapplication190421.ram.OrderRam
import kotlinx.android.synthetic.main.activity_payment_done.*

class PaymentDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_done)

        supportActionBar!!.setTitle("Succes")

        btnSeleai.setOnClickListener{
            val intent = Intent(this, OrderRam::class.java)
            startActivity(intent)
        }
    }
}