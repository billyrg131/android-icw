package com.example.intentcalcwebview

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_alert.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert

class AlertActivity : AppCompatActivity() {

    fun alertClick(){
        val dlg = AlertDialog.Builder(this)
        dlg.setTitle("ALERT")
        dlg.setMessage("Do you really want to quit this activity?")
        dlg.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        dlg.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        dlg.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        btn_alert.setOnClickListener {
            alertClick()
        }
        btn_menu3.setOnClickListener {
            val alertLink = Intent(this, MainActivity::class.java)
            startActivity(alertLink)
        }
    }
}












/*val dialog = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.activity_alert,null)

        val et_number = dialogView.findViewById<EditText>(R.id.et_number)
        dialog.setView(dialogView)
        dialog.setCancelable(true)
        dialog.setPositiveButton("validate", { dialogInterface: DialogInterface, i: Int -> })
        val customDialog = dialog.create()
        customDialog.show()
        customDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
            if (et_number.text.length > 5){
                customDialog.dismiss()
            } else{
                Toast.makeText(baseContext, "Number not valid", Toast.LENGTH_SHORT ).show()
            }
        }*/
