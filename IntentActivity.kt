package com.example.intentcalcwebview


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btn_menu1.setOnClickListener {
            val menuLnk = Intent(this, MainActivity::class.java)
            startActivity(menuLnk)
        }
        btn_sms.setOnClickListener {
            sendSMS("0708298773", "Good morning")
        }
        btn_share.setOnClickListener {
            share("Hello World!")
        }
        btn_call.setOnClickListener {
            makeCall("0708298773")
        }
        btn_email.setOnClickListener {
            email("billrogers908@gmail.com", "BUSINESS MEETING", "Dear sir/madam....")
        }
        btn_stk.setOnClickListener {
            val simToolKitLaunchIntent = this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk")
            if (simToolKitLaunchIntent != null) {
                startActivity(simToolKitLaunchIntent)
            }
        }
    }
}