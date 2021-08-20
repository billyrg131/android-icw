package com.example.intentcalcwebview

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure?")
        builder.setMessage("Do you want to close the app?")
        builder.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Calc.setOnClickListener {
            val calcLink= Intent(this, CalcActivity::class.java)
            startActivity(calcLink)
        }

        btn_intent.setOnClickListener {
            val intentLink = Intent(this, IntentActivity::class.java)
            startActivity(intentLink)
        }

        btn_web.setOnClickListener {
            val webLink = Intent(this, WebActivity::class.java)
            startActivity(webLink)
        }

        btn_dialog.setOnClickListener {
            val dialogLink = Intent(this, AlertActivity::class.java)
            startActivity(dialogLink)
        }

        btn_ltview.setOnClickListener {
            val listViewLink = Intent(this, ListActivity::class.java)
            startActivity(listViewLink)
        }
    }
}