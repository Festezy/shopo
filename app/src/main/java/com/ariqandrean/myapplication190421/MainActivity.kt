package com.ariqandrean.myapplication190421

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ariqandrean.myapplication190421.nav_bottom.Dashboard
import com.ariqandrean.myapplication190421.nav_bottom.MyProfile
import com.ariqandrean.myapplication190421.nav_bottom.Notifikasi
import com.ariqandrean.myapplication190421.ram.OrderRam
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //inisialisasi the NavigationBottomBars
    private lateinit var bottomNavigation: BottomNavigationView

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
        replace(R.id.fragmentContainer, fragment)
        commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "SHOPO"

        // nav_bottom fragment
        val firstFragment = Dashboard()
        val secondFragment = Notifikasi()
        val thirdFragment = MyProfile()
        setCurrentFragment(firstFragment)

        bottomNavigation = findViewById(R.id.navBottom)
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_dashboard -> setCurrentFragment(firstFragment)
                R.id.navigation_notifikasi -> setCurrentFragment(secondFragment)
                R.id.navigation_profile -> setCurrentFragment(thirdFragment)
            }
            true
        }
    }

//    fun RamOnClick(view: View) {
//        val intent = Intent(this, OrderRam::class.java)
//        startActivities(arrayOf(intent))
//    }

    // call inflate toolbar Menu to Main Activity
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

}
