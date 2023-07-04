package com.example.simpleviewpagerapp

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.simpleviewpagerapp.viewpagerfragments.FragmentA
import com.example.simpleviewpagerapp.viewpagerfragments.FragmentB
import com.example.simpleviewpagerapp.viewpagerfragments.FragmentC

class ViewPagerFragmentAdapter(val hostActivity: MainActivity):FragmentStateAdapter(hostActivity) {

    private val FRAGMENTS_COUNT = 3




    override fun getItemCount(): Int {
        return FRAGMENTS_COUNT
    }

    override fun createFragment(position: Int): Fragment {

        when(position){

            0->{
                return  FragmentA()
            }
            1->{
                return  FragmentB()
            }
            2->{
                return  FragmentC()
            }
            else->{
                return  FragmentA()
            }
        }
    }



}