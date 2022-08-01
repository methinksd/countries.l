package com.example.countriesl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view: View){
        if (checkBox_ke.isChecked)textresult.text="Kenya: We do speak English "
        if (checkBox_ug.isChecked)textresult.text="Uganda: Yes,though we prefer our native tongue."
        if (checkBox_tz.isChecked)textresult.text="Tanzania: Yes, though we prefer Kiswahili to English."
    }
    fun onSelect(view: View){
        if (yes.isChecked)textresult1.text="Yes, I am a certified developer."
        if (no.isChecked)textresult1.text="No, I am not a certified developer."
    }
}