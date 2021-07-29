package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BcardActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_exta"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bcard)

        val bCardName = intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.greetingName).text = "Happy Birthday\n$bCardName"
    }
}