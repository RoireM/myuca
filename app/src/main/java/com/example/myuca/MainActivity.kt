package com.example.myuca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myuca.databinding.ActivityMainBinding

private val MainActivity.ActivityMainBinding.root: Any
    get() {
        TODO("Not yet implemented")
    }

private fun MainActivity.ActivityMainBinding.Companion.inflate(layoutInflater: LayoutInflater): MainActivity.ActivityMainBinding {
    TODO("Not yet implemented")
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    class ActivityMainBinding {
        companion object

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}