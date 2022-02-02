package com.catnip.fragmentexample.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catnip.fragmentexample.R
import com.catnip.fragmentexample.databinding.FragmentOneBinding

class FragmentOne(private val listener: MainActivityListener) : Fragment() {

    private lateinit var binding : FragmentOneBinding
    private var counter  = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTriggerAction.setOnClickListener {
            counter++
            listener.onShowToastClickListener("Halo this is From Fragment $counter")
        }

    }

}