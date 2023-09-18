package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val url = "https://www.best4webdesign.com/wp-content/uploads/2018/04/glide-js-a-dependency-free-javascript-es6-slider-and-carousel.png"
            val imagePath = binding.imageView

            Glide.with(this)
                .load(url)
                .into(imagePath)

        }
    }
}