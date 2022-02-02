package com.catnip.fragmentexample.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catnip.fragmentexample.R
import com.catnip.fragmentexample.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding : FragmentTwoBinding
    private var productId: Int = 0
    private lateinit var productName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            productId = it.getInt(ARG_ID_PRODUCT)
            productName = it.getString(ARG_NAME_PRODUCT).orEmpty()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
        private const val ARG_ID_PRODUCT = "ARG_ID_PRODUCT"
        private const val ARG_NAME_PRODUCT = "ARG_NAME_PRODUCT"
        @JvmStatic
        fun newInstance(productId: Int, productName: String) =
            FragmentTwo().apply {
                arguments = Bundle().apply {
                    putInt(ARG_ID_PRODUCT, productId)
                    putString(ARG_NAME_PRODUCT, productName)
                }
            }
    }
}