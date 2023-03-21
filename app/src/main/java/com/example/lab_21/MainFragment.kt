package com.example.lab_21

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab_21.databinding.ActivityMainBinding
import com.example.lab_21.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    // Initialize viewbinding
    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


         // Setup ViewBinding
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        // ID
        val btnAbout = binding.btnAbout
        val btnFunc = binding.btnFunc
        val btnNews = binding.btnNews


        // onClick
        btnAbout.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_aboutFragment)
        }

        btnFunc.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_funcFragment)
        }

        btnNews.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_newsletterFragment)
        }

        return view
    }





}