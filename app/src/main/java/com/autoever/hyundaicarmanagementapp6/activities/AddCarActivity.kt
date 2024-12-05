package com.autoever.hyundaicarmanagementapp6.activities

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.autoever.hyundaicarmanagementapp6.R

class AddCarActivity : AppCompatActivity() {
    val carModels = listOf(
        "Sonata",
        "Grandeur",
        "Elantra",
        "Accent",
        "Genesis",
        "Tucson",
        "Santa Fe",
        "Palisade",
        "Kona",
        "Venue",
        "Ioniq 5",
        "Ioniq 6",
        "Kona Electric",
        "Ioniq Electric",
        "Sonata Hybrid",
        "Tucson Hybrid",
        "Santa Fe Hybrid",
        "Porter II",
        "Starex",
        "Staria"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_car)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val spinner: Spinner = findViewById(R.id.spinner)

        val adapter = ArrayAdapter(
            this,
            R.layout.spinner_item,
            carModels
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
    }
}