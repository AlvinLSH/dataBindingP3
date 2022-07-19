package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    var student :Student = Student("Alvin", "RSF")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSetData.setOnClickListener() {
            binding.myStudent = student
            // binding.tvName.text = "Alvin"
            // binding.tvPrgm.text = "RSF"
        }

        binding.btnChgValue.setOnClickListener() {
            student.programme = "RIT"
            binding.invalidateAll()
        }

    }
}