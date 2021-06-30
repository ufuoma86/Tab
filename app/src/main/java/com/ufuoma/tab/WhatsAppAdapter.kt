package com.ufuoma.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ufuoma.tab.views.CallsFragment
import com.ufuoma.tab.views.ChatFragment
import com.ufuoma.tab.views.StatusFragment

class WhatsAppAdapter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Chatsufuoma"
            1 -> return "Statusufuoma"
            2 -> return "Callsufuoma"
            else -> return "Chats"
        }
    }
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatFragment()
            1 -> return StatusFragment()
            2 -> return CallsFragment()
            else -> return ChatFragment()
        }
    }
}