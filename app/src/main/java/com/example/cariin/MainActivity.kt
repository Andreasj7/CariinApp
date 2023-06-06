package com.example.cariin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.navigationView)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> Toast.makeText(
                    applicationContext,
                    "Clicked Home",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_sync -> Toast.makeText(
                    applicationContext,
                    "Clicked Sync",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_trash -> Toast.makeText(
                    applicationContext,
                    "Clicked Trash",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_setting -> Toast.makeText(
                    applicationContext,
                    "Clicked setting",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_login -> Toast.makeText(
                    applicationContext,
                    "Clicked login",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_share -> Toast.makeText(
                    applicationContext,
                    "Clicked share",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}