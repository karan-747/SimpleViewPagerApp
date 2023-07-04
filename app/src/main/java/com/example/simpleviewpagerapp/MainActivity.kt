package com.example.simpleviewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.simpleviewpagerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val myAdapter = ViewPagerFragmentAdapter(this)

        binding.viewPager.apply {
            adapter = myAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            //orientation = ViewPager2.ORIENTATION_VERTICAL
            //onFocusChangeListener


        }

        binding.viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                resetPositionIndicator()
                when(position){
                    0->{
                        binding.cv0.setCardBackgroundColor(resources.getColor(R.color.selected))
                    }
                    1->{
                        binding.cv1.setCardBackgroundColor(resources.getColor(R.color.selected))
                    }
                    2->{
                        binding.cv2.setCardBackgroundColor(resources.getColor(R.color.selected))
                    }
                }


            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
        })

    }

    private fun resetPositionIndicator() {
        binding.cv0.setCardBackgroundColor(resources.getColor(R.color.not_selected))
        binding.cv1.setCardBackgroundColor(resources.getColor(R.color.not_selected))
        binding.cv2.setCardBackgroundColor(resources.getColor(R.color.not_selected))
    }
}


