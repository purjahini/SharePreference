package com.bedev.sharepreference

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tnama: EditText = findViewById(R.id.EtSesion)
        var session = SharePref(this.applicationContext)



        val btnSave: Button = findViewById(R.id.BtnSave)
        val btnLihat: Button = findViewById(R.id.BtnCek)
        val btnHapus: Button = findViewById(R.id.BtnHapus)
        val btnNext: Button = findViewById(R.id.BtnNext)

        btnSave.setOnClickListener {
            val nama = tnama.text.toString()
            session.nama = nama
            tnama.setText("")
            Toast.makeText(this, "Session Tersimpan", Toast.LENGTH_LONG).show()
        }

        btnLihat.setOnClickListener {
            val nama = session.nama
            tnama.setText(nama)
        }

        btnHapus.setOnClickListener {
            session.nama = ""
            tnama.setText("")
            Toast.makeText(this, "Session Terhapus", Toast.LENGTH_SHORT).show()
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, Kotlin_Ui::class.java)
            startActivity(intent)
        }
    }

}
