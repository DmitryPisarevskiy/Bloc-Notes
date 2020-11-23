package com.dmitry.pisarevskiy.bloc_notes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.dmitry.pisarevskiy.bloc_notes.R

class FirstFragment : Fragment() {
    private var tvTest:TextView? = null

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.button_first).setOnClickListener {
            NavHostFragment.findNavController(this@FirstFragment)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        view.findViewById<View>(R.id.button_test).setOnClickListener {
            tvTest = view.findViewById(R.id.textview_first)
            tvTest?.setText(getString(R.string.testHello))
        }
    }
}