package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGenerate(view: View) {
        val input = findViewById<EditText>(R.id.editTextTextPersonName).editableText.toString()
        val intent = Intent(this, BcardActivity::class.java)
        intent.putExtra(BcardActivity.NAME_EXTRA,input)
        Toast.makeText(this,"Name Entered $input", Toast.LENGTH_LONG).show()
        startActivity(intent)

    }
}