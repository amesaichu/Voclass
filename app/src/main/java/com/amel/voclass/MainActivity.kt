package com.amel.voclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button_sel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.b_senin)
        button_sel = findViewById(R.id.b_selasa)

        button.setOnClickListener{
            startActivity(Intent(this, tabel_senin::class.java))
        }

        button_sel.setOnClickListener{
            startActivity(Intent(this, tabel_selasa::class.java))
        }

    }
}
