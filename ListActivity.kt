package com.example.intentcalcwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listView = findViewById<ListView>(R.id.lt_view)
        val arrNames = arrayOf("Salma", "James", "Grace")
        val nameAdapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrNames)
        listView.adapter = nameAdapter

        lt_view.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "You have clicked on the name " + arrNames[position], Toast.LENGTH_SHORT).show()
        }
    }
}