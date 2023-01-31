package com.kseniabl.tagsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kseniabl.tagsview.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTags()
    }

    private fun setTags() {
        binding.tagsView.tags = arrayListOf(TagsModel("Apple"), TagsModel("Banana"), TagsModel("Pizza"), TagsModel("Pine"),
            TagsModel("Plum"), TagsModel("Orange"), TagsModel("Tomato"),
            TagsModel("Fish"), TagsModel("Spaghetti"), TagsModel("Soup"), TagsModel("Meat"))
    }
}