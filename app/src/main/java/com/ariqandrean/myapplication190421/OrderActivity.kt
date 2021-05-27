package com.ariqandrean.myapplication190421

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.ariqandrean.myapplication190421.ram.OrderRam
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    var totHarga: Int = 0
    var minteger: Int = 0
    var MIN_NUMBER = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        var intent = intent
        val giImage = intent.getIntExtra("iImg", 0)
        val giNmMerkRam = intent.getStringExtra("iNmMerkRam")
        val giDescRam = intent.getStringExtra("iDescRam")
        val giHrgRam = intent.getIntExtra("iHrgRam", 0)

        actionBar.setTitle("Order " +giNmMerkRam)
        NamaBrgOrder.text = giNmMerkRam
        descOrd.text = giDescRam
        HargaOrd.text = giHrgRam.toString()
        imageOrd.setImageResource(giImage)

        fun display(number: Int){
            val displayInteger = findViewById<View>(R.id.JmlOrd) as TextView

            displayInteger.text = "" + number

            totHarga = HargaOrd.text.toString().toInt() * displayInteger.text.toString().toInt()
            TotHarOrd.text = totHarga.toString()

        }

        decreaseOrd.setOnClickListener(){
            if (minteger == MIN_NUMBER){
                minteger = 0
            } else {
                minteger = minteger - 1
                display(minteger)
            }
        }
        increaseOrd.setOnClickListener(){
            minteger = minteger + 1
            display(minteger)
        }
        OrderLagi.setOnClickListener{
            var intent = Intent(this, OrderRam::class.java)
            startActivities(arrayOf(intent))
        }
        Bayar.setOnClickListener(){
            var nmBrgOrder = NamaBrgOrder.text.toString()
            var jmlOrder = JmlOrd.text.toString()
            var totHarga = TotHarOrd.text.toString()

            var intent = Intent(this, PaymentActivity::class.java)
            intent.putExtra("i_NamaBrg", nmBrgOrder)
            intent.putExtra("i_JumlOrder", jmlOrder)
            intent.putExtra("i_Totharga", totHarga)
            startActivities(arrayOf(intent))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
    //Clicked item toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.nav_search){
            Toast.makeText(this, "Search Clicked",
                Toast.LENGTH_SHORT).show()
            return true
        }
        else if (id == R.id.nav_shoppingCart){
            Toast.makeText(this, "Go to shopping car",
                Toast.LENGTH_SHORT).show()
            return true
        }
        else if (id == R.id.nav_chat){
            Toast.makeText(this, "Go to Chat",
                Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


