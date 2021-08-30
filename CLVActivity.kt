package com.example.intentcalcwebview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class CLVActivity : AppCompatActivity() {
    override fun onBackPressed() {
       var alt = AlertDialog.Builder(this)
        alt.setTitle("Quitting CustomListView")
        alt.setMessage("Do you want to quit?")
        alt.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        alt.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        alt.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clvactivity)

        var lView = findViewById<ListView>(R.id.Lview1)
        var list = mutableListOf<Model>()

        list.add(Model("Facebook Image", "Facebook Description", R.drawable.facebook))
        list.add(Model("LinkedIn Image", "LinkedIn Description", R.drawable.linkedin))
        list.add(Model("Snapchat Logo", "Snapchat Description", R.drawable.snapchat))
        list.add(Model("Twitter Logo", "Twitter Description", R.drawable.twitter))
        list.add(Model("Whatsapp Logo", "Whatsapp Description", R.drawable.whatsapp))
        list.add(Model("Play Store Logo", "Play Store Description", R.drawable.playstore))
        list.add(Model("Android Studio Logo", "Android Studio Description", R.drawable.androidstudio))
        list.add(Model("App Store Logo", "App Store Description", R.drawable.appstore))
        list.add(Model("FB Messenger Logo", "FB Messenger Description", R.drawable.fbmessenger))


        lView.adapter = Adapter(this, R.layout.row, list)

        lView.setOnItemClickListener { adapterView, view, i, l ->
            if (i==0){
                Toast.makeText(this, "You have clicked on Facebook", Toast.LENGTH_SHORT).show()
            }
            if (i==1){
                Toast.makeText(this, "You have clicked on LInkedIn", Toast.LENGTH_SHORT).show()
            }
            if (i==2){
                Toast.makeText(this, "You have clicked on Snapchat", Toast.LENGTH_SHORT).show()
            }
            if (i==3){
                Toast.makeText(this, "You have clicked on Twitter", Toast.LENGTH_SHORT).show()
            }
            if (i==4){
                Toast.makeText(this, "You have clicked on WhatsApp", Toast.LENGTH_SHORT).show()
            }
            if (i==5){
                Toast.makeText(this, "You have clicked on Play Store", Toast.LENGTH_SHORT).show()
            }
            if (i==6){
                Toast.makeText(this, "You have clicked on Android Studio", Toast.LENGTH_SHORT).show()
            }
            if (i==7){
                Toast.makeText(this, "You have clicked on App Store", Toast.LENGTH_SHORT).show()
            }
            if (i==8){
                Toast.makeText(this, "You have clicked on FB Messenger", Toast.LENGTH_SHORT).show()
            }
        }
    }
}