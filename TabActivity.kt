
package com.example.intentcalcwebview

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.intentcalcwebview.fragments.FavoritesFragment
import com.example.intentcalcwebview.fragments.HomeFragment
import com.example.intentcalcwebview.fragments.SettingsFragment
import com.example.intentcalcwebview.fragments.adapters.VPAdapter
import kotlinx.android.synthetic.main.activity_tab.*
import kotlinx.android.synthetic.main.fragment_home.*

class TabActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val alt = AlertDialog.Builder(this)
        alt.setTitle("Quittiing TabActivity")
        alt.setMessage("Do you want to quit?")
        alt.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        alt.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        alt.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)
        setTabs()

    }
    private fun setTabs(){
        val adapter = VPAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoritesFragment(), "Favorites")
        adapter.addFragment(SettingsFragment(), "Settings")
        viewPager.adapter = adapter

        tab.setupWithViewPager(viewPager)
        tab.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_favorite)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_settings)

    }
}