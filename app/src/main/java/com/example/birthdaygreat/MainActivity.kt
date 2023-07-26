package com.example.birthdaygreat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createdbirthdaybutton.setOnClickListener {
            val name= editTextTextPersonName2.editableText.toString()

            Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
            val intent=Intent(this,birthdaygreating::class.java)
            intent.putExtra(birthdaygreating.Name_extra,name)

            startActivity(intent)
        }
    }


}
