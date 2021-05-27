package com.ariqandrean.myapplication190421.ram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ariqandrean.myapplication190421.R
import kotlinx.android.synthetic.main.activity_order_ram.*

class OrderRam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_ram)

        supportActionBar!!.setTitle("RAM")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val arrayItem = ArrayList<OrderRamData>()
        arrayItem.add(OrderRamData(R.drawable.dominator_plat_rgb_white01, "DOMINATOR® WHITE RGB 16GB (2 x 8GB) DDR4 DRAM 4000MHz C19 Memory Kit — White","""Fan Included No
        Memory Series DOMINATOR PLATINUM RGB
        Memory Type DDR4
        Memory Size 16GB Kit (2 x 8GB)
        Tested Latency 16-18-18-36
        Tested Voltage 1.35V
        Tested Speed 3200MHz""".trimIndent(), 2409000))
        arrayItem.add(OrderRamData(R.drawable.corsair_dominator_platinum, "DOMINATOR® PLATINUM RGB 16GB (2 x 8GB) DDR4 DRAM 4000MHz C19 Memory Kit — White", """
        Fan Included No
        Memory Series DOMINATOR PLATINUM RGB
        Memory Type DDR4
        Memory Size 16GB Kit (2 x 8GB)
        Tested Latency 16-18-18-36
        Tested Voltage 1.35V
        Tested Speed 3200MHz
        """.trimIndent(), 2409000))
        arrayItem.add(OrderRamData(R.drawable.corsair_vengeance_lpx_32gb_2x16gb, "CMK8GX4M1A2666C16 Vengeance LPX 8GB 1x8GB DDR4", """  Warranty
        Limited Lifetime
        Fan Included
        No
        Heat Spreader
        Vengeance LPX
        Memory Configuration
        Dual / Quad Channel
        Memory Series
        Vengeance
        Memory Type
        DDR4
        """.trimIndent(), 849000) )


        var myAdapter = OrderRamAdapter(arrayItem, this)

        Ram.layoutManager = LinearLayoutManager(this)
        Ram.adapter = myAdapter
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