package com.example.birthdaygreat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreat.birthdaygreating
import kotlinx.android.synthetic.main.activity_birthdaygreating.*

class birthdaygreating : AppCompatActivity() {
    companion object{
        const val Name_extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreating)

        val name = intent.getStringExtra(Name_extra)
        birthdaygreating.text="happy birthday $name"
    }
}