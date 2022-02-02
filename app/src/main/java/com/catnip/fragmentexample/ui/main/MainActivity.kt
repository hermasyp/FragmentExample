package com.catnip.fragmentexample.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.catnip.fragmentexample.R
import com.catnip.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),MainActivityListener{

    private lateinit var binding: ActivityMainBinding

    //instance of fragment
    private val fragmentOne = FragmentOne(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showFragment()
    }

    private fun showFragment(){
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().apply {
            add(R.id.container_fragment,fragmentOne)
            commit()
        }
    }

    private fun showToast(msg : String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onShowToastClickListener(msg: String) {
        showToast(msg)
    }

}

interface MainActivityListener{
    fun onShowToastClickListener(msg: String)
}
