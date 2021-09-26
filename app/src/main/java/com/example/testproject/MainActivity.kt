package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testproject.databinding.ActivityMainBinding
import com.example.testproject.databinding.FragmentBasicBinding

class MainActivity : AppCompatActivity() {

    lateinit var basicFragment : BasicFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.bindingtest.text = "successfully!"

        supportFragmentManager.beginTransaction().replace(R.id.fragment_location,BasicFragment()).commit()

        setContentView(binding.root)
    }
}