package com.autoever.hyundaicarmanagementapp6.fragments

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.autoever.hyundaicarmanagementapp6.R

class HomeFragment : Fragment() {
    private var isPowerOn = false
    private var isDoorOpen = false

    private lateinit var imageViewPower: ImageView
    private lateinit var textViewPower: TextView
    private lateinit var imageViewLock: ImageView
    private lateinit var imageViewUnlock: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        imageViewPower = view.findViewById(R.id.imageViewPower)
        textViewPower = view.findViewById(R.id.textViewPower)
        imageViewLock = view.findViewById(R.id.imageViewLock)
        imageViewUnlock = view.findViewById(R.id.imageViewUnlock)


        togglePowerState()

        imageViewPower.setOnClickListener {
            isPowerOn = !isPowerOn
            togglePowerState()
        }

        imageViewLock.setOnClickListener {
            closeDoor()
            isDoorOpen = false
        }

        imageViewUnlock.setOnClickListener {
            openDoor()
            isDoorOpen = true
        }

        return view
    }

    private fun togglePowerState() {
        if (isPowerOn) {
            imageViewPower.imageTintList = ColorStateList.valueOf(Color.parseColor("#2196F3")) // 파란색
            textViewPower.text = "시동 끄기"
        } else {
            imageViewPower.imageTintList = ColorStateList.valueOf(Color.parseColor("#BDBDBD")) // 회색
            textViewPower.text = "시동 켜기"
        }
    }

    private fun openDoor() {
        if (!isDoorOpen) {
            imageViewLock.imageTintList = ColorStateList.valueOf(Color.parseColor("#BDBDBD"))
            imageViewUnlock.imageTintList = ColorStateList.valueOf(Color.BLACK)
        }
    }

    private fun closeDoor() {
        if (isDoorOpen) {
            imageViewLock.imageTintList = ColorStateList.valueOf(Color.BLACK)
            imageViewUnlock.imageTintList = ColorStateList.valueOf(Color.parseColor("#BDBDBD"))
        }
    }
}