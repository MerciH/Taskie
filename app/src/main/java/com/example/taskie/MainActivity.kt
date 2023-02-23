package com.example.taskie

import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}


import android.os.Bundle
import android.view.View
import android.widget.*

/**
 * A Login Form Example in Kotlin Android
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var etusername = findViewById<EditText>(R.id.et_user_name)
        var etpassword = findViewById<EditText>(R.id.et_password)
        var btnlogin = findViewById<Button>(R.id.btn_login)

        // set on-click listener
        btnlogin.setOnClickListener {
            val username = etusername.text;
            val password = etpassword.text;
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }
}